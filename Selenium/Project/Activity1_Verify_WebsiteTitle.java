package testNG_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1_Verify_WebsiteTitle {
	
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
  public void test1() {
	  
	  //Get the Title of the page and see if it macthes with expected value 
	  
	  String title = driver.getTitle();
	  Assert.assertEquals("Alchemy LMS � An LMS Application", title);
	  System.out.println("Title :"+title);
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

  

}