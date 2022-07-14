package testNG_Projects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity3_Title_FirstInfobox {
	
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
  public void test4() {
	  
	  //JavascriptExecutor js = (JavascriptExecutor) driver;
	  //js.executeScript("window.scrollBy(0,350)", "");
	  
	 
	  
	  //Verify the Title of the first infobox
	  
	  WebElement  first_infobox = driver.findElement(By.xpath("//div[1]/div[2]/div/div/div/div/div[2]/h3"));
	  
	  String infobox_title = first_infobox.getText();
	  Assert.assertEquals("Actionable Training", infobox_title);
	  System.out.println("Fist Infobox title :"+infobox_title);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}