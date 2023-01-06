package assignment_module3_selenium_browser_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assi5_chrome_navigate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
		Thread.sleep(5000);
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//navigate to
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(5000);
		
		//navigate back
		driver.navigate().back();
		Thread.sleep(5000);
		
		//navigate forword
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(5000);

		
		
		driver.close();

	}

}
