package QSP;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sufiy/Desktop/files/L2.html");
		Thread.sleep(2000);
		WebElement L2pagetb=driver.findElement(By.id("pwd"));
		L2pagetb.sendKeys("12345");
		WebElement L1frame=driver.findElement(By.id("f1"));
		driver.switchTo().frame(L1frame);
		WebElement L1pagetb=driver.findElement(By.id("usn"));
		L1pagetb.sendKeys("abcd");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		L2pagetb.sendKeys("67890");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		L1pagetb.sendKeys("xyz");
		Thread.sleep(2000);
		driver.close();
	}

}
