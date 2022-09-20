package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;

public class TestExecution2Test extends BaseClass {
	@Test
	public void testexecution1test() {
		Reporter.log(""+Thread.currentThread().getId(),true);
	}
}
