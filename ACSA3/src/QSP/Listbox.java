package QSP;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sufiy/Desktop/files/List.html");
		WebElement l1=driver.findElement(By.id("taj"));
		Thread.sleep(2000);
		Select taj=new Select(l1);
		taj.selectByVisibleText("misalpav");
		Thread.sleep(2000);
		taj.selectByIndex(0);
		Thread.sleep(2000);
		taj.selectByValue("d");
		Thread.sleep(2000);
		taj.selectByValue("b");
		Thread.sleep(2000);
		driver.close();
	}

}
