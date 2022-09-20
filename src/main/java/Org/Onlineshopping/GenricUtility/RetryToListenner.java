package Org.Onlineshopping.GenricUtility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryToListenner implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
		annotation.setRetryAnalyzer(Org.Onlineshopping.GenricUtility.RetryImplimentation.class);	
	}
}
