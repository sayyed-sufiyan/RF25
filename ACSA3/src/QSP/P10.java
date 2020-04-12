package QSP;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class P10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.Actitime.com/login.do");
		WebElement untb=driver.findElement(By.cssSelector("input[name='username']"));
		untb.sendKeys("abcd");
		Thread.sleep(2000);
		WebElement pwtb=driver.findElement(By.cssSelector("input[name='pwd']"));
		pwtb.sendKeys("67890");
		Thread.sleep(2000);
		WebElement loginbtn=driver.findElement(By.cssSelector("inputa[id='loginButton']"));
		loginbtn.click();
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.cssSelector("span[class='errormsg']"));
		System.out.println(errormsg.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
