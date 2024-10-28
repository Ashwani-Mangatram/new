package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11 
//"Assignment 11 WAP launch Amazon.in try to search something using search field using relative Xpath"
{
    public static void main(String[] args) 
    {
    	ChromeDriver driver = new ChromeDriver ();
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		    WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		    e1.sendKeys("shoe" + Keys.ENTER);
	}
}
