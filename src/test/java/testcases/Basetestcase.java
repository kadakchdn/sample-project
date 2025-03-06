package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetestcase 
{
	
	@BeforeMethod
	void setup()
	{
		System.out.println("I am setup");
	}
	
	@AfterMethod
	void teardown()
	{
		System.out.println("I am teardown");
	}

}
