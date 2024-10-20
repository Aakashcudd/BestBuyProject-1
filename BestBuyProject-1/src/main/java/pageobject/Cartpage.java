package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;



public class Cartpage extends Utility{
	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Cartpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//Locating web Elements
	@FindBy(xpath="//a[@id='cart-4db8lmd4bine6-4chvok7vewbaa']")
	WebElement logitechMouseAddedInCart;

	@FindBy(xpath="//a[@id='cart-3ykluzq4iw1ke-4ne8ip9w0gfzz']")
	WebElement sony75InchTvAddedInCart;

	@FindBy(xpath="//a[@class='c-button-link go-to-cart']")
	WebElement gotocart;

	@FindBy(xpath="//a[contains(text(),'Lenovo - ThinkPad E15')]")
	WebElement lenovoThinkPadAddedInCart;

	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOutInCart;


	
	public String validateLogitechMouseInCart() {
		return extractText(logitechMouseAddedInCart);
	}

	public String validateSonyTvInCart() {
		return sony75InchTvAddedInCart.getText();

	}

	public String validateLenovoThinkPadInCart() {
		return extractText(lenovoThinkPadAddedInCart);
	}

	public void gotocart() {
		gotocart.click();
	}

	public void goToCheckOutPage() {
		checkOutInCart.click();
	}

}