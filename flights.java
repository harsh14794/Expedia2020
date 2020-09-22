package End_To_End_test_Cases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class flights {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		//launch website
		
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Click_flights=driver.findElement(By.xpath("(//a[@class=\"uitk-tab-anchor\"])[2]"));
		Click_flights.click();
		WebElement Oneway=driver.findElement(By.xpath("(//a[@class=\"uitk-tab-anchor\"])[8]"));
		Oneway.click();
		Thread.sleep(2000);
		WebElement Leaving_From=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[1]"));
		Leaving_From.sendKeys("YUL");
		Thread.sleep(4000);
		WebElement select_location=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext\"])[1]"));
		select_location.click();
		WebElement  Going_to=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[2]"));
		Going_to.sendKeys("YYC");
		Thread.sleep(3000);
		WebElement Select_gngto=driver.findElement(By.xpath("(//button[@data-stid=\"location-field-leg1-destination-result-item-button\"])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",Select_gngto);
		
		Thread.sleep(4000);
		
		/*WebElement Sel=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/ul/li[1]/button"));
		Sel.click();
		*/WebElement search=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary\"])[1]"));
		search.click();
		WebElement search_flight=driver.findElement(By.xpath("(//button[@class=\"btn-secondary btn-action t-select-btn\"])[3]"));
		search_flight.click();
	/*	WebElement slt_fare=driver.findElement(By.xpath("(//button[@class=\"btn-secondary btn-action t-select-btn\"])[2]"));
		slt_fare.click();
		*/Thread.sleep(5000);
		WebElement nothannks=driver.findElement(By.id("forcedChoiceNoThanks"));
		nothannks.click();
		Set<String >Window_id=driver.getWindowHandles();
		Iterator<String> itr=Window_id.iterator();
		
		String Main_Window=itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		WebElement Cnf_booking=driver.findElement(By.id("bookButton"));
		Cnf_booking.click();
		Thread.sleep(3000);
		WebElement First_name=driver.findElement(By.id("firstname[0]"));
		First_name.sendKeys("Harsh");
		WebElement Last_Name=driver.findElement(By.id("lastname[0]"));
		Last_Name.sendKeys("Patel");
		Thread.sleep(2000);
		Select cC=new Select(driver.findElement(By.xpath("//select[@class=\"cko-field always-include gb-whitelist alpha3CountryCode\"]")));
		cC.selectByIndex(1);
		WebElement phone_number=driver.findElement(By.xpath("(//input[@class=\"text cko-field always-include gb-whitelist\"])[2]"));
		phone_number.sendKeys("1234567891");
		WebElement gender=driver.findElement(By.id("gender_male[0]"));
		gender.click();
		Select Date=new Select(driver.findElement(By.id("date_of_birth_day[0]")));
		Date.selectByIndex(2);
		Thread.sleep(2000);
		Select Month=new Select(driver.findElement(By.id("date_of_birth_month0")));
		Month.selectByIndex(2);
		Thread.sleep(2000);
		Select Year=new Select(driver.findElement(By.id("date_of_birth_year[0]")));
		Year.selectByIndex(2);
		Thread.sleep(2000);
		WebElement P2F_name=driver.findElement(By.id("firstname[1]"));
		P2F_name.sendKeys("Jeet");
		WebElement P2gender=driver.findElement(By.id("gender_male[1]"));
		P2gender.click();
		Select P2Day=new Select(driver.findElement(By.id("date_of_birth_day[1]")));
		P2Day.selectByIndex(1);
		Thread.sleep(2000);
		Select P2Month=new Select(driver.findElement(By.id("date_of_birth_month1")));
		P2Month.selectByIndex(2);
		Thread.sleep(2000);
		Select P2Year=new Select(driver.findElement(By.id("date_of_birth_year[1]")));
		P2Year.selectByIndex(3);
		Thread.sleep(2000);
		WebElement nocoverage=driver.findElement(By.id("noinsuranceproductid"));
		nocoverage.click();
		WebElement Cardnum=driver.findElement(By.id("creditCardInput"));
		Cardnum.sendKeys("1234456778977895");
		Select Exp_month=new Select(driver.findElement(By.xpath("//select[@name=\"expiration_month\"]")));
		Exp_month.selectByIndex(1);
		Thread.sleep(2000);
		Select Exp_year=new Select(driver.findElement(By.xpath("//select[@name=\"expiration_year\"]")));
		Exp_year.selectByIndex(5);
		Thread.sleep(2000);
		WebElement Cvv=driver.findElement(By.xpath("//input[@class=\"text cko-field cvv\"]"));
		Cvv.sendKeys("123");
		Select Country=new Select(driver.findElement(By.xpath("//select[@class=\"cko-field billing-country elv-field gb-whitelist\"]")));
		Country.selectByIndex(1);;
		WebElement Billing_Address=driver.findElement(By.xpath("//input[@class=\"text billing-address-one cko-field gb-whitelist\"]"));
		Billing_Address.sendKeys("1225 rue saint marc");
		WebElement City=driver.findElement(By.xpath("//input[@class=\"text billing-city cko-field gb-whitelist\"]"));
		City.sendKeys("Montreal");
		Select Province=new Select (driver.findElement(By.xpath("//select[@class=\"billing-state-dropdown cko-field billing-state-select gb-whitelist\"]")));
		Province.selectByIndex(2);;
		Thread.sleep(2000);
		WebElement postal_code=driver.findElement(By.xpath("//input[@class=\"text billing-postal-code cko-field gb-whitelist\"]"));
		postal_code.sendKeys("H3H2E7");
		WebElement Home_Page=driver.findElement(By.xpath("//img[@src=\"//www.expedia.ca/_dms/header/logo.svg?locale=en_CA&siteid=4\"]"));
		Home_Page.click();

  }
  
}
