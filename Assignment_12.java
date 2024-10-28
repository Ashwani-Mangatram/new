package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_12 
{
   public static void main(String[] args) 
   {
	   ChromeDriver driver = new ChromeDriver ();
	   driver.get("file:///C:/Users/91999/OneDrive/Desktop/learningHTML1%20-%20Copy.html");
	   driver.manage().window().maximize();
	   
	  WebElement e1 = driver.findElement(By.tagName("a"));
	  e1.click();
   }
}
