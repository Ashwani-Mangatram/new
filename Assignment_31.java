package selenium_assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_31 
{
	public static void main(String[] args) {
		
	
    ChromeDriver driver = new ChromeDriver();
                 driver.get("https://grotechminds.com/registration/");
                 driver.manage().window().maximize();
               WebElement e1 =  driver.findElement(By.name("file"));
               e1.sendKeys("C:\\Users\\91999\\Downloads\\Invoice-18483805.pdf");
               
               //to upload any we need to mention the file location and name with extension
	}
}
