package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_15 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
	WebElement e1 = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
     
              Actions a1 = new Actions(driver);
                   a1.moveToElement(e1).build().perform();
                   Thread.sleep(2000);
      WebElement e2 = driver.findElement(By.xpath("(//span[.='HI'])[1]"));
                 e2.click();
                   
	  
		   
		   
    }
}
