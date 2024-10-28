package selenium_assignements;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import dev.failsafe.internal.util.Maths;

public class Assignment_35_37
{
   public static void main(String[] args) throws IOException, InterruptedException 
   {
	           ChromeDriver driver = new ChromeDriver();
	           driver.get("https://www.amazon.in/");
               driver.manage().window().maximize();
               
               Assignment_35_37 as = new Assignment_35_37(); //creating the object of class Assignment_35
             Class c1 =  as.getClass(); // method get class with the class name
               System.out.println(c1);
               
               Date epooch = new Date();
               System.out.println(epooch);
              String S1 = epooch.toString();
              String s2 = S1.replace(":", "_"); //replacing ":" as file name will not support it
               
                 TakesScreenshot ts     = driver;  //upcasting driver to Takesscreenshot
           File source =      ts.getScreenshotAs(OutputType.FILE); //source of file
                    
   File destination = new File("C:\\Users\\91999\\OneDrive\\Desktop\\Kashyap//" +c1 + s2 +"abc.jpg"); //destination
               FileHandler.copy(source, destination);
	           
   }
}
