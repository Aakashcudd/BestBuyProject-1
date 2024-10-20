package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;



public class Productpage extends Utility{
	
	//create a webdriver variable
			public WebDriver driver;
			
			//Initialize the pageFactory to init method
			public Productpage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath="(//button[contains(@type,'button')][normalize-space()='Add to Cart'])[1]")
	WebElement addToCartLogitechMouse;
	
	@FindBy(xpath="//a[text()='Go to Cart']")
	WebElement goToCartButton;
	
	@FindBy(xpath="//button[text()='Continue shopping']")
	WebElement continueShoping;
	
	@FindBy(xpath="(//div[contains(@role,'none')])[1]")
	WebElement logitechMouseAtProductPage;
	
	@FindBy(xpath="(//a[contains(text(),'Logitech - PRO X SUPERLIGHT Lightweight Wireless O')])[1]")
	WebElement logitechMouseTextAtProductPage;
	
	@FindBy(xpath="//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']")
	WebElement addToCartTv;
	
	@FindBy(xpath="//h1[contains(text(),'Sony - 75')]")
	WebElement sony75InchTvHeading;
	
	@FindBy(xpath="//a[contains(text(),'Sony - 75')]")
	WebElement sony75InchTv;
	
	@FindBy(xpath="//a[normalize-space()='LG refrigerators']")
	WebElement LGrefrigeratorAtLGPage;
	
	@FindBy(xpath="//a[contains(text(),'LG - 25.5 Cu. Ft. Bottom-Freezer Refrigerator with')]")
	WebElement LGrefrigeratorAtProdPage;
	
	@FindBy(xpath="//button[normalize-space()='Add to Cart']")
	WebElement addToCartLGrefrigerator;
	
		
	public String addLogitechMouse() throws Exception {
		String logiTechTitleAtProdPage = extractText(logitechMouseTextAtProductPage);
		addToCartLogitechMouse.click();
		waitforElementTobeClickable(goToCartButton, 5000);
		goToCartButton.click();
		return logiTechTitleAtProdPage;
	}
	
	public String addSony75InchTVInProdPage() {
		sony75InchTv.click();
		String sony75TitleAtProdPage = extractText(sony75InchTvHeading);
		sony75InchTvHeading.getText();
		addToCartTv.click();
		return sony75TitleAtProdPage;
	}
	
	public String addLGInProdPage() {
		LGrefrigeratorAtLGPage.click();
		String LGFridgeAtProdPage = extractText(LGrefrigeratorAtProdPage);
		LGrefrigeratorAtProdPage.click();
		waitExplicit(addToCartLGrefrigerator);
		addToCartLGrefrigerator.click();
		return LGFridgeAtProdPage;
	}
}