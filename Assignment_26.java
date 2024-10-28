package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_26
{
	public static void main(String[] args) 
	   {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		 WebElement e1=  driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		 e1.click();
		 WebElement e2=  driver.findElement(By.id("username"));
		 e2.sendKeys("abcds");
		
		 WebElement e3=  driver.findElement(By.id("label2"));
		 e3.sendKeys("abcds");
		 
		 WebElement e4=  driver.findElement(By.id("Button2"));
		 e4.click();  
	   }
}
