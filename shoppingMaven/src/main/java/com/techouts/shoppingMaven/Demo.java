package com.techouts.shoppingMaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws Exception {

		XSSFWorkbook bookObj=new XSSFWorkbook();
		XSSFSheet sheetObj=bookObj.createSheet("UserData");
		
		String userData[][]= {  {"CustomerName","Products","Quantity","Total"},
		{"pavani","apple","4","100"}
		};
		
		int rows=userData.length;
		int cols=userData[0].length;
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow rowObj=sheetObj.createRow(rows);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cellObj=rowObj.createCell(cols);
				String data=userData[r][c];
				cellObj.setCellValue((String)data);
				
			}
		}
		File f=new File("E:\\FileIO\\userData.xlsx");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		bookObj.write(fos);
		fos.close();
		System.out.println("success");
	}

}
