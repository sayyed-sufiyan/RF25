package QSP;
import java.io.File;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sufiy/Desktop/files/Fileupload.html");
		File f=new File("./certify.docx");
		String absolutePath=f.getAbsolutePath();
		System.out.println(absolutePath);
		Thread.sleep(2000);
		WebElement browsebutton=driver.findElement(By.id("s1"));
		browsebutton.sendKeys(absolutePath);
		Thread.sleep(2000);
		driver.close();
	}

}
