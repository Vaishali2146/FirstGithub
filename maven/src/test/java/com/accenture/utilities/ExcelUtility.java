package com.accenture.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.accenture.pages.Registration;

public class ExcelUtility {

	public void getTestData() throws IOException
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\pdc4-training.pdc4\\Desktop\\TestData.xls");
	//	XSSFWorkbook x = new XSSFWorkbook(fin);
		HSSFWorkbook x = new HSSFWorkbook(fin);
		HSSFSheet s = x.getSheet("TestData");
		int rowcount = s.getLastRowNum();
		for(int i=1; i<=rowcount; i++)
		{
			String FirstName = s.getRow(i).getCell(0).getStringCellValue();
			String LastName = s.getRow(i).getCell(1).getStringCellValue();
			String Email = s.getRow(i).getCell(2).getStringCellValue();
			String Password = s.getRow(i).getCell(3).getStringCellValue();
			String CPassword = s.getRow(i).getCell(4).getStringCellValue();
			
			System.out.println(FirstName+" "+LastName+" "+Email+" "+Password+" "+CPassword+" ");
			Registration.registration(FirstName, LastName, Email, Password, CPassword);
			
		}
		//String data = s.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data);
	}
	
	/*public static void main(String args[]) throws IOException
	{
		ExcelUtility e = new ExcelUtility();
		e.getTestData();
	}*/
}
