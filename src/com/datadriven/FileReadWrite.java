package com.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		
		String path = "D:\\Softlogic\\Data\\Logindata1.xlsx";

		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet sh = wk.getSheet("sheet1");
		Row row =  sh.getRow(1);
		Cell cell = row.getCell(1);
		String value = cell.getStringCellValue();

		System.out.println(value);

		int roS = sh.getLastRowNum()+1;
		int colS= row.getLastCellNum();
		System.out.println(roS +"-"+ colS);

		for(int i=0; i<roS; i++) {
			Row row1 =sh.getRow(i);
			for (int j=0; j<colS; j++) {
				Cell cell1 = row1.getCell(j);
				System.out.println(cell1);
			}
		}
	}

}
