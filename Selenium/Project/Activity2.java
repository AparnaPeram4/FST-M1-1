package testNG_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	@BeforeMethod
    public void beforeMethod() {
        //Open a browser
        driver = new FirefoxDriver();
        
        //Navigate to 
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	@Test
    public void Testcase1() {
		 String title = driver.getTitle();
		 System.out.println("Page title is: " + title);
		//Assertion for title
		 Assert.assertEquals("SuiteCRM", title);
	}
	@Test
    public void Testcase2() {
		
		// identify image
      driver.findElement(By.xpath("//img[@alt=\"SuitCRM\"]")).getAttribute("src");
		//getAttribute() to get src of image
	}	
	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
