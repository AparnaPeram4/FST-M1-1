package seleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_Activity8_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		//Get Columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
		//Get Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		
		//Number of Columns and rows respectively
		System.out.println("Number of Columns :" +cols.size());
		System.out.println("Number of Columns :" +rows.size());
		
		//Get third row values and print them
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
		for(WebElement cellValue:thirdRow) {
			System.out.println("Third row values :"+cellValue.getText());
		}
		
		//Value of second row,second column
		WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Value of second row,second column is:"+cellValue2_2.getText());
		
		//Close Browser
		
		driver.close();
		

	}

}