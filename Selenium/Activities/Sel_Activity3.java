package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		//Find page Title and print it 
		WebElement firstName = driver.findElement(By.id("firstName"));
		WebElement lastName = driver.findElement(By.id("lastName"));
		
		//Enter Names
		
		firstName.sendKeys("Sujith");
		lastName.sendKeys("Salyan");
		
		//Enter Email and contract number 
		
		driver.findElement(By.id("email")).sendKeys("test123@testing.com");
		driver.findElement(By.id("number")).sendKeys("9876543210");
		
		//Click Submit
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		//Close the browser
		driver.close();
		
		
	}

}