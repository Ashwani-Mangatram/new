package testNG_assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_48 
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
	@BeforeMethod
	public void main3() 
	{
		System.out.println("BeforeMethod");
	}
}
