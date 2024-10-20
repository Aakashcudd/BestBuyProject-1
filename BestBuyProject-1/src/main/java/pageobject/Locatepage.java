package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;



public class Locatepage extends Utility{
	

	//create a webdriver variable
		public WebDriver driver;
		
		//Initialize the pageFactory to init method
		public Locatepage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(className="us-link")
	WebElement countryUSA;
	
	@FindBy(className="canada-link")
	WebElement countryCanada;
	
	
	
	public void AtUSA() {
		
		countryUSA.click();
	}
	
	public void AtCanada() {
		
		countryCanada.click();
	}
	
	public String bestBuyPageTitle(String Title) throws Exception {
		 Title=driver.getTitle();
		 return Title;
	}
			
	public int urlResponseCode() throws Exception {
		return getResponseCode("https://www.bestbuy.com/");
	}
}