package amazon_ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_quit 
{
	
	WebDriver driver;
   @BeforeMethod
   @Parameters("browser")
   public void precondition(String broswer_name) 
   {
	   if(broswer_name.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}
		
		if(broswer_name.equals("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		if(broswer_name.equals("edge")) 
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	   
   }
   
   @AfterMethod
   public void posttestcaseactivities() throws InterruptedException 
   {
	   Thread.sleep(2000);
	   driver.quit();
   }
}
