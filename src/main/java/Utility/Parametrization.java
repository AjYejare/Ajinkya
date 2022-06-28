package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String ExcelSheet(int row,int cell) throws IOException {
		
		FileInputStream file = new FileInputStream("F:\\Automation\\testing\\src\\lecture\\KiteZerodha\\src\\test\\resources\\Automation Project.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
