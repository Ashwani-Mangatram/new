package selenium_assignements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_29 
{
	public static void main(String[] args) 
	  {
		  ChromeDriver driver = new ChromeDriver(); //try same with flipkart
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  
		 List <WebElement> li =  driver.findElements(By.tagName("a"));
		 
		 int count = li.size();
		 System.out.println(count);
		 
		 
		 for (int i = 0; i<count ; i++) 
		 {
		 WebElement e1 =   li.get(i);
		    String s1  =   e1.getText(); //to get the links name(UI)
		    String s2 = e1.getAttribute("href"); //to get the links 
		   System.out.println(s1);
		   System.out.println(s2);

		 }
	  }
}