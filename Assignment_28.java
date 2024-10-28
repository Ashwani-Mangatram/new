package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_28 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		  ChromeDriver driver = new ChromeDriver();
		          driver.get("https://www.google.com/");
		          driver.manage().window().maximize();
		        WebElement a1 =  driver.findElement(By.linkText("Gmail"));
		        Thread.sleep(2000);
		        Actions a2 = new Actions(driver);
			      a2.contextClick(a1).perform();       
	   }
}
