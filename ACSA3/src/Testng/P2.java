package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P2 {
	WebDriver driver;
@BeforeMethod
public void openApp() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
}
@AfterMethod
public void closeApp() {
	driver.close();
}
@Test(priority=1,invocationCount=1)
public void googleTitle() {
	driver.get("http://www.google.com");
	Reporter.log("google page title is "+driver.getTitle(),true);
	
}
@Test
public void actiTitle() {
	driver.get("http://demo.actitime.com/login.do");
	Reporter.log("actitime page title is "+driver.getTitle(),true);
	
}
}
