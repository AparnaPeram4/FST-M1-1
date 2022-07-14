package testNG_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity2_Verify_WebsiteHeading {
	
	WebDriver driver ;
	WebDriverWait wait;
 
  
  @BeforeMethod
  public void beforeClass() {
	// Create new instance of Webdriver
	  driver = new FirefoxDriver();
	  //Wait 
	  wait = new WebDriverWait(driver,5);
	  //Open the Website 
	  driver.get("https://alchemy.hguy.co/lms");
  }
  
  @Test
  public void test2() {
	  
	  //Get the Heading of the page and see if it matches with expected value 
	  
	  WebElement header_locator = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
	  String header = header_locator.getText();
	  Assert.assertEquals("Learn from Industry Experts", header);
	  System.out.println("Page Heading :"+header);
  }

  @AfterMethod
  public void afterClass() {
	  //Close Browser
	  driver.close();
  }

  

}