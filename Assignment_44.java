package testNG_assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_44
{
     @Test
	public void main1() 
	{
		System.out.println("Test");
		
	}

     @BeforeSuite
	public void main2() 
	{
		System.out.println("BeforeSuite");
		
	}

     @AfterSuite
	public void main3() 
	{
		System.out.println("AfterSuite");
		
	}

     @BeforeClass
	public void main4() 
	{
		System.out.println("BeforeClass");
		
	}

     @AfterClass
	public void main5() 
	{
		System.out.println("AfterClass");
		
	}

     @BeforeTest
	public void main6() 
	{
		System.out.println("BeforeTest");
		
	}

     @AfterTest
	public void main7() 
	{
		System.out.println("AfterTest");
		
	}

     @BeforeMethod
	public void main8() 
	{
		System.out.println("BeforeMethod");
		
	}

     @AfterMethod
	public void main9() 
	{
		System.out.println("AfterMethod");
		
	}
	
	
}
