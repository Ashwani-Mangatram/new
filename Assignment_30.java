package selenium_assignements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_30 
{
    public static void main(String[] args) 
    {
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		       List <WebElement>  e1     = driver.findElements(By.tagName("a"));
		      int a = e1.size();
		      System.out.println(a);
		      
		      for (int i = 0 ; i<a; i++) 
		      {
		           WebElement e2 =   e1.get(i);
		         String s1 =  e2.getText();
		        System.out.println(s1);
		      }  
	}
}
