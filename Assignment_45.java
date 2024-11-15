package testNG_assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assignment_45
{
	@AfterClass
	public void main2() 
	{
		System.out.println("AfterClass");
	}
	@AfterMethod
	public void main1() 
	{
		System.out.println("AfterMethod");
	}
    @Test
	public void main() 
	{
		System.out.println("Test");
	}
	
	
	
}
