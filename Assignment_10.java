package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_10 
{
	public static void main(String[] args) 
	   {
		   ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		 WebElement e1 =  driver.findElement(By.xpath("//span[@id = 'nav-link-accountList-nav-line-1']"));
		 e1.click();
		 WebElement e2	  = driver.findElement(By.xpath("//input[@id='ap_email']"));
		  e2.sendKeys("9990015611");
		  WebElement e3	  = driver.findElement(By.xpath("//input[@id='continue']"));
		  e3.click(); 
		  WebElement e4	  = driver.findElement(By.xpath("//input[@id='ap_password']"));
		  e4.sendKeys("9990015611");  
		  WebElement e5	  = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		  e5.click(); 
		  
		
	   }
}
