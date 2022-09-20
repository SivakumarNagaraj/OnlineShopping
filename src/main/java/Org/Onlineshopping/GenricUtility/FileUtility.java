package Org.Onlineshopping.GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains gat and set method of rpopertyfile Utilities
 * @author MATHAN KUMAR
 *
 */
public class FileUtility 
{
	/**
	 * This method is used to get the data from propertyfiles.
	 * @param File_path
	 * @param Key
	 * @return
	 */
	public String getDataFromFile(String File_path, String Key)
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(File_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String data = property.getProperty(Key).trim();
		return data;
	}
}
