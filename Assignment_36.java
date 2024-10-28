package selenium_assignements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment_36 
{ 
     public static void main(String[] args) throws IOException 
    {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
                     
                   TakesScreenshot ts    = driver;
                      File S1 =          ts.getScreenshotAs(OutputType.FILE);
                      
                 //     Assignment_36 a1 = new Assignment_36();//creating the object of class with reference variable
                      
                      
                   //   new Assignment_36().getClass();
                      
                      File d1 = new File("c:\\Users\\91999\\OneDrive\\Desktop\\Kashyap\\"+new Assignment_36().getClass()+".jpg");
                     FileHandler.copy(S1, d1);
                                                        //FileNotFoundException
	}
}
