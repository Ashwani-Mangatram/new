package selenium_assignements;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 
{
     public static void main(String[] args) 
    {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
		 String s1 =  driver.getWindowHandle();
		 System.out.println(s1);
		  
		  
		  
	}
}
