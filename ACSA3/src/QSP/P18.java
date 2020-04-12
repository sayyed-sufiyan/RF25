package QSP;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class P18 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http://cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("ban");
		Thread.sleep(5000);
		List<WebElement> autosuggs=driver.findElements(By.xpath("//a[contains(.,'Ban')]"));
		System.out.println(autosuggs.size());
		for(int i=0;i<autosuggs.size();i++) {
			System.out.println(autosuggs.get(i).getText());
		}
		Thread.sleep(2000);
		autosuggs.get(1).click();
		Thread.sleep(2000);
		driver.close();
	}

}
