package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_Activity9_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//Open browser
        driver.get("https://training-support.net/selenium/selects");
        
      //Chosen option
        WebElement chosen = driver.findElement(By.id("multi-value"));
        
      //Find multiList
        Select multiList = new Select(driver.findElement(By.id("multi-select")));
        
        if (multiList.isMultiple())
        {
        	//Select Java script by Visibile text
        	multiList.selectByVisibleText("Javascript");
        	System.out.println(chosen.getText());
        	
        	//Select "NodeJS' by value
        	multiList.selectByValue("node");
        	System.out.println(chosen.getText());
        	
        	//Select 4, 5 and 6 by Index
        	for (int i = 4 ;i<=6 ;i++) {
        		multiList.deselectByIndex(i);
        	}
        	System.out.println(chosen.getText());
        	
        	//Deselect NodeJS by value
        	
        	multiList.deselectByValue("node");
        	System.out.println(chosen.getText());
        	
        	//Deselect 7th option by Index
        	 multiList.deselectByIndex(7);
             System.out.println(chosen.getText());
             
             //Get all selected options
             List<WebElement> selectedOptions = multiList.getAllSelectedOptions();
             //Print all selected options
             for(WebElement selectedOption : selectedOptions) {
            	 System.out.println("Selected option: " + selectedOption.getText());
             }
             
             //Deselect All options 
             multiList.deselectAll();
             System.out.println(chosen.getText());
        	
        	
        }
        //Close browser
        driver.close();

	}

}