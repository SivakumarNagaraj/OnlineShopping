package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTheData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream fis = new FileInputStream("src/test/resources/Testdata.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("Sheet1");
//	String result = sheet.getRow(0).getCell(1).getStringCellValue();
//	String result1 = sheet.getRow(1).getCell(1).getStringCellValue();
//	System.out.println(result);
//	System.out.println(result1);
	DataFormatter Df = new DataFormatter();
	Cell cell = sheet.getRow(0).getCell(1);
	String result = Df.formatCellValue(cell);
	System.out.println(result);

	book.close();
	}
}
