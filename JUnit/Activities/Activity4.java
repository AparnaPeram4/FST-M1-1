package testNG_CRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	@BeforeMethod
    public void beforeMethod() {
        //Open a browser
        driver = new FirefoxDriver();
        
        //Navigate to 
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	@Test
    public void testcase3() throws InterruptedException {
		WebElement username = driver.findElement(By.id("user_name"));
		WebElement password = driver.findElement(By.id("username_password"));
		WebElement login = driver.findElement(By.id("bigbutton"));
		username.sendKeys("admin");
		password.sendKeys("pa$$w0rd");
		
		login.click();
		Thread.sleep(1000);
	}
	
	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}
