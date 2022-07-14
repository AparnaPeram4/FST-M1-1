package testNG_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4_Title_PopularCourse {
	
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
  public void test3() {
	
	 
	  
	  //Verify the second most popularCourse
	  
	  WebElement  second_course = driver.findElement(By.xpath("(//div/h3[@class='entry-title'])[2]"));
	  
	  String course_title = second_course.getText();
	  Assert.assertEquals("Email Marketing Strategies", course_title);
	  System.out.println("second most popularCourse is :"+course_title);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}