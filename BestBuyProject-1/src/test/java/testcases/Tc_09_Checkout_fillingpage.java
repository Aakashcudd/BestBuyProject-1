package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Cartpage;
import pageobject.CheckOutpage;
import pageobject.Homepage;
import pageobject.Locatepage;
import pageobject.Productpage;


public class Tc_09_Checkout_fillingpage extends Baseclass{
	
	@Test(priority=10)
	public void CheckOutPageFillingas_using_guest() throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Homepage hp=new Homepage(driver);
		hp.searchProduct("Mouse");
		Thread.sleep(6000);
		Productpage pp = new Productpage(driver);		
		pp.addLogitechMouse();
		Thread.sleep(3000);
		Cartpage cp=new Cartpage(driver);
		cp.goToCheckOutPage();
		CheckOutpage cop=new CheckOutpage(driver);
		cop.contactInfoAtCheckOut("dummytest1234@gmail.com", "8940271319");
		Thread.sleep(3000);
		//For the Dummy payment details
		//I'm not using this line no-32,because of im using dummy id its required password to further process of page.
		//cop.enterDetailsOnCheckOut("458245478900128", "03", "2024", "1234", "Automation", "Test", "2 1 Chruch Ct", "Louisvalle", "Tz", "87414");
		
	}
	
}