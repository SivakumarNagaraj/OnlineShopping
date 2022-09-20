package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;

public class TestExecution4Test extends BaseClass{
	@Test
	public void testexecution4test() {
		Reporter.log(""+Thread.currentThread().getId(),true);
	}
}
