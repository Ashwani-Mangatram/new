package testNG_assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Assignment_70 
{ 
	WebDriver driver;
	@Test (groups= {"integration"})
    public void main1() 
    {
		 driver = new ChromeDriver ();
		   driver.get("https://www.google.com/");
		 WebElement e1 =  driver.findElement(By.id("APjFqb"));
		 e1.sendKeys("India");
    }
	@Test (groups= {"smoke", "integration"})
    public void main2() 
    {
		 driver = new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
		     e1.sendKeys("shoe" + Keys.ENTER);   
    }
	@Test (groups= {"integration"})
    public void main3() 
    {
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	 e1.sendKeys("tv" + Keys.ENTER);  
    }
	@Test  (groups= {"integration"})
    public void main4() 
    {
		driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
	 e1.sendKeys("ball" + Keys.ENTER);  
    }
}
