package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVtiger {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		VtigerPom v1=new VtigerPom(driver);
		v1.setUsn("admin");
		Thread.sleep(2000);
		v1.setPwd("admin");
		Thread.sleep(2000);
		v1.clickSignin();
		Thread.sleep(2000);
		driver.close();
		
	}

}
