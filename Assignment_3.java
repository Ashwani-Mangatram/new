package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 
{
    public static void main(String[] args) 
    {
		
    	ChromeDriver driver = new ChromeDriver ();
 	   driver.get("https://www.facebook.com/");
 	 WebElement e1 =  driver.findElement(By.id("email"));
 	 e1.sendKeys("kashyapthetruenaughty@gmail.com");
	 WebElement e2 =  driver.findElement(By.id("pass"));
 	 e2.sendKeys("abc123");
	 WebElement e3 =  driver.findElement(By.name("login"));
	 e3.sendKeys(Keys.ENTER);

 	 
 	
    	
	}
}
