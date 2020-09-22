package End_To_End_test_Cases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Things_To_Do {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		//launch website
		
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Click_Cars=driver.findElement(By.xpath("(//a[@class=\"uitk-tab-anchor\"])[5]"));
		Click_Cars.click();
		WebElement location=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[1]"));
		location.sendKeys("Montreal");
		Thread.sleep(3000);
		WebElement sl=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext\"])[1]"));
		sl.click();
		WebElement serach_events=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary\"])[1]"));
		serach_events.click();
		Thread.sleep(3000);
		WebElement select_event=driver.findElement(By.xpath("(//a[@class=\"uitk-card-link\"])[1]"));
		select_event.click();
		Set<String >Window_id=driver.getWindowHandles();
		Iterator<String> itr=Window_id.iterator();
		
		String Main_Window=itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement book=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-has-text uitk-button-primary\"])[2]"));
		book.click();
		Thread.sleep(2000);
		WebElement fname=driver.findElement(By.id("traveler_name_0"));
		fname.sendKeys("Harsh");
		Select country=new Select(driver.findElement(By.xpath("//select[@class=\"cko-field country-code always-include gb-whitelist\"]")));
		country.selectByIndex(2);
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.xpath("//input[@class=\"text cko-field phone-number always-include gb-whitelist\"]"));
		phone.sendKeys("1234567897");
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
