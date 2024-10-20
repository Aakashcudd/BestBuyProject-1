package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;


public class CheckOutpage extends Utility {
	
	//create a webdriver variable
	public WebDriver driver;
	
	//Initialize the pageFactory to init method
	public CheckOutpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locate an elements
	
	@FindBy(id="fld-e")
	WebElement emailoSignInAtCheckOut;
	
	@FindBy(id="fld-p1")
	WebElement passToSignInAtCheckOut;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement submitSigInAtCheckOut;
	
	@FindBy(xpath="//button[text()='Continue as Guest']")
	WebElement continueAsGuest;
	
	@FindBy(id="user.emailAddress")
	WebElement emailAtCheckOut;
	
	@FindBy(id="user.phone")
	WebElement mobileNumAtCheckOut;
	
	@FindBy(xpath="//input[@id='text-updates']")
	WebElement textUpdateCheckBox;
	
	@FindBy(xpath="//span[text()='Continue to Payment Information']")
	WebElement continueToPayement;
	
	@FindBy(xpath="//input[@id='number']")
	WebElement debitCardNumber;
	
	@FindBy(id="expMonth")
	WebElement expMonth;
	
	@FindBy(id="expYear")
	WebElement expYear;
	
	@FindBy(id="cvv")
	WebElement cvvfield;
	
	@FindBy(id="save-to-profile")
	WebElement saveToProfile;
	
	@FindBy(id="first-name")
	WebElement firstNamefield;
	
	@FindBy(id="last-name")
	WebElement lastNamefield;
	
	@FindBy(xpath="//button[text()='Hide Suggestions']")
	WebElement hideSuggestion;
	
	@FindBy(id="address-input")
	WebElement addressfield;
	
	@FindBy(id="//button[text()='Edit this address']")
	WebElement editThisAddressfield;
	
	@FindBy(id="//button[text()='Add a new address']")
	WebElement addNewAddressfield;
	
	@FindBy(id="city")
	WebElement cityfield;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="postalCode")
	WebElement postalCodefield;
	
	@FindBy(xpath="//span[text()='Place Your Order']")
	WebElement placeYourOrder;
	
	@FindBy(xpath="//p[text()='Please enter a valid card number.']")
	WebElement inValidCardMsg;
	
	@FindBy(xpath="//p[text()='Please enter a valid card number.']")
	WebElement sryMsgAfterSignInB4CheckOut;
	
	@FindBy(xpath="//span[text()='Sorry, there was a problem. Please try that again.']")
	WebElement sryMsgWitOutSignInB4CheckOut;
	
	
	public void contactInfoAtCheckOut(String emailCheckOut,String mobileNumCheckOut) throws Exception {
		continueAsGuest.click();
		emailAtCheckOut.sendKeys(emailCheckOut);
		mobileNumAtCheckOut.sendKeys(mobileNumCheckOut);
		waitforElementTobeClickable(textUpdateCheckBox, 5000);
		textUpdateCheckBox.click();
		continueToPayement.click();
	}
	public void checkout_signin() {
		textUpdateCheckBox.click();
		continueToPayement.click();
	}
	public void enterDetailsOnCheckOut(String debitCardNo,String expMonthVisibleText,String expYearVisibleText,String cvv,String firstName,String lastName, 
			String address, String city, String stateVisibleText, String postalCode){
		debitCardNumber.sendKeys(debitCardNo);
		selectFromDropDown(expMonth, expMonthVisibleText);
		selectFromDropDown(expYear, expYearVisibleText);
		cvvfield.sendKeys(cvv);
		firstNamefield.sendKeys(firstName);
		lastNamefield.sendKeys(lastName);
		addressfield.sendKeys(address);
		cityfield.sendKeys(city);
		selectFromDropDown(state, stateVisibleText);
		postalCodefield.sendKeys(postalCode);
		placeYourOrder.click();

	}
	
	public void signInAtCheckOut() {
		emailoSignInAtCheckOut.sendKeys("sundarselvamuthu1@gmail.com");
		passToSignInAtCheckOut.sendKeys("sundar@1512");
		submitSigInAtCheckOut.click();
		emailAtCheckOut.sendKeys("sundarselvamuthu1@gmail.com");
		mobileNumAtCheckOut.sendKeys("8940271319");
		textUpdateCheckBox.click();
		continueToPayement.click();

	}
}