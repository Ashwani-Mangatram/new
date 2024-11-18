package testNG_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment_64 
{

	@Test
	public void Amazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes"+Keys.ENTER); 
	List<WebElement> li=	driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"]"));
        int countofshoes=li.size();
        System.out.println(countofshoes);
	Assert.assertEquals(countofshoes>24, true);
	}
}
