package testNG_assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_59
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		WebElement e2=driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]"));
		e2.click();
		WebElement e3=driver.findElement(By.name("email"));
		e3.sendKeys("9990015611"+Keys.ENTER);
		WebElement e4=driver.findElement(By.id("ap_password"));
		e4.sendKeys("Sonika123@"+Keys.ENTER);
		WebElement e5=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		Actions a2=new Actions(driver);
		a2.moveToElement(e5).perform();
		WebElement e6=driver.findElement(By.xpath("//span[.=\"Your Account\"]"));
		e6.click();
		WebElement e7=driver.findElement(By.xpath("//span[.=\"Edit addresses for orders and gifts\"]"));
		e7.click();
		WebElement e8=driver.findElement(By.xpath("//div[@class=\"a-box first-desktop-address-tile\"]"));
		e8.click();
		FileInputStream f1=new FileInputStream("C:\\Users\\91999\\eclipse-workspace\\selenium_project\\Data_In_Excel\\DDT_project.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		  String flat=w1.getSheet("Login").getRow(4).getCell(0).getStringCellValue();
		  String area=w1.getSheet("Login").getRow(5).getCell(0).getStringCellValue();
		  String landmark=w1.getSheet("Login").getRow(6).getCell(0).getStringCellValue();
		  String city=w1.getSheet("Login").getRow(7).getCell(0).getStringCellValue();
		WebElement e9=driver.findElement(By.id("address-ui-widgets-enterAddressLine1"));
		e9.sendKeys(flat);
		WebElement e10=driver.findElement(By.id("address-ui-widgets-enterAddressLine2"));
		e10.sendKeys(area);
		WebElement e11=driver.findElement(By.id("address-ui-widgets-landmark"));
		e11.sendKeys(landmark);
		WebElement e12=driver.findElement(By.id("address-ui-widgets-enterAddressCity"));
		e12.sendKeys(city);
		
		
	}


}
