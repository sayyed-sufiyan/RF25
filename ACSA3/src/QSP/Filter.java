package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='container_reports']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Create Chart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen242\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
