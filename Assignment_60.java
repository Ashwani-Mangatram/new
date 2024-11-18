package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_60 
{
	WebDriver driver;
	@Test (priority =3)
   public void method() 
   {
		 driver = new ChromeDriver ();
		   driver.get("https://www.google.com/");
		 WebElement e1 =  driver.findElement(By.id("APjFqb"));
		 e1.sendKeys("India");
   }
	
   @Test (priority =1)
   public void method1() 
   {
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	     e1.sendKeys("shoe" + Keys.ENTER);   
   }
   
	@Test (priority =2)
   public void method2() 
   {
		 driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	     e1.sendKeys("TV" + Keys.ENTER); 
   }
}
