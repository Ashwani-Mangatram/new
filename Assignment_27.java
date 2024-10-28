package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_27 
{
	public static void main(String[] args) 
	   {
		  ChromeDriver driver = new ChromeDriver();
		          driver.get("https://www.google.com/");
		          driver.manage().window().maximize();
		        WebElement a1 =  driver.findElement(By.linkText("Gmail"));
		        Actions a2 = new Actions(driver);
			      a2.doubleClick(a1).perform();
			      
			      
		        
	   }
	   
}
