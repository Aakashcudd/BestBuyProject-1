package pageobject;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Homepage extends Utility{
	//create a webdriver variable
			public WebDriver driver;
			
			//Initialize the pageFactory to init method
			public Homepage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
	//locate an element
			
	@FindBy(xpath = "//a[normalize-space()='Top Deals']")
	WebElement topDealsMenu;

	@FindBy(xpath = "//a[normalize-space()='Deal of the Day']")
	WebElement dealsOfTheDayMenu;

	@FindBy(xpath = "//a[@class='bottom-left-links '][normalize-space()='My Best Buy Memberships']")
	WebElement BestbuyMembershipMenu;

	@FindBy(xpath = "//span[text()='More']")
	WebElement moreMenu;

	@FindBy(xpath = "//a[@class='utility-menu-flyout-list-item'][normalize-space()='Credit Cards']")
	WebElement creditCardsMenu;

	@FindBy(xpath = "//a[@class='utility-menu-flyout-list-item'][normalize-space()='Gift Cards']")
	WebElement giftCardsMenu;

	@FindBy(xpath = "//a[@class='utility-menu-flyout-list-item'][normalize-space()='Gift Ideas']")
	WebElement giftIdeasMenu;
	
	@FindBy(xpath="//a[@class='universal-nav-link'][normalize-space()='Yardbird']")
	WebElement Yardbirdmenu;

	@FindBy(xpath = "//a[normalize-space()='Best Buy Outlet']")
	WebElement bestBuyOutletMenu;

	@FindBy(xpath = "//a[@class='universal-nav-link'][normalize-space()='Best Buy Business']")
	WebElement bestBuyBusinessMenu;

	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;

	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signIn;

	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createAccount;

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menuButton;

	@FindBy(xpath = "//button[@data-lid='ubr_tv']")
	WebElement tvInMenu;

	@FindBy(xpath = "//button[text()='TVs by Brand']")
	WebElement tvsByBrandInnerMenu;

	@FindBy(xpath = "//a[text()='Sony TVs']")
	WebElement sonyTvsInnerMenu2;

	@FindBy(id = "gh-search-input")
	WebElement searchBox;

	@FindBy(xpath = "//button[@title='submit search']")
	WebElement searchButton;

	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cartButton;

	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brandsInMenu;
	
	@FindBy(xpath = "//a[normalize-space()='LG']")
	WebElement LGinBrandsMenu;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termsAndCondLink;

	

	public void goToCreatAccount() {
		
		account.click();
		createAccount.click();
	}

	public void goToSignIn() {
		
		account.click();
		signIn.click();
	}

	public void openMenu() {
		menuButton.click();
	}

	

	public void searchProduct(String productName) {
		
		searchBox.sendKeys(productName);
		searchButton.click();
	}

	public void selectTvMenuInHomePage() {

		menuButton.click();
		waitExplicit(tvInMenu);
		tvInMenu.click();
		waitExplicit(tvsByBrandInnerMenu);
		tvsByBrandInnerMenu.click();
		waitforElementTobeClickable(sonyTvsInnerMenu2, 5000);
		sonyTvsInnerMenu2.click();
	}

	public void goToCartPage() {
	
		cartButton.click();
	}

	public void selectLGBrand() {

		menuButton.click();
		brandsInMenu.click();
		LGinBrandsMenu.click();
	}
	
	public List<String> brokenLinkFinder() throws Exception {
		List<WebElement> elements = driver.findElements(By.xpath("//footer//a"));
		int brokenLinkCount = 0;
		List<String> brokenLinks = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			String links = elements.get(i).getAttribute("href");
			int responseCode = getResponseCode(links);
			if (responseCode >= 400) {
				brokenLinkCount++;
				brokenLinks.add(links);
			}
		}
		System.out.println(brokenLinkCount);
		return brokenLinks;
	}

	
	public String menuValidation(String menuName) {
		if (menuName.equalsIgnoreCase("Best Buy for Business - Best Buy")) {
			clickOn(driver.findElement(By.xpath("//li[@class='liDropdownList']//a[text()='" + menuName + "']")));
			String actTitle = getPageTitle();
			return actTitle;
		} else {
			clickOn(driver.findElement(By.xpath("//a[text()='" + menuName + "']")));
			String actTitle = getPageTitle();
			return actTitle;
		}
	}
	public String validateTermsAndCondtionLink() {
		termsAndCondLink.click();
		String actTitle = getPageTitle();
		return actTitle;
	}
}