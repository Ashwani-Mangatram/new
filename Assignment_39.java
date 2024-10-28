package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_39 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  
	   ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		            WebElement e1 =driver.findElement(By.xpath("//button[@class = 'btnjs']"));
		            e1.click();
		            Thread.sleep(2000);
		            //driver.switchTo().alert().dismiss();
		            driver.switchTo().alert().accept();

	   
	   
}
}
