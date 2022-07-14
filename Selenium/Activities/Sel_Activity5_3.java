package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity5_3 {
	//Set instance of Firefox 

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser 
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		
		//Find and check if the textbox is enabled already 
		WebElement text_Box = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("The Textbox is enabled :"+text_Box.isEnabled());
		
		//Toggle input textbox
		
		driver.findElement(By.id("toggleInput")).click();
		
		// check if the text input is enabled now  
		System.out.println("The Textbox is enabled :"+text_Box.isEnabled());
		
		//Close the browser
		
		driver.close();
		
}

}