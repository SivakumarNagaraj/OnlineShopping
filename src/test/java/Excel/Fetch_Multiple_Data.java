package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Multiple_Data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("src/test/resources/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Credentials");
		DataFormatter df = new DataFormatter();
		String[][] arr = new String[sheet.getLastRowNum()+1][sheet.getRow(sheet.getLastRowNum()).getLastCellNum()];
		
//		System.out.println(sheet.getRow(sheet.getLastRowNum()).getLastCellNum());
//		System.out.println(sheet.getLastRowNum());
		for (int i = 0; i<=sheet.getLastRowNum(); i++) 
		{
			for (int j = 0; j < sheet.getRow(sheet.getLastRowNum()).getLastCellNum(); j++)
			{
				arr[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		for (int i = 0; i <=sheet.getLastRowNum(); i++) 
		{
			for (int j = 0; j <sheet.getRow(sheet.getLastRowNum()).getLastCellNum() ; j++) 
			{
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}

	}
}
