package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Locatepage;
import pageobject.Productpage;



public class Tc_06_Search_additem extends Baseclass{
	
	@Test(priority=7)
	public void SearchAddItemInCart() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.searchProduct("Mouse");
		Productpage pp = new Productpage(driver);
		pp.addLogitechMouse();
		hp.goToCartPage();
		Thread.sleep(2000);
		
	}
}