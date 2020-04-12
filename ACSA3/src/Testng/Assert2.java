package Testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}WebDriver driver;
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
	}
	@Test
	public void testTitle() throws IOException, InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		Thread.sleep(2000);
		WebElement err=driver.findElement(By.xpath(" (//span[@class='errormsg'])[1]"));
		String message=err.getText();
		if(err.isDisplayed()) {
			Reporter.log(message,true);
			Reporter.log("test is failed",true);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
		    File des=new File("./photo/s3.png");
		    FileUtils.copyFile(src, des);
			Assert.fail(); 
		}
		else {
			driver.findElement(By.linkText("Logout")).click();
		}
}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
