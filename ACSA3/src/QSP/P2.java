package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}
	public static void main(String[] args) throws InterruptedException {
		int i=0;
		while(i<=3)	{
			i++;
			ChromeDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("http://www.google.com");
			String title=driver.getTitle();
			System.out.println(title);
			System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getPageSource());
			driver.switchTo().activeElement().sendKeys("abcdefghijklmnopqrstuvwxyz");
			driver.manage().window().maximize();
			driver.get("http://www.gmail.com");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			driver.navigate().to("http://www.naukri.com");
			driver.close();
			driver.quit();
		}
		}
}
