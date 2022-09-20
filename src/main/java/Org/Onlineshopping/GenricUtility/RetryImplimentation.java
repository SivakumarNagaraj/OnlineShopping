package Org.Onlineshopping.GenricUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplimentation implements IRetryAnalyzer{

	int count=0;
	int limit=4;
	@Override
	public boolean retry(ITestResult result) {
		if(count<limit)
		{
			count++;
			return true;
		}
		return false;
	}
	
}
