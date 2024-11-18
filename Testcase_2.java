package amazon_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase_2 extends Launch_quit 
{
	@Test
    public void searching_a_prodcut() 
    
    {
		//driver.get("https://www.amazon.in/");
		 WebElement e1 =    driver.findElement(By.xpath("(//input)[5]"));
		    e1.sendKeys("shoe" + Keys.ENTER);
    }
}
