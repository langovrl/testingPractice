package SeleniumPractice.Learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public void launchBrowser()  throws InterruptedException {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\One\\Downloads\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   
	}
	
	public String[] getLogin(int number) throws IOException {
		// File stream
		File fis = new File(System.getProperty("user.dir") + "//" + "TestData.xlsx");
		FileInputStream fiis = new FileInputStream(fis);
		// WorkBook
		XSSFWorkbook wrkbk = new XSSFWorkbook(fiis);
		// Sheet
		XSSFSheet sheet = wrkbk.getSheetAt(0);
		//
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		DataFormatter formatter = new DataFormatter(); // creating formatter using the default locale
		return new String[] {formatter.formatCellValue(sheet.getRow(number).getCell(1)), formatter.formatCellValue(sheet.getRow(number).getCell(2))};
		// loop
/*		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(formatter.formatCellValue(sheet.getRow(i).getCell(j)) + "|| ");
			}
			System.out.println();
		}
		System.out.print(formatter.formatCellValue(sheet.getRow(2).getCell(1)) + "|| ");*/
	}

}
