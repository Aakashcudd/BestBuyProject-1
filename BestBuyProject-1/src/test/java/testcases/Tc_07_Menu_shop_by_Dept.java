package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Locatepage;
import pageobject.Productpage;


public class Tc_07_Menu_shop_by_Dept extends Baseclass{
	
	@Test(priority=8)
	public void SelAddItemShopByDeptMenu() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.selectTvMenuInHomePage();
		Productpage pp = new Productpage(driver);
		pp.addSony75InchTVInProdPage();
		hp.goToCartPage();
		Thread.sleep(2000);
		
	   }
}