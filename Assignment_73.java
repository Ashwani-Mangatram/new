package testNG_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_73 
{
	@Test
    public void main() throws InterruptedException 
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().window().maximize();
    	WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	w1.until(ExpectedConditions.titleContains("smazo"));
    	   WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
           e1.sendKeys("shoe" + Keys.ENTER);	                     

    }
}
