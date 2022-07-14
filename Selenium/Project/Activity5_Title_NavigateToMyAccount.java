package testNG_Projects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity5_Title_NavigateToMyAccount {
	
	WebDriver driver ;
	WebDriverWait wait;
 
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	// Create new instance of Webdriver
		  driver = new FirefoxDriver();
		  //Wait 
		  wait = new WebDriverWait(driver,5);
		  //Open the Website 
		  driver.get("https://alchemy.hguy.co/lms");
		  
		  driver.manage().window().maximize();
		 
  }
  @Test
  public void test5() {
	  
	  //JavascriptExecutor js = (JavascriptExecutor) driver;
	  //js.executeScript("window.scrollBy(0,350)", "");
	  
	 
	  
	  //Navigate to My account and ensure you are on right page
	  
	  driver.findElement(By.linkText("My Account")).click();
	  
	 String myAccountTitle = driver.getTitle();
	  
	 
	  Assert.assertEquals("My Account � Alchemy LMS", myAccountTitle);
	  System.out.println("My Account page title :"+myAccountTitle);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}