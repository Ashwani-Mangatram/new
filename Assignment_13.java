package selenium_assignements;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_13 
{
    public static void main(String[] args) throws InterruptedException 
    {
    	ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		      WebElement e1 =   driver.findElement(By.id("searchDropdownBox"));
		     // e1.click();//don't use it
		      
		      Select s1 = new Select (e1);
		      s1.selectByValue("search-alias=stripbooks");
		      WebElement e2 =   driver.findElement(By.id("twotabsearchtextbox"));
		      e2.sendKeys("power of mind" + Keys.ENTER);
		      
		      WebElement e3 = driver.findElement(By.xpath("(//span[.='The Power of Your Subconscious Mind: Original Edition | Premium Paperback'])"));
		      e3.click();
		      
		Set<String> s2 = driver.getWindowHandles();
		          Iterator<String> i1  =  s2.iterator();
                            String parentid  = i1.next();
                            String childid   = i1.next();
		                
                            System.out.println(parentid);
                            System.out.println(parentid);
		      
                            driver.switchTo().window(childid);
                            
                        WebElement e4 =   driver.findElement(By.xpath("//span[.='Add to Cart']"));
                        e4.click();
		   
		      
		      
		      
		      
		      

		      
		      
		      
		      
	}
}
