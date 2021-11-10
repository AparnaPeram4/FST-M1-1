package testNG_CRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		// Create a new instance of the Firefox driver
				driver = new FirefoxDriver();
				//Open the browser
				driver.get("http://alchemy.hguy.co/crm");
			}
			
  @Test
  public void  CRMTestCase() throws InterruptedException {
	 
	//Find the username and password fields
	  WebElement username = driver.findElement(By.xpath("//input[@id = \"user_name\"]"));
	  WebElement password = driver.findElement(By.xpath("//input[@id = \"username_password\"]"));
	 
	//Enter credentials
	username.sendKeys("admin");
	password.sendKeys("pa$$w0rd");
	 
	//Click login
	  WebElement login = driver.findElement(By.xpath("//input[@id = \"bigbutton\"]"));
	  login.click();
	 
	  //Find “Salesmenu” menu
	  WebElement salesmenu = driver.findElement(By.xpath("//a[@id= \"grouptab_0\"]"));
	 
	  salesmenu.click();
	
	  WebElement Accounts = driver.findElement(By.xpath("//a[@id=\"moduleTab_9_Accounts\"]"));
	  Accounts.click();
	  Thread.sleep(5000);
	  Boolean Table =driver.findElement(By.xpath("//div[@class=\"list-view-rounded-corners\"]")).isDisplayed();
	  System.out.println("Table is Diaplayed: "+ Table);
	//Find first 5 odd-numbered rows
	  String ZeroRow = driver.findElement(By.xpath("//td[@class=\" inlineEdit\"]")).getText();
	  System.out.println("ZeroRowNumber Name is:" +ZeroRow);
	  String FirstRow = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[3]/td[3]")).getText();
	  System.out.println("FirstROwNumber Name is:" +FirstRow);
	  String ThirdRow = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[4]/td[3]")).getText();
	  System.out.println("ThirdROwNumber Name is:" +ThirdRow);
	  String FifthRow = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[6]/td[3]")).getText();
	  System.out.println("FifthROwNumber Name is:" +FifthRow);
	  String SeventhRow = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[8]/td[3]")).getText();
	  System.out.println("SeventhROwNumber Name is:" +SeventhRow);
	  
  }

	@AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.close();
  }
}
