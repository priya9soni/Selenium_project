package assignment_module2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assi1_testurl_firefox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.com/");
		 Thread.sleep(5000);
		 driver.close();
	}

}