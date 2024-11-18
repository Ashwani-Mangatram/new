package testNG_assignment;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_54 
{
	@DataProvider(name = "set1")
	public Object[][] method1()
	{
		Object data [][] = new Object[5][5];
		//1st row
		   data [0][0] = "first1";
		   data [0][1] = "last1";
		   data [0][2] = "ashwani1";
		   data [0][3] = "09-11";
		   data [0][4] = "m";
		//2nd row   
		   data [1][0] = "first2";
		   data [1][1] = "last2";
		   data [1][2] = "ashwani2";
		   data [1][3] = "09-11";
		   data [1][4] = "m";
		 //3nd row   
		   data [2][0] = "first3";
		   data [2][1] = "last3";
		   data [2][2] = "ashwani3";
		   data [2][3] = "09-11";
		   data [2][4] = "m";
		 //4nd row  
		   data [3][0] = "first4";
		   data [3][1] = "last4";
		   data [3][2] = "ashwani4";
		   data [3][3] = "09-11";
		   data [3][4] = "m";
		 //5nd row 
		   data [4][0] = "first5";
		   data [4][1] = "last5";
		   data [4][2] = "ashwani5";
		   data [4][3] = "09-11";
		   data [4][4] = "m";
		   
		return data;  
	   }

	@Test (dataProvider = "set1")
	public void registration(String first, String last, String email, String Pass, String gender) 
	{

		System.out.println("fIRST name --"+first);
		System.out.println("Last name -- "+last);
		System.out.println("email -- "+email);
		System.out.println("Password -- "+Pass);
		System.out.println("Gender --" +gender);
	}
	
	
}
