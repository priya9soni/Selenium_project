package assi11_POM_sikuliGrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assi3 {
	WebDriver driver;
  @Test
  public void sdLogin() throws IOException, InterruptedException {
	  
	  Properties prop = new Properties();
	  FileInputStream ip =new FileInputStream("C:\\Automation\\assiprojectname\\src\\test\\java\\assi11_POM_sikuliGrid\\config.properties");
	  prop.load(ip);
	  
	  System.out.println("name");
	  
	  //name
	   String Name = prop.getProperty("name");
	  System.out.println(Name);
	  
	  //age
	  String Age = prop.getProperty("age");
	  System.out.println(Age);
	  
	  
	  //browser
	  String Browser = prop.getProperty("browser");
	  System.out.println(Browser);
	  
	  
	  //URL
	  String URL = prop.getProperty("url");
	  System.out.println(URL);
	  
	  if (Browser.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 driver= new ChromeDriver();
		Thread.sleep(5000);
	}
	  if (Browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			
		 driver = new EdgeDriver();
			Thread.sleep(5000);
			
		}
		
		if (Browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
			
			Thread.sleep(5000);
			
		}
		driver.get(URL);
		driver.findElement(By.xpath(prop.getProperty("Usernamefield"))).sendKeys(prop.getProperty("username"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("Loginbutton"))).click();
		Thread.sleep(5000);
		driver.close();
		
  }
}
