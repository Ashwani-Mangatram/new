package testNG_assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_50 
{
	@Test
	public void main_b() 
	{
		System.out.println("Test_b");
	}
	@Test
	public void main_c() 
	{
		System.out.println("Test_c");
	}
	
	@Test
	public void main_a() 
	{
		System.out.println("test_a");
	}
	@AfterMethod
	public void main4() 
	{
		System.out.println("After_Method");
	}
	@BeforeMethod
	public void main5() 
	{
		System.out.println("Before_Method");
	}
	
	
}
