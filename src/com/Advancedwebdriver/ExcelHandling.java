package com.Advancedwebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {

	public static void main(String[] args) throws IOException {
		Filemethod();
		
		
	}
	public static void Filemethod() throws IOException {
	    FileInputStream File = new FileInputStream("D:\\Softlogic\\Media Delivery Report.xlsx");
	    
	  //To enter into the excel
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(3);
		System.out.println(cell);
		System.out.println(sheet.getRow(4).getCell(2));
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		for(int i=0; i<=rowcount; i++) {
			row = sheet.getRow(i);
	    int cellcount = row.getLastCellNum();
	    
	    for(int j=0;j<cellcount; j++) {
	    	cell = row.getCell(j);
	    	System.out.print(cell);
	    	System.out.print("  ");
	    }
	    System.out.println();
	}
}
}


