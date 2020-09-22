package End_To_End_test_Cases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Cars {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		//launch website
		
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Click_Cars=driver.findElement(By.xpath("(//a[@class=\"uitk-tab-anchor\"])[3]"));
		Click_Cars.click();
		Thread.sleep(2000);
		WebElement Pickup=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[1]"));
		Pickup.sendKeys("YUL");
		Thread.sleep(4000);
		WebElement Select_Picup=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext\"])[1]"));
		Select_Picup.click();
		/*WebElement Dropoff=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[2]"));
		Dropoff.sendKeys("YUL");
		Thread.sleep(6000);
		WebElement select_dropoff=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext\"])[2]"));
		select_dropoff.click();
		*/
		Select pickup_time=new Select(driver.findElement(By.xpath("(//select[@class=\"uitk-field-select\"])[1]")));
		pickup_time.selectByIndex(36);
		Thread.sleep(2000);
		Select Dropoff_time=new Select(driver.findElement(By.xpath("(//select[@class=\"uitk-field-select\"])[2]")));
		Dropoff_time.selectByIndex(36);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary\"])[1]"));
		search.click();
		Thread.sleep(5000);
		WebElement reserve_car=driver.findElement(By.xpath("(//a[@class=\"btn btn-secondary btn-action ember-view\"])[1]"));
		// js executor to handle overwrapped elements
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",reserve_car);
		//reserve_car.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(reserve_car).click().perform();
		Set<String >Window_id=driver.getWindowHandles();
		Iterator<String> itr=Window_id.iterator();
		
		String Main_Window=itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement Reservenow=driver.findElement(By.xpath("(//a[@class=\"btn btn-secondary btn-action details-reserve-button-v1 ember-view\"])[1]"));
		Reservenow.click();
		Thread.sleep(3000);
		//WebElement checkout=driver.findElement(By.xpath("(//a[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-secondary\"])[1]"));
		//checkout.click();
		WebElement Fname=driver.findElement(By.xpath("(//input[@class=\"cko-field single-name-field gb-whitelist primary-traveler\"])[1]"));
		Fname.click();
		Select country= new Select(driver.findElement(By.xpath("(//select[@class=\"cko-field country-code always-include gb-whitelist\"])[1]")));
		country.selectByIndex(3);
		WebElement phone=driver.findElement(By.xpath("(//input[@class=\"text cko-field always-include gb-whitelist\"])[1]"));
		phone.sendKeys("1234567897");
		WebElement Noinsurance=driver.findElement(By.id("noinsuranceproductid"));
		Noinsurance.click();
		WebElement Name_on_card=driver.findElement(By.xpath("//input[@class=\"text billing-cardholder-name cko-field cardholder-above-cardname gb-whitelist\"]"));
		Name_on_card.sendKeys("Harsh Patel");
		WebElement Cardnumber=driver.findElement(By.id("creditCardInput"));
		Cardnumber.sendKeys("1234456778977895");
		Select Exp_Date=new Select(driver.findElement(By.xpath("//select[@class=\"cko-field cc-expiry-month gb-whitelist\"]")));
		Exp_Date.selectByIndex(2);
		Select Exp_year=new Select(driver.findElement(By.xpath("//select[@class=\"cko-field cc-expiry-year gb-whitelist\"]")));
		Exp_year.selectByIndex(3);
		WebElement Cvv=driver.findElement(By.id("new_cc_security_code"));
		Cvv.sendKeys("123");
		WebElement Postal_code=driver.findElement(By.xpath("//input[@class=\"text cko-field pwp-insurance-zipcode gb-whitelist\"]"));
		Postal_code.sendKeys("H3H2E7");
		WebElement Home_Page=driver.findElement(By.xpath("//img[@src=\"//www.expedia.ca/_dms/header/logo.svg?locale=en_CA&siteid=4\"]"));
		Home_Page.click();
  }
}
