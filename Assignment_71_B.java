package testNG_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_71_B  
{
    WebDriver driver;
    @Test (retryAnalyzer=Assignment_71_A.class)
	public void main3() 
    {
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	 e1.sendKeys("tv" + Keys.ENTER);  
    }
	
}
