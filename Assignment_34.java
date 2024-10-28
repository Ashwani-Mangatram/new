package selenium_assignements;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_34 
{
   public static void main(String[] args) throws InterruptedException 
   {
	      ChromeDriver driver = new ChromeDriver();
	               driver.get("https://www.amazon.in/");
	               driver.manage().window().maximize();
	          WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
	                     e1.sendKeys("shoe" + Keys.ENTER);	                     
	WebElement e2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
	        e2.click(); 	        
	Set<String> s =        driver.getWindowHandles();
	 Iterator<String> a1 = s.iterator();
	  String parent =      a1.next();
	   String child =      a1.next();
	    driver.switchTo().window(child);
	    Thread.sleep(3000);
	        WebElement e3 =    driver.findElement(By.xpath("(//span[@class = 'a-button-inner'])[28]"));
	            e3.click();
	    
	    
	   
	 
	        
	               		
	                    
   }
}
