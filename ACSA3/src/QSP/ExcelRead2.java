package QSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelRead2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		String path="./Data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String un=wb.getSheet("sheet1").getRow(4).getCell(0).toString();
		String pw=wb.getSheet("sheet1").getRow(4).getCell(1).toString();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
		SATE s1=new SATE(driver);
		s1.setUsername(un);
		Thread.sleep(2000);
		s1.setPassword(pw);
		Thread.sleep(2000);
		s1.clickLogin();
		Thread.sleep(10000);
		driver.close();
	}

}
