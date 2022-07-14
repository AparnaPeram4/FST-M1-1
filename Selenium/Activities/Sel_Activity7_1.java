package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_Activity7_1 {

	public static void main(String[] args) {
		
		//Load Firefox driver instance and load the web url
	
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		//Get the Title of the page 
		driver.getTitle();
		
		//Log in 
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		
		//Wait until the Welcome message loads
		
	
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back"));
        System.out.println("Text is :" +driver.findElement(By.id("action-confirmation")).getText());
        
        //Close Browser
        driver.close();

	}

}