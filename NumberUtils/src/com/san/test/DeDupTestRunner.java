package com.san.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Santhosh Boopal
 * JUnit test runner class
 */
public class DeDupTestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(DeDupTest.class);
		for(Failure failure: result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println("Test Result: "+result.wasSuccessful());
	}
}
