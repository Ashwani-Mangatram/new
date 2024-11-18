package testNG_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_58 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
         
		FileInputStream f1 = new FileInputStream("C:\\Users\\91999\\eclipse-workspace\\selenium_project\\Data_In_Excel\\DDT_project.xlsx");
		//step-2 open the excel sheet
		  Workbook w1=WorkbookFactory.create(f1);
		  //step 3 go to actual sheet
		  
		  String url = w1.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
		  String item=w1.getSheet("Login").getRow(3).getCell(0).getStringCellValue();
		  //System.out.println(un);
		 // System.out.println(pwd);
		
		  ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(url);
		  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		   e1.sendKeys(item + Keys.ENTER);
	}

}
