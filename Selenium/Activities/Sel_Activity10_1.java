package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sel_Activity10_1 {

	public static void main(String[] args) {
	     WebDriver driver = new FirefoxDriver();
	     Actions actions = new Actions(driver);
	     //Open the url
	     driver.get("https://www.training-support.net/selenium/input-events");
	    
	     //Find the cube
	      WebElement cube = driver.findElement(By.id("wrapD3Cube"));
	      //Left click
	      actions.click(cube);
	      WebElement cubeValue = driver.findElement(By.className("active"));
	      System.out.println("Left Click :"+cubeValue.getText());
	      
	      //Double click
	      actions.doubleClick(cube).perform();
	      cubeValue = driver.findElement(By.className("active"));
	      System.out.println("Double Click: " + cubeValue.getText());
	      
	      
	      //Right click        
	        actions.contextClick(cube).perform();
	        cubeValue = driver.findElement(By.className("active"));
	        System.out.println("Right Click: " + cubeValue.getText());
	        
	        //Close Browser
	        driver.close();
	 
	      
	      

	}

}