package testNG_assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_74 
{
	public static void main(String[] args) throws IOException 
	  {
		  ChromeDriver driver = new ChromeDriver(); //try same with flipkart
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
		 List <WebElement> li =  driver.findElements(By.tagName("a"));
		 
		 int count = li.size();
		 System.out.println(count);
		 
		 for (int i = 0; i<count ; i++) 
		 {
		 WebElement e1 =   li.get(i);
		    String url = e1.getAttribute("href"); //to get the links/url 
		    //System.out.println(url);
            verifylinks(url);
		 }
		
     }
	 static void verifylinks(String url) throws IOException
	 {
		try {
		 URL u1 = new URL(url);
		 HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
		 if (u2.getResponseCode()==200) 
		 {
			 System.out.println("valid link --" + url);
		 }
		 else 
		 {
			 System.out.println("Not avalid link" + url);
		 }
		 }
		catch (MalformedURLException w1)
		{
			System.out.println("Exception Handled");
		}
		 
	 }
	
}
