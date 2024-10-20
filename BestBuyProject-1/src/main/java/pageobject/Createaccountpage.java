package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Createaccountpage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Createaccountpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//locate on elements

	@FindBy(id="firstName")
	WebElement firstName;

	@FindBy(id="lastName")
	WebElement lastName;

	@FindBy(id="email")
	WebElement emailid;

	@FindBy(id="fld-p1")
	WebElement password;

	@FindBy(id="reenterPassword")
	WebElement confirmPassword;

	@FindBy(id="phone")
	WebElement mobileNumber;

	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement creatAnAccount;

	@FindBy(id="//*[text()='Sign Up with Google']")
	WebElement googleSignUp;


	public void getfirstname(String firstname){
		firstName.sendKeys(firstname);

	}
	public void getlastname(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void getemail (String email) {
		emailid.sendKeys(email);
	}
	public void getpassword (String pswd) {
		password.sendKeys(pswd);
	}
	public void getconfirmpassword (String pswd) {
		confirmPassword.sendKeys(pswd);
	}
	public void getmobileNo (String mobno) {
		mobileNumber.sendKeys(mobno);
	}
	public void clickcreateACbtn() {
		creatAnAccount.click();
	}
	public void clickgooglesignupbtn() {
		googleSignUp.click();
	}
	public String verify (String textXpath) {
		String actMsg=driver.findElement(By.xpath(""+textXpath+"")).getText();
		return actMsg;
	}
}