package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Createaccountpage;
import pageobject.Homepage;
import pageobject.Locatepage;

public class Tc_03_CreateaccountpageTest extends Baseclass{
	
	@BeforeTest
	public void setup() {
		sheetname="CAData";
	}
	
	@Test(dataProvider="Testdata", priority=3)
	public void ValidateCreatAccountFunctionality(String fname, String lname, String emailId,
			String pass, String repass, String mob) throws Exception {
		Locatepage lp=new Locatepage(driver);
		lp.AtUSA();
		Thread.sleep(2000);
		Homepage hp=new Homepage(driver);
		hp.goToCreatAccount();
		Createaccountpage Cp=new Createaccountpage(driver);
		Cp.getfirstname(fname);
		Cp.getlastname(lname);
		Cp.getemail(emailId);
		Cp.getpassword(pass);
		Cp.getconfirmpassword(repass);
		Cp.getmobileNo(mob);
		Cp.clickcreateACbtn();
		Thread.sleep(3000);
		
				
}
}