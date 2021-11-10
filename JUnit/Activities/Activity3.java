package testNG_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	@BeforeMethod
    public void beforeMethod() {
        //Open a browser
        driver = new FirefoxDriver();
        
        //Navigate to 
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	@Test
    public void testcase3() {
		WebElement text = driver.findElement(By.id("admin_options"));
		System.out.println("Print the text"+text.getText());
	}
	
	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
