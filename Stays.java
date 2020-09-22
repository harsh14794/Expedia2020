package End_To_End_test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Iterator;		
import java.util.Set;

public class Stays {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		
		//launch website
		
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"wizard-hotel-pwa-v2-1\\\"]/div[3]/div[2]/button")));
	//WebElement Passs=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[3]/div/div/button[1]"));
		//Passs.click();
		//WebElement Pass=driver.findElement(By.className("uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating"));
		//Pass.click();
		
		WebElement going_to=driver.findElement(By.xpath("(//button[@class=\"uitk-faux-input\"])[1]"));
		going_to.sendKeys("YUL");
		Thread.sleep(2000);
		WebElement Enter_Destination=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-typeahead uitk-type-left has-subtext\"])[1]"));
		Enter_Destination.click();

		WebElement Search_Button= driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary\"])[1]"));
		Search_Button.click();
		
		WebElement hotel_list=driver.findElement(By.xpath("(//a[@class=\"listing__link uitk-card-link\"])[1]"));
		hotel_list.click();
		
		//to switch tab window
		
		Set<String >Window_id=driver.getWindowHandles();
		Iterator<String> itr=Window_id.iterator();
		
		String Main_Window=itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		//new tab 
		
		
		WebElement reserve_room=driver.findElement(By.xpath("(//button[@class=\"uitk-button uitk-button-small uitk-button-has-text uitk-button-primary uitk-button-new-primary\"])[1]"));
		reserve_room.click();
		//driver.switchTo().alert().accept();
		WebElement Paynow=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/section/div/div[1]/div/div[2]/div[2]/div/div/form/button"));
		Paynow.click();
		Thread.sleep(3000);
	//	WebElement Check_out_asguest=driver.findElement(By.className("uitk-button uitk-button-small uitk-button-fullWidth uitk-button-secondary"));
		//Check_out_asguest.click();
		WebElement Payment_name=driver.findElement(By.id("hotel-contact-name0"));
		Payment_name.sendKeys("Harsh");
		Select Country_Code= new Select(driver.findElement(By.id("oneLinePhoneNumberCountryCodeHiddenSelect")));
		Country_Code.selectByIndex(1);
		WebElement phone=driver.findElement(By.xpath("//input[@class=\"text cko-field phone-number gb-whitelist \"]"));
		phone.sendKeys("1234567894");
		Thread.sleep(2000);
		//WebElement Radio=driver.findElement(By.xpath("//input[@id=\"noinsuranceproductid\"]"));
		//Radio.click();
		
		//payment section
		
		WebElement Name_on_card=driver.findElement(By.xpath("//input[@class=\"text billing-cardholder-name cko-field cardholder-above-cardname gb-whitelist\"]"));
		Name_on_card.sendKeys("Harsh Patel");
		WebElement Card_Number=driver.findElement(By.id("creditCardInput"));
		Card_Number.sendKeys("1234456777778989");
		Select Exp_Month=new Select(driver.findElement(By.name("creditCards[0].expiration_month")));
		Exp_Month.selectByIndex(1);
		Select Exp_Year=new Select(driver.findElement(By.name("creditCards[0].expiration_year")));
		Exp_Year.selectByIndex(1);
		WebElement Cvv=driver.findElement(By.xpath("(//input[@class=\"text cko-field cvv\"])"));
		Cvv.sendKeys("123");
		WebElement Postal_code=driver.findElement(By.xpath("//input[@class=\"text cko-field pwp-insurance-zipcode gb-whitelist\"]"));
		Postal_code.sendKeys("H3H2E7");
		WebElement Email=driver.findElement(By.xpath("//input[@class=\"text cko-field always-include gb-whitelist \"]"));
		Email.sendKeys("harshpaatel14794@gmail.com");
		WebElement Home_Page=driver.findElement(By.xpath("//img[@src=\"//www.expedia.ca/_dms/header/logo.svg?locale=en_CA&siteid=4\"]"));
		Home_Page.click();
  }
        }
 