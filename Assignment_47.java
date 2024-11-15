package testNG_assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment_47 
{   
	@Test
	public void main1() 
	{
		System.out.println("Test");
	}
	
	@AfterMethod
	public void main2() 
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void main3() 
	{
		System.out.println("AfterClass");
	}
	@BeforeSuite
	public void main4() 
	{
		System.out.println("BeforeMethod");
	}
	
}
