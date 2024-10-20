package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Locatepage;

public class Tc_02_Verify_LinkBroken extends Baseclass{
	
	@Test(priority=2)
	public void ValidateUrlIsNotBroken() throws Exception {
		Locatepage lp=new Locatepage(driver);
		if(lp.urlResponseCode()==200) {
			System.out.println("Link is Not Broken");
		}else {
			System.out.println("Link is Broken");
		}
		Assert.assertTrue(lp.urlResponseCode()==200);
	}
}