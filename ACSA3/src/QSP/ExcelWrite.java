package QSP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWrite {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./Data/Book1.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		String v=wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(v);
		wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("QSPIDERS");
		wb.write(new FileOutputStream(path));
		wb.close();
	}

}
