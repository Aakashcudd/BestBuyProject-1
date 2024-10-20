package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utilities.Utility;

public class Baseclass extends Utility{

	//Methods for starting Browser

	@BeforeMethod
	public void startup() throws IOException {
		initializeDriver();

		//send the url
		driver.get(prop.getProperty("url"));

	}
	//Methods for closing Browser
	@AfterMethod
	public void close() {
		driver.quit();
	}

	@DataProvider(name="Testdata")
	// To get data from Excel
	public String[][] getfromexcel() throws IOException {
		String[][]data=Utility.getlogindata(sheetname);
		return data;
	}
}