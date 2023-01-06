package topic_TestNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test11_BC_AC {
	public WebDriver driver;
  
	@BeforeMethod
  public void setup() throws InterruptedException {
	  
	  //launch the chrome browser
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  Thread.sleep(5000);
  }
	
	@AfterMethod
	  public void teaddown()
	  {
		   driver.close();
	  }
  @Test(priority = 1)
 
  public void verifyGooglePage() throws InterruptedException {
	  
	  driver.get("https://www.google.com/");
	  Thread.sleep(5000);
	  String expTitle = "Google";
	 String actTitle = driver.getTitle();
	 Assert.assertEquals(actTitle, expTitle);
	 Thread.sleep(5000);
}
  @Test(priority = 2)
  public void verifySeleniumPage() throws InterruptedException {
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(5000);
	  String expTitle = "Selenium";
	  String actTitle = driver.getTitle();
	  Thread.sleep(5000);
  }
  
  @Test(priority = 3)
  public void verifybhanusaiPage() throws InterruptedException {
	  driver.get("https://bhanusaii.wordpress.com/");
	  Thread.sleep(5000);
	  String expTitle = "Bhanu Sai";
	  String actTitle = driver.getTitle();
	  Thread.sleep(5000);
  
  } 

  

  }

