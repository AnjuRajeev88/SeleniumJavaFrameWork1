package com.obsqura.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelReadUtility {
	/*public static void main (String[] args) throws Exception
	{
		ExcelReadUtility ob= new ExcelReadUtility();
		ob.getData();
	}*/
	@DataProvider(name="logindata") 
	public Object[][] getData(){
		 String path=System.getProperty("user.dir")+"\\TestDataExcel\\TestDataExcel.xlsx";
		//String path="C:\\Users\\anjun\\Desktop\\eclipse-workspace\\Qaleagend\\TestDataExcel\\TestDataExcel.xlsx";
		String  [][] data=null;
		try {
			File file=new File(path);
			
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(0);
			
			int rows=sheet.getPhysicalNumberOfRows();
			
			int cells=sheet.getRow(0).getPhysicalNumberOfCells();
			
			data= new String[rows-1][cells-0];
			for( int i=1;i<rows;i++ ) {
				
				for(int j=0;j<cells;j++) {
					
					String cellData=sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j-0] =cellData;
					
				}
			}
			
			}catch(Exception e) {
		e.printStackTrace();
	}
		return data;
	}

	/*public static void main (String[] args) throws Exception
	{
		ExcelReadUtility ob= new ExcelReadUtility();
		ob.getData(null);
	}*/
	public Object[][] getData(String sheetName){
		 String path=System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
		//String path="C:\\Users\\anjun\\Desktop\\eclipse-workspace\\Qaleagend\\TestDataExcel\\TestDataExcel.xlsx";
		String  [][] data=null;
		try {
			File file=new File(path);
			
			FileInputStream fis= new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(0);
			
			int rows=sheet.getPhysicalNumberOfRows();
			
			int cells=sheet.getRow(0).getPhysicalNumberOfCells();
			
			data= new String[rows-1][cells-0];
			for( int i=1;i<rows;i++ ) {
				
				for(int j=0;j<cells;j++) {
					
					String cellData=sheet.getRow(i).getCell(j).getStringCellValue();
					data[i-1][j-0] =cellData;
					//System.out.println(cellData);
				}
			}
			
			}catch(Exception e) {
		e.printStackTrace();
	}
		return data;
	}
	
	

   	}

	
