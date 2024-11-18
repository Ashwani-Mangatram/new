package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_55 
{
   
	@Test (invocationCount = 3)
	public void method() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 =   driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("India" + Keys.ENTER); 
	}
	
}
