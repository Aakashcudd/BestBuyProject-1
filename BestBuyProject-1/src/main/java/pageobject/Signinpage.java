package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Signinpage extends Utility{
	
	//create a webdriver variable
			public WebDriver driver;
			
			//Initialize the pageFactory to init method
			public Signinpage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
	
	@FindBy(id="fld-e")
	WebElement email;
	
	@FindBy(id="fld-p1")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement signInButton;
	
	@FindBy(xpath="//a[text()='Visit our homepage']")
	WebElement goToHomePage;
	
	public void signin(String emailid, String pass){
		email.sendKeys(emailid);
		password.sendKeys(pass);
		signInButton.click();
	}
	


}