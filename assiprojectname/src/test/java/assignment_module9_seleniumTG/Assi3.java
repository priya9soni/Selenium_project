package assignment_module9_seleniumTG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assi3 {
  @Test
  public void SDlogin() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(5000);
	  //fill the username with input
	  driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  Thread.sleep(5000);
	  String expURL = "https://www.saucedemo.com/inventory.html";
	  String actURL = driver.getCurrentUrl();
	  Assert.assertEquals(actURL, expURL);
	  
	  
	  driver.close();
  }
}
