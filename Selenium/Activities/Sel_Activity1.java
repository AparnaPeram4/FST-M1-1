package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sel_Activity1 {
	//@Test (groups = { "Car" })
	//@Test (dependsOnMethods = {"OpenBrowser"})
	@Test (priority = 0)

	public static void main(String[] args) {
		// Create new instance of Webdriver
	WebDriver driver = new FirefoxDriver();
	
	
	//open the browser 
	driver.get("https://www.training-support.net");
	
	//close the browser
	driver.close();
	
	WebElement userName = driver.findElement(By.id("username"));
	driver.navigate().to
	
	Select select = new Select(driver.findElement(By.id("SSS")));
	
	select.SelectByIndex	
	
	@Test (groups= {"Car"})
	@Test (priority = 0)
	
	

	}

}