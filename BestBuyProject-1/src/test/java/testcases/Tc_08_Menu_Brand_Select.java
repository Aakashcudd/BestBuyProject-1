package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Locatepage;
import pageobject.Productpage;



public class Tc_08_Menu_Brand_Select extends Baseclass{
	
	@Test(priority=9)
	public void AddItemShopByBrandMenu() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.selectLGBrand();
		Productpage pp = new Productpage(driver);
		pp.addLGInProdPage();
		hp.goToCartPage();
		
	}
}
