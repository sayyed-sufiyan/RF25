package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P1 {
	@AfterMethod
	public void carrot() {
		
		Reporter.log("from carrot after method",false);//won't print in console but in report
	}
	@BeforeMethod
public void brinjal() {
		
		Reporter.log("from brinjal after method",true);
	}
	@Test
public void apple() {
	
		Reporter.log("from apple",true);
}
	@Test
	public void cat() {
		
			Reporter.log("from cat",true);
	}

}
