package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_9
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	    driver.get("file:///C:/Users/91999/OneDrive/Desktop/learningHTML1%20-%20Copy.html");
	       //WebElement e1     = driver.findElement(By.tagName("a"));
	       // e1.click();
	    
	        WebElement e1         = driver.findElement(By.xpath("//html/body/input[1]"));
	        e1.sendKeys("Ashwani12");
	        WebElement e2         = driver.findElement(By.xpath("//html/body/input[2]"));
	        e2.sendKeys("aash");
	        WebElement e3         = driver.findElement(By.xpath("//html/body/input[3]"));
	        e3.sendKeys("aash1234");
	        WebElement e4         = driver.findElement(By.xpath("//html/body/form/input[1]"));
	        e4.sendKeys("aash1234");
	       WebElement e5         = driver.findElement(By.xpath("//html/body/input[4]"));
	      e5.click();
	       //Thread.sleep(2000);
	      WebElement e6         = driver.findElement(By.xpath("//html/body/form[2]/input[1]"));
	     e6.click();
	     Thread.sleep(2000);
	     WebElement e7         = driver.findElement(By.xpath("//html/body/input[6]"));
	     e7.click(); 
	        

	}   
}
