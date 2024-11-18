package amazon_ng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testcase_3 extends Launch_quit 
{
	@Test
public void add_to_cart() throws InterruptedException 
    
    {
		//ChromeDriver driver = new ChromeDriver();
	   // driver.get("https://www.amazon.in/");
	   //  driver.manage().window().maximize();
	  WebElement e1 =   driver.findElement(By.id("twotabsearchtextbox"));
	  e1.sendKeys("shoe" + Keys.ENTER);
	  
	  Thread.sleep(1000);
WebElement e2 =	  driver.findElement(By.xpath("(//span[@class = 'a-size-base-plus a-color-base a-text-normal'])[1]"));
e2.click();

Set<String> s1             =   driver.getWindowHandles();
System.out.println(s1);
Iterator<String> i1 = s1.iterator();
     String parentID   =     i1.next();
     String childiD =      i1.next();
    // System.out.println(parentID);
    // System.out.println(childiD);
     driver.close();
     driver.switchTo().window(childiD);
     Thread.sleep(2000);
     WebElement e3 =   driver.findElement(By.xpath("(//a[@class ='a-button-text'])[1]")); 
     e3.click();

    }
}
