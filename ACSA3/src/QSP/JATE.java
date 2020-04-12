package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JATE {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		SATE l1=new SATE(driver);
		l1.setUsername("abc");
		l1.setPassword("123");
		l1.clickLogin();
		Thread.sleep(3000);
		l1.setUsername("admin");
		l1.setPassword("manager");
		l1.clickLogin();
		Thread.sleep(3000);
		driver.close();

	}

}
