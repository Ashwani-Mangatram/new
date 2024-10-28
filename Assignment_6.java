package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_6 
{
    public static void main(String[] args) 
    {
    	   ChromeDriver driver = new ChromeDriver ();
     	   driver.get("https://www.amazon.in/");
     	  
     	        WebElement e1     = driver.findElement(By.linkText("Mobiles"));
     	        e1.click();
	}
}
