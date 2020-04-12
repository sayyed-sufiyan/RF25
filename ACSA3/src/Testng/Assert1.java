package Testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
WebDriver driver;
@BeforeMethod
public void openApp() {
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
}
@Test
public void testTitle() throws IOException {
	String expectedTitle="Google";
	String actualTitle=driver.getTitle();
	//Assert.assertEquals(actualTitle, expectedTitle);
	if(expectedTitle.equals(actualTitle)) {
		Reporter.log("test is passed",true);
	}
	else {
		Reporter.log("test is failed",true);
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File src=ts.getScreenshotAs(OutputType.FILE);
	    File des=new File("./photo/s2.png");
	    FileUtils.copyFile(src, des);
		Assert.fail();  //to get red highlight on report that is failed
	}
}
@AfterMethod
public void closeApp() {
	driver.close();
}
}
