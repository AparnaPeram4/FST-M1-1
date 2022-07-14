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
public class Activity6_Login_ConfirmSuccessful {
	
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
  public void test6() {
      driver.findElement(By.xpath("//a[text()='My Account']")).click();
      String pageTitle = driver.getTitle();
      Assert.assertEquals("My Account – Alchemy LMS", pageTitle);
      driver.findElement(By.xpath("//a[text()='Login']")).click();
      driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
      driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
      driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
     
      
    WebElement logoutButton = driver.findElement(By.cssSelector("a.ld-logout.ld-login-text.ld-login-button.ld-button"));
 	Assert.assertTrue(logoutButton.isEnabled());
 	
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}


