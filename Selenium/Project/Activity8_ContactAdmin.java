package testNG_Projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Activity8_ContactAdmin {
	
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
  public void test_8() {
	  
	  driver.findElement(By.linkText("Contact")).click();
	  driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]")).sendKeys("Sujith Salyan");
	  driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]")).sendKeys("test@example.com");
	  driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]")).sendKeys("Training");
	  driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]")).sendKeys("Email me back");
	  driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
	  String conf_Message = driver.findElement(By.id("wpforms-confirmation-8")).getText();
	  System.out.println("Confirmation Message : "+conf_Message);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}