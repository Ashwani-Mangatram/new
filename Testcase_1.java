package amazon_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_1 extends Launch_quit 
{
    @Test
    public void login_to_amazon() 
    {
    	
	    //driver.manage().window().maximize();
	  // driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D713930225169%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5976991092039298471%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9195646%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2402225%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    WebElement e1 = driver.findElement(By.id("ap_email"));
	    e1.sendKeys("9990015611");
	    WebElement e2 = driver.findElement(By.id("continue"));
	    e2.click();
	   WebElement e3 =  driver.findElement(By.id("ap_password"));
	   e3.sendKeys("9990015611");
	   WebElement e4 = driver.findElement(By.id("signInSubmit"));
	   e4.click();
    }
}
