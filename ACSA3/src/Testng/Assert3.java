package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert3 {
@Test
public void testA() {
	Reporter.log("test A",true);
	Assert.assertEquals("abc", "xyz");
	Reporter.log("end test A",true);
}
@Test
public void testB() {
	Reporter.log("test B",true);
	Reporter.log("end test B",true);
}

}
