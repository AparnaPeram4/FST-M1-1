package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel_Activity6_1 {

	public static void main(String[] args) {
		
		//Set the instance of Firefox
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//Open the browser
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Title of the page is :" +driver.getTitle());
		
		//Find the checkbox  and toggle button
		
		WebElement check_box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		
		//Click on toggle button
		
		toggleButton.click();
		//Wait till the check box diappears 
		
		//Click on toggle button
		
		wait.until(ExpectedConditions.invisibilityOf(check_box));
		toggleButton.click();
		
		//Wait again till checkbox reappears 
		
		wait.until(ExpectedConditions.visibilityOf(check_box));
		check_box.click();
	
		
		driver.close();
		
		
		
	}

}