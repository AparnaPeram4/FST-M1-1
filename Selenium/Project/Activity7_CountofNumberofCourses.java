package testNG_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class Activity7_CountofNumberofCourses {
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
  public void test7() {
	  
	  //Count the No of Courses 
	  
	  driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)")).click();
	 int count_test = driver.findElements(By.xpath("(//div/h3[@class='entry-title'])")).size();
	 System.out.println("Number of Popular Courses displayed on the page are :" +count_test);
  }
 

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}