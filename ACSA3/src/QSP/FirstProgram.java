package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();		
		Thread.sleep(3000);
		driver.close();
	}

}
