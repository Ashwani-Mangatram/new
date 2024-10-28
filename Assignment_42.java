package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_42 
{

	public static void main(String[] args) throws InterruptedException 
	{
         
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     WebElement e1    = driver.findElement(By.xpath("//input[@id=\"search\"]"));

	     e1.sendKeys("India");
	     e1.sendKeys(Keys.ENTER);
	     
	     Thread.sleep(3000);
	// int a = e1.getRect().getDimension().getHeight();
	     
	           //   Point p1 =      e1.getLocation();
	          //    int a =    p1.getX();
	      	//	int b =     p1.getY();
	      		
	      		
	      	//	System.out.println(a);   //coordinates
	      	//	System.out.println(b);   //coordinates
	     int a = e1.getRect().getDimension().getHeight(); //gives the height of the webpage	
	     System.out.println(a);
	     while (true) 
	     {
	      		JavascriptExecutor js =   driver;  
	      		Thread.sleep(1000);
	      		
			    js.executeScript("window.scrollBy(0, 26)");
	     }
	      		
		
	}

}
