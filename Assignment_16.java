package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_16 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://grotechminds.com/hoverover/");
		   driver.manage().window().maximize();
		  WebElement e1    =  driver.findElement(By.xpath("(//div[@class ='toolrip4'])[1]"));
		  
		  Actions a1 = new Actions(driver);
		  a1.moveToElement(e1).build().perform();
		  Thread.sleep(3000);
		  WebElement e2   =  driver.findElement(By.xpath("(//div[@class ='popup4'])[3]"));
		  Thread.sleep(5000);
		  e2.click();
		  
		  
		 
		   
    }	   
}
