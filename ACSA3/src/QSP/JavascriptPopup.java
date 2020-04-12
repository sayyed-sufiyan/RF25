package QSP;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavascriptPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://stagenget.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("abcd");
		driver.findElement(By.className("loginPassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		Thread.sleep(3000);
		driver.close();
	}

}
