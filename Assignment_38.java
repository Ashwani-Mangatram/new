package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_38 
{
         public static void main(String[] args) throws InterruptedException 
        {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://grotechminds.com/registration/");
			            WebElement e1 =driver.findElement(By.id("fname"));
			            e1.sendKeys("Ashwani");
			            WebElement e2 =driver.findElement(By.id("lname"));
			            e2.sendKeys("kumar");
			            WebElement e3 =driver.findElement(By.id("email"));
			            e3.sendKeys("ash@gmail.com");
			            WebElement e4 =driver.findElement(By.id("password"));
			            e4.sendKeys("Password12");
			            WebElement e5 =driver.findElement(By.id("male"));
			            e5.click();
			            
			            WebElement e6 =driver.findElement(By.id("Skills"));
			            
			            Select a1 = new Select(e6);
			            a1.selectByIndex(1);
			            
			            WebElement e7 =driver.findElement(By.id("Country")); 
			            Select a2 = new Select(e7);
			            a2.selectByVisibleText("India");
			            
			            WebElement e8 =driver.findElement(By.id("Present-Address"));
			            e8.sendKeys("faridabad");
			            WebElement e9 =driver.findElement(By.id("Permanent-Address"));
			            e9.sendKeys("faridabad");
			            
			            Thread.sleep(1000);
			            WebElement e10 =driver.findElement(By.id("Pincode"));
			            e10.sendKeys("121001");
			            
			            WebElement e11 =driver.findElement(By.id("Relegion")); 
			            Select a3 = new Select(e11);
			            a3.selectByVisibleText("Hindu");
			            
			            WebElement e12 =driver.findElement(By.id("relocate"));
			            e12.click();
			            
			            WebElement e13 =driver.findElement(By.id("file"));
			            e13.sendKeys("C:\\\\Users\\\\91999\\\\Downloads\\\\Invoice-18483805.pdf");
			            
			            WebElement e14 =driver.findElement(By.name("Submit"));
			            e14.click();
			            
			          //Thread.sleep(1000);
			          driver.switchTo().alert().dismiss();
			         		
		}
}
