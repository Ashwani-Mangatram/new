package selenium_assignements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_23 
{
	public static void main(String[] args) throws InterruptedException   
    {
		 
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.manage().window().maximize();
		    WebElement e1 = driver.findElement(By.name("q"));
		    e1.sendKeys("bangalore"); 
		  Thread.sleep(5000);

		 List<WebElement> l1 =  driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		 
		for(int i =0 ; i<l1.size();i++  )
		{		    WebElement a         =   l1.get(i);
		             String a1 =     a.getText();
		             System.out.println(a1);
		}
		
		    
	}
}
