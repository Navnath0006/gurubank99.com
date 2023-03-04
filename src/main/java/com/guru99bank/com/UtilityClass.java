package com.guru99bank.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {

	public static String getproeryfile(String key) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\guru99bank.com\\testdata\\cread.properties");
		Properties pro = new Properties();
		pro.load(file);
	    return pro.getProperty(key);
		}
	public static String getexceldata(int row , int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prachi\\eclipse-workspace\\guru99bank.com\\testdata\\gurubankdata.xlsx");
		Sheet data1 = WorkbookFactory.create(file).getSheet("gurubank");
		return data1.getRow(row).getCell(col).getStringCellValue();	
	}
}
