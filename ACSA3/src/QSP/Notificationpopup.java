package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("8660281165");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Nikki@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();  //
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Log out'])")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
