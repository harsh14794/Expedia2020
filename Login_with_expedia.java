package End_To_End_test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_with_expedia {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","E:\\Expedia2020\\Web-Automation\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.expedia.ca");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Signinbtn = driver.findElement(By.xpath("(//div[@class=\"uitk-type-300\"])[6]"));
		Signinbtn.click();
		Thread.sleep(2000);
		WebElement Create_Ac_Btn=driver.findElement(By.linkText("Sign in"));
		Create_Ac_Btn.click();
		//WebElement Create_Ac_Btn= driver.findElement(By.xpath("//*[@id=\"gc-custom-header-nav-bar-acct-menu\"]/div/div/div/div/div[1]/div/div/a[1]"));//linkText("Create a free account"));
		//Create_Ac_Btn.click();
		Thread.sleep(4000);
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"emailAddress\"]"));
		Email.sendKeys("harshpatel14794@ymail.com");
		WebElement Continue_btn= driver.findElement(By.id("unifiedFormContinueBtn"));
		Continue_btn.click();
		Thread.sleep(3000);
		WebElement Password= driver.findElement(By.id("signInPassword"));
		Password.sendKeys("Harsh@1234");
		WebElement signinbtn= driver.findElement(By.id("signInBtn"));
		signinbtn.click();
		Thread.sleep(4000);
	   // WebElement password=driver.findElement(By.id("signin-loginid"));
	    //password.sendKeys("Harsh@1234");
  }
}
