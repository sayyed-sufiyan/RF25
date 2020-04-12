package Testng;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
	@Test
	public void testA() {
		SoftAssert s=new SoftAssert();
		Reporter.log("test A",true);
		s.assertEquals("abc", "xyz");
		Reporter.log("end test A",true);
		s.assertAll();
	}@Test
	public void testB() {
		Reporter.log("test B",true);
		Reporter.log("end test B",true);
	}

}
