package testNG_assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_46 
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
	@BeforeClass
	public void main3() 
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void main4() 
	{
		System.out.println("BeforeMethod");
	}
	@BeforeTest
	public void main5() 
	{
		System.out.println("BeforeTest");
	}
}
