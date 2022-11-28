package Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheData 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("src/test/resources/Commendata.properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url").trim();
		System.out.println(url);
		
	}
}
