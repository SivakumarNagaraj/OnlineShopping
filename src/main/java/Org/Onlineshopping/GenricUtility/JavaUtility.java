package Org.Onlineshopping.GenricUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used to generate the random number
	 * 
	 * @param limit
	 * @return
	 */
	public int getRandumNumber(int limit)
	{
		int value = new Random().nextInt(limit);
		return value;
	}
	/**
	 * This method is used to get the date and time
	 * @return 
	 * 
	 */
	public String CurrentTime() {
		Date data=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String actualdate = simpleDateFormat.format(data);
		return actualdate;
	}
 }
