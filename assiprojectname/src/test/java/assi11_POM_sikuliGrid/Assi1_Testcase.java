package assi11_POM_sikuliGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assi1_Testcase {
	WebDriver driver;
	Assi1_LoginPOM login;
	
  @Test
  public void setup() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(5000);
	  
	  login=new Assi1_LoginPOM(driver);
	  login.type_username("standard_user");
	  login.type_password("secret_sauce");
	  login.click_Login();
	  
	  String expURL = "https://www.saucedemo.com/inventory.html";
	  String actURL = driver.getCurrentUrl();
	  Assert.assertEquals(actURL, expURL);
	  Thread.sleep(5000);
	  driver.close();
  }
}
