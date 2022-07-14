package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity5_1 {
	//Set instance of Firefox 

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser 
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		//Find the checkbox and ensure its present on screen
		WebElement check_Box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The Checkbox is displayed :"+check_Box.isDisplayed());
		
		//Toggle the checkbox option i.e Add/Remove and then check if it present on screen
		
		driver.findElement(By.id("toggleCheckbox")).click();
		System.out.println("The Checkbox is displayed :"+check_Box.isDisplayed());
		
		//Close the browser
		
		driver.close();
		
}

}