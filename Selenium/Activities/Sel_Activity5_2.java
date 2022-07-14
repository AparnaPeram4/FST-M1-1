package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity5_2 {
	//Set instance of Firefox 

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser 
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		
		//Find and check if the checkbox is selected already
		WebElement check_Box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The Checkbox is selected :"+check_Box.isSelected());
		
		//Click the checkbox
		
		check_Box.click();
		
		// check if the checkbox is selected 
		System.out.println("The Checkbox is selected :"+check_Box.isSelected());
		
		//Close the browser
		
		driver.close();
		
}

}