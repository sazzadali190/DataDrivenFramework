package com.datadrivenframework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Utility {
private static Logger log = Utility.getLog(Utility.class);
	
	public static void verify(String Actual, String Expected) {
		if(Actual.equals(Expected)) {
			log.info("Test passed.");
		}
		else {
			log.info("Test failed.");
			log.info("Expected: " +Expected);
			log.info("Actual: " +Actual);
		}
		
		Assert.assertEquals(Actual, Expected);
	}
	
	public static Logger getLog(Class clazz) {
		Logger log=Logger.getLogger(clazz);
		PropertyConfigurator.configure("src/test/resources/log4j.properties");
		return log;
		}
	
	public static void takeScreenShot(WebDriver dr) {
		Calendar calendar = Calendar.getInstance();
		long timeInMilliseconds = calendar.getTimeInMillis();
		TakesScreenshot Screenshot = (TakesScreenshot)dr;
		File sourceFile = Screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\Ninja\\Desktop\\DataDrivenFramework\\target\\images" + timeInMilliseconds+ ".jpeg");
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object[][] readExcel(String path, String sheetName) {
		Object data[][] = null;
		DataFormatter formatData = new DataFormatter();
		try {
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rowSize = sheet.getPhysicalNumberOfRows();
		int colSize = sheet.getRow(0).getLastCellNum();
		data = new Object[rowSize][colSize];
		Iterator<Row> rowIterator = sheet.rowIterator();
		int countRow = 0;
		while(rowIterator.hasNext()){
		Row rowValue = rowIterator.next();	
		Iterator<Cell> cell = rowValue.cellIterator();
		int countCell = 0;
		while (cell.hasNext()) {
			Cell cellValue = cell.next();
			data[countRow][countCell] = formatData.formatCellValue(cellValue);
			countCell++;
			}
		}
		countRow++;
		
	}catch(Exception e) {
		log.info(e.getMessage());
	}
		return data;
	}
}
