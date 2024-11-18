package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_53 
{
	@DataProvider(name = "set1")
	public Object [][]	methodname()
	{
		return new Object [][] {{"spain"},{"europe"},{"nepal"}};
	}

	@Test(dataProvider = "set1")
	public void main(String input) 
	{
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		        WebElement e1 = driver.findElement(By.id("APjFqb"));
		        e1.sendKeys(input + Keys.ENTER);	  
	}
}
