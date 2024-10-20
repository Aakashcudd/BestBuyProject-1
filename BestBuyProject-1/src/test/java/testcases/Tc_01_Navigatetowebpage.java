package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Locatepage;



public class Tc_01_Navigatetowebpage extends Baseclass{
	
	@Test(priority=1)
	public void NavigatingToBestBestApp() throws Exception {
		Locatepage locpage=new Locatepage(driver);
		locpage.AtUSA();
		String actTitle = locpage.bestBuyPageTitle(getPageTitle());
		String expTitle="Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(actTitle, expTitle);

}
}