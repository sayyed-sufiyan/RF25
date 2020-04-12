package QSP;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class P12 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sufiy/Desktop/a.html");
driver.findElement(By.xpath("./html/body/div[1]/a[1]")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.xpath("./html/body/div[1]/a[2]")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.xpath("./html/body/div[2]/a[1]")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.findElement(By.xpath("./html/body/div[2]/a[2]")).click();
Thread.sleep(2000);
driver.navigate().back();
driver.manage().deleteAllCookies();
// (//span [text()= 'All Staff'] [1] )[2]
driver.quit();
	}

}
