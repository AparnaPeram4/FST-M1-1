package testNG_CRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	@BeforeMethod
    public void beforeMethod() {
        //Open a browser
        driver = new FirefoxDriver();
        
        //Navigate to 
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	@Test
    public void Title() {
		 String title = driver.getTitle();
		 System.out.println("Page title is: " + title);
		//Assertion for title
		 Assert.assertEquals("SuiteCRM", title);
	}
	
	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
