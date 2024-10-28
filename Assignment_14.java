package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_14 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		     // WebElement e1 =   driver.findElement(By.xpath("(//span[@class ='_1XjE3T'])[3]"));
		      WebElement e2 =   driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		      e2.click();
     }
}
