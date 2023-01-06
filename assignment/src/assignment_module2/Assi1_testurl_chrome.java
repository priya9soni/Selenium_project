package assignment_module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi1_testurl_chrome {

	public static void main(String[] args) throws InterruptedException {
		// This is test comment
		/*
		 * System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe"); WebDriver
		 * drive = new FirefoxDriver(); drive.get("https://Google.com");
		 * Thread.sleep(5000); drive.close();
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		  ChromeDriver drive = new ChromeDriver();
		  drive.get("https://Google.com");
		  Thread.sleep(5000);
		  drive.close();
	}

}
