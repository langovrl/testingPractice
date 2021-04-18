package learning.apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	 

	public static void main(String[] args) throws IOException{
		// File stream
		File fis = new File(System.getProperty("user.dir")+"//"+"TestData.xlsx"); 
		FileInputStream fiis = new FileInputStream(fis);
		// WorkBook
		XSSFWorkbook wrkbk = new XSSFWorkbook(fiis);
		// Sheet
		XSSFSheet sheet = wrkbk.getSheetAt(0);
		// 
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		 DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		  
		// loop
		for(int i=0; i<rowCount;i++) {
			for(int j =0;j<sheet.getRow(i).getLastCellNum();j++) {
				System.out.print(formatter.formatCellValue(sheet.getRow(i).getCell(j))+"|| ");
			}
			System.out.println();
		}
		System.out.print(formatter.formatCellValue(sheet.getRow(2).getCell(1))+"|| ");
	}
}
