package QSP;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().deleteAllCookies();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		WebElement errmsg = driver.findElement(By.cssSelector("span[class='errormsg']"));
		System.out.println(errmsg.getText());
		driver.close();
	}

}
