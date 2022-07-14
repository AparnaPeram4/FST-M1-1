package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		//Open the url and print the title 
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("Title of the Page is :"+title);
		
		//Click on About Us 
		
	    driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
	    
	    //get title of the new page
	    
	   System.out.println("Title of the new page is :"+driver.getTitle());
	   
	   driver.close();
	    

	}

}