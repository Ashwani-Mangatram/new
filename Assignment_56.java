package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment_56 
{
	@DataProvider (name = "set1")
	public Object [][] DP_method()
	{
		return new Object [][] {{"shoe"}, {"pen"}, {"tv"}, {"phone"}, {"jeans"}, {"shirt"}, {"jacket"}, {"ps5"}, {"tablet"}, {"geeta book"}};
	}
	
    @Test (dataProvider = "set1")
	public void method(String input) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 =   driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input + Keys.ENTER);  
	}
	
	
}
