package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity2 {

	public static void main(String[] args) {
	 //Create New instance of Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//Open website
		
		driver.get("https://www.training-support.net");
		
		//Check the Page title
		String title = driver.getTitle();
		System.out.println("Title of the page is :" +title);
		
		//Find About Us link using id 
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element is : " +idLocator.getText());
		
		//Find About Us link using class Name
		
		WebElement classLocator = driver.findElement(By.className("green"));
		System.out.println("Text in element is : "+classLocator.getText() );
		
		//Find About Us link using css selector
		WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element is : "+cssLocator.getText() );
		
	    //Find About Us link using link test
		
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println("Text in Element is: "+linkTextLocator.getText());
		
		//Close the browser 
		driver.close();
		
		
		
		
		

	}

}