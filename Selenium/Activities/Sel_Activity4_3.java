package seleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity4_3 {

	public static void main(String[] args) {
		
		//Open the webiste and print its Title of home page
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title = driver.getTitle();
		System.out.println("Title of the page is :"+title);
		
		//Find and print third header text
		
		String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
		System.out.println("Third Header text is :"+thirdHeader);
		
		//find and print 5th header colour
		
		String fifthHeadercolur = driver.findElement(By.xpath("//div/div/div/div[1]/h5")).getCssValue("color");
		System.out.println("Fifth Header text colour is :"+fifthHeadercolur);
		
		//Get classes of Violet button and print it
		String violetButtonClasses = driver.findElement(By.xpath("//div[2]/div[2]/button[3]")).getAttribute("Class");
		System.out.println("Classes of Violet button are :"+violetButtonClasses);
		
		//Find the text of grey button using absolute x path
		
		String greyButtonText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Text of the grey button is : "+greyButtonText);
		
		//close the browser 
		driver.close();
				
		
		
		

	}

}