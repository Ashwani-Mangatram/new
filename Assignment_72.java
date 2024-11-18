package testNG_assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_72 
{
	@Test
    public void main() throws InterruptedException 
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    	driver.manage().window().maximize();
    	   WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
           e1.sendKeys("shoe" + Keys.ENTER);	                     

    }
}
