package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sufiy/Desktop/files/ExecuteScript.html");
		Thread.sleep(3000);
		driver.findElement(By.id("t1")).sendKeys("abcd");
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('t2').value='12345'");
		Thread.sleep(2000);
		jse.executeScript("alert('hi')");
		driver.switchTo().alert().accept();
		//driver.close();
	}

}
