package selenium_assignements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_32 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		  ChromeDriver driver = new ChromeDriver();
		     driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIoZy1_bWfiQMVsKRmAh0UCSDmEAAYASAAEgKva_D_BwE&gclsrc=aw.ds");
		     driver.manage().window().maximize();
		 WebElement e1 =   driver.findElement(By.xpath("//span[@class='google-text']"));
		 e1.click();
		 
		Set<String> s1 = driver.getWindowHandles();
		       Iterator <String> i1 =     s1.iterator();
		                 String s2       =   i1.next();
		                 String s3       =   i1.next();
		                 System.out.println(s2);
		                 System.out.println(s3);
		                 
		                 driver.close();
		                 driver.switchTo().window(s3);
		            WebElement e3  =   driver.findElement(By.name("identifier"));
		            e3.sendKeys("identifier");
		                 
		                 
	   }
}
