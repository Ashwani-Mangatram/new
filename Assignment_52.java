package testNG_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_52 
{  
	WebDriver driver;
	
	@Test (priority=1)
	public void login_to_amz_search() 
	{
		WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	     e1.sendKeys("shoe" + Keys.ENTER);
	}
	
	@Test(priority=2)
	public void login_to_amz_add() throws InterruptedException 
	{
		   //driver = new ChromeDriver();
          driver.get("https://www.amazon.in/");
          driver.manage().window().maximize();
     WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
                e1.sendKeys("shoe" + Keys.ENTER);	                     
     WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
   e2.click(); 	        
     Set<String> s =        driver.getWindowHandles();
     Iterator<String> a1 = s.iterator();
     String parent =      a1.next();
     String child =      a1.next();
     driver.switchTo().window(child);
     Thread.sleep(3000);
     WebElement e3 =    driver.findElement(By.xpath("//span[@class='a-button a-button-groupfirst a-spacing-none a-button-base a-declarative']"));
       e3.click();
	}
	@AfterMethod
	public void main4() throws InterruptedException 
	{
		Thread.sleep(3000);
		   driver.quit();
	}
	@BeforeMethod
	public void main5() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
