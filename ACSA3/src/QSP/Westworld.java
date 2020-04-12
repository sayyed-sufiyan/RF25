package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Westworld {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.techpook.com/1179");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"post-1179\"]/div/div[2]/p[9]/a/strong")).click();   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"download_link\"]/div/a/div")).click();                
		

	}

}
