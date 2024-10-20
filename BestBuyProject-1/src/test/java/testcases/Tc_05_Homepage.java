package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Locatepage;



public class Tc_05_Homepage extends Baseclass{
	
	@BeforeTest
	public void setup() {
		
		sheetname="MenuData";
	}
	
	@Test(dataProvider="Testdata", priority=5)
	public void CheckTitleOfAllMenu(String menuName,String expTitle) throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.menuValidation(menuName);
		softAssert(menuName, expTitle);
		

}
	
	@Test(priority=6)
	public void validate_BottomLink_HomePage() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		String actTitle = hp.validateTermsAndCondtionLink();
		String expTitle="BestBuy.com Terms and Conditions";
		
		Assert.assertEquals(actTitle, expTitle);
		if(actTitle.equals(expTitle)) {
			System.out.println("Validate bottom link is Pass");
		}else {
			System.out.println("Validate bottom link is Fail");
		}

	}
}
	