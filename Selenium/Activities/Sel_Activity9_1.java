package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_Activity9_1 {

	public static void main(String[] args) {
		
		//Set the Firefox instance
		
		WebDriver driver = new FirefoxDriver();
		
		//open the browser
		driver.get("https://training-support.net/selenium/selects ");
		
		//Option chose at the moment
		
	WebElement Chosen = driver.findElement(By.id("single-value"));
	
	//find dropdown
	 Select dropdown = new Select(driver.findElement(By.id("single-select")));
	 
	 //Select second option by visible text
	 dropdown.selectByVisibleText("Option 2");
	 System.out.println(Chosen.getText());
	 
	 //Select third option by index
	 dropdown.selectByIndex(3);
	 System.out.println(Chosen.getText());
	 
	 //Select fourth option by Value
	 dropdown.selectByValue("4");
	 System.out.println(Chosen.getText());
	 
	 //Get all the option present in dropdown
	 List<WebElement> options = dropdown.getOptions();
	 //Print them
	 for(WebElement option: options)
	 {
		 System.out.println("Option:"+option.getText());
	 }
	 
	 //Close browser
	 driver.close();
	 
	

	}

}	