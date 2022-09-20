package Org.Onlineshopping.GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains get and set methods
 * @author MATHAN KUMAR
 *
 */
public class ExcelUtility
{
	/**
	 * This method is used to fetch the data from excel sheet
	 * @author MATHAN KUMAR
	 * @return 
	 */
	Workbook book;
	public String getDataFromExcel(String Excel_path, String SheetName, int rowNumber, int cellNumber)
	{		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(Excel_path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet(SheetName);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		return data;
	}
	/**
	 * This method is used to close the Excel
	 */
		public void closeTheExcel() {		
		try {
			book.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	/**
	 * This method is used to get the datafrom basedon Key
	 * 
	 * @param Excel_path
	 * @param Sheet
	 * @param Key
	 * @return
	 */
	public String getDatafromExcelBasedOnKey(String Excel_path,String Sheet, String Key) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(Excel_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Sheet sheet = book.getSheet(Sheet);
		String value=null;
	for (int i = 0; i <=sheet.getLastRowNum(); i++) {
		DataFormatter df=new DataFormatter();
		String requiredata = df.formatCellValue(sheet.getRow(i).getCell(0));
		if (requiredata.equalsIgnoreCase(Key)) {
			value = df.formatCellValue(sheet.getRow(i).getCell(1));
			break;
		}
	}
		return value;
	}

	/**
	 * This method is used to set the data to excel 
	 * @param Excel_path
	 * @param SheetName
	 * @param rowNumber
	 * @param cellNumber
	 */

	public void setDataFromExcel(String Excel_path, String SheetName, int rowNumber, int cellNumber)
	{
		FileInputStream fis=null;

		try {
			fis=new FileInputStream(Excel_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date Value = null;
		Sheet sheet = book.getSheet(SheetName);
		Cell cell = sheet.getRow(rowNumber).getCell(cellNumber);
		cell.setCellValue(Value);
		
		FileOutputStream fout=null;
		try {
			fout=new FileOutputStream(Excel_path);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			book.write(fout);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		try {
//			book.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}				
	}


}
