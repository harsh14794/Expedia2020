package End_To_End_test_Cases;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Signinbtn = driver.findElement(By.xpath("(//div[@class=\"uitk-type-300\"])[6]"));
		Signinbtn.click();
		Thread.sleep(3000);
		WebElement Create_Ac_Btn=driver.findElement(By.linkText("Sign in"));
		Create_Ac_Btn.click();
		Thread.sleep(3000);
		
		
		/*Actions actions = new Actions(driver);
		WebElement gml=driver.findElement(By.xpath("//button[@class=\"btn-secondary btn-sub-action  remove-margin recommended-button googleButton signin-login-google-button\"]"));
		actions.moveToElement(gml).perform();
		*/WebElement gmail=driver.findElement(By.xpath("(//span[@class=\"uitk-mark uitk-mark-medium\"])[3]"));
		gmail.click();
		Set<String >Window_id=driver.getWindowHandles();
		Iterator<String> itr=Window_id.iterator();
		String Main_Window=itr.next();
		String child_window=itr.next();
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement Uid=driver.findElement(By.id("identifierId"));
		Uid.sendKeys("vaishalbhatt07@gmail.com");
		WebElement next=driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[1]"));
		next.click();
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("(//input[@class=\"whsOnd zHQkBf\"])[1]"));
		password.sendKeys("Vaishal@1296");
		WebElement next2=driver.findElement(By.xpath("(//div[@class=\"VfPpkd-RLmnJb\"])[1]"));
		next2.click();
		driver.switchTo().window(Main_Window);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		WebElement Profile=driver.findElement(By.xpath("(//div[@class=\"uitk-type-300\"])[6]"));
		Profile.click();
		WebElement Logout=driver.findElement(By.xpath("(//a[@class=\"uitk-link uitk-link-layout-default uitk-type-300\"])[19]"));
		Logout.click();
  }
}
