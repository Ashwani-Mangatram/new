package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_40_41 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		  ChromeDriver driver = new ChromeDriver();
		     driver.get("https://www.amazon.in/");
		     driver.manage().window().maximize();
		        WebElement e1 =   driver.findElement(By.xpath("//a[.='About Amazon']"));
		           
		     Point p1 =  e1.getLocation();
		            
		 int a =    p1.getX();
		int b =     p1.getY();
		System.out.println(a);   //coordinates
		System.out.println(b);   //coordinates
		
		    JavascriptExecutor js =   driver;  
		    js.executeScript("window.scrollBy(461, 5128)");  //scroll up
		
		    Thread.sleep(1000);
		    js.executeScript("window.scrollBy(461, -5128)"); //scroll down
		
		
	   }
}
