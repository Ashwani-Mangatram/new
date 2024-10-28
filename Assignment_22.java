package selenium_assignements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_22 
{
	public static void main(String[] args) throws InterruptedException   
    {
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		   WebElement e1 =  driver.findElement(By.name("q"));
		   e1.sendKeys("mobiles");   
		   Thread.sleep(1000);
List <WebElement> l1 =  driver.findElements(By.xpath("//form[@class ='_2rslOn header-form-search OpXDaO']/ul/li"));
		  int a =  l1.size();
		  System.out.println(a);
		  l1.get(a-1).click();
    }
}
