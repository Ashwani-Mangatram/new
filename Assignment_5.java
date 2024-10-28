package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_5 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver ();
 	   driver.get("https://www.youtube.com/");
 	  Thread.sleep(4000);
 	        WebElement e1     = driver.findElement(By.name("search_query"));
 	        e1.sendKeys("grotechmind");
 	        e1.sendKeys(Keys.ENTER);
   }
}
