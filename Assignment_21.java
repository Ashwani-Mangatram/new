package selenium_assignements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_21 
{
	public static void main(String[] args) throws InterruptedException   
    {
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		     WebElement e1 =     driver.findElement(By.id("twotabsearchtextbox"));
		     e1.sendKeys("shoe");
		   
		     Thread.sleep(1000);
		List<WebElement> l1 =   driver.findElements(By.xpath("//div[@class ='two-pane-results-container']/div/div"));
		int a = l1.size();
		System.out.println(a);
		l1.get(1).click();
    }
}
