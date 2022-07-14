package testNG_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9_CompleteAlesson {
	
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
  public void test9() {
	  
	  //Find any course under All Courses and complete a  lesson
	  
	  driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)")).click();
	  driver.findElement(By.xpath("//div[@class='ld_course_grid col-sm-8 col-md-4 '][1]")).click();
	  driver.findElement(By.xpath("//a[@class='ld-button']")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("root");
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  driver.findElement(By.xpath("(//a[@class='ld-item-name ld-primary-color-hover'])[3]")).click();
	  System.out.println ("Title of the lesson is: "+ driver.getTitle());
	  
	  List<WebElement> complte_button = driver.findElements(By.xpath("//input[@class ='learndash_mark_complete_button']"));
	  if (!complte_button.isEmpty()) {
		  complte_button.get(0).click();
	  }
	  else {
		  System.out.println("Mark Complete button does not exist");
	  }
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}