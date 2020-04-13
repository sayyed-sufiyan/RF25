package QSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./Data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String v=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
		String w=wb.getSheet("sheet1").getRow(0).getCell(1).toString();
		System.out.println(w);
		String x=wb.getSheet("sheet1").getRow(4).getCell(0).toString();
		System.out.println(x);
		String y=wb.getSheet("sheet1").getRow(4).getCell(1).toString();
		System.out.println(y);
	}

}
