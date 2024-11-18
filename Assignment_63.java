package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_63 
{
	WebDriver driver;
	   @Test (timeOut = 1000)
	   public void main() 
	   {
		    driver = new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		   WebElement e1 =  driver.findElement(By.name("q"));
		   e1.sendKeys("mobiles");
	   }
}
