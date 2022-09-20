package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Org.Onlineshopping.GenricUtility.BaseClass;

public class TestExecution1Test extends BaseClass {

//	@Test
//	public void testexecution1() {
//		Reporter.log(""+Thread.currentThread().getId(),true);
//	}
	@Test
	public void testexecution1Test() {
		Reporter.log(""+Thread.currentThread().getId(),true);
		
		//Assert.fail();
	}
}
