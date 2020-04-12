package QSP;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Implicitexplicitwait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().deleteAllCookies();
		driver1.get("http://www.gmail.com");
		driver1.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver1.findElement(By.id("identifierId")).sendKeys("dhanapalrao0099");	
		driver1.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		driver1.close();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		String title1=driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.id("logoutLink")).click();
		String title3=driver.getTitle();
		System.out.println(title1);
		System.out.println(title3);
		if(title1.equals(title3))
			driver.close();
	}

}
