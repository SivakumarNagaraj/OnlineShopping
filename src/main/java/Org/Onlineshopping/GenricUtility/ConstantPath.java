package Org.Onlineshopping.GenricUtility;

/*
 *  This class contains path of the files
 *  @
 */
public interface ConstantPath {
	ExcelUtility ExUtility=new ExcelUtility();
	String Excel_Path ="src/test/resources/Testdata.xlsx";
	String Propertyfile_Path = "src/test/resources/Commendata.properties";
	String Url=ExUtility.getDatafromExcelBasedOnKey(Excel_Path, "Credentials", "UserUrl");
	String AdminUrl=ExUtility.getDatafromExcelBasedOnKey(Excel_Path, "Credentials", "AdminUrl");
}

