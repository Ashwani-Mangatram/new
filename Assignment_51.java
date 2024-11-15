package testNG_assignment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment_51 
{
	    @Test
		public void b() 
		{
			System.out.println("Test_2");
			
		}
	    @Test
		public void a() 
		{
			System.out.println("Test_1");
			
		}

	     @BeforeMethod
		public void main() 
		{
			System.out.println("BeforeMethod");
			
		}

}
