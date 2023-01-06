package assignment_module2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi3_testurl_ff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://Google.com");
		Thread.sleep(5000);
		String title = driver.getTitle();
	
		System.out.println("title of the page"+" "+title);
		
		driver.close();
	}

}
