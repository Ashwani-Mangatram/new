package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_19 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://grotechminds.com/registration/");
	   driver.manage().window().maximize();
	   WebElement e1 =     driver.findElement(By.id("Skills"));
	   e1.click();
	   
	   Select s1 = new Select(e1);
	  // Thread.sleep(2000);
	   s1.selectByValue("select1");
	   
	   WebElement e2 =     driver.findElement(By.id("Country"));
	   e1.click();
	   
	   Select s2 = new Select(e2);
	  // Thread.sleep(2000);
	   s2.selectByValue("Afganistan");
	   
	   WebElement e3 =     driver.findElement(By.id("Relegion"));
	   e3.click();
	   
	   Select s3 = new Select(e3);
	   //Thread.sleep(2000);
	   s3.selectByValue("Hindu");
   }
}
