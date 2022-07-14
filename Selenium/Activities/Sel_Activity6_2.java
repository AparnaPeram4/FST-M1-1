package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_Activity6_2 {

	public static void main(String[] args) {
	// Set the Firefox instance
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		
		//Get the title of the website 
		
		driver.get("https://training-support.net/selenium/ajax");
		
		//Click on the Change Content button
		
		System.out.println("Title of the page is :" + driver.getTitle());
		driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).click();
		
		//wait for the conetnt to load 
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));
		  
		  //get the text and print it
		  
		  String ajaxText = driver.findElement(By.id("ajax-content")).getText();
		  System.out.println("Text is :"+ajaxText);
		  
		  //Wait until next text loads and then print it
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));
		  String lateText = driver.findElement(By.id("ajax-content")).getText();
		  System.out.println("Late text is :"+lateText);
		  
		  //Close browser
		  driver.close();
		  
}

}