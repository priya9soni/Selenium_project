package assignment_module3_selenium_browser_automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assi4_FF {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(5000);

		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);


		//title of the page
		String title = driver.getTitle();
		System.out.println("title of the page"+" "+title);
		if (title.equalsIgnoreCase("Google"))
		{
			System.out.println("title is match");

		}
		else
		{
			System.out.println("title not match");

		}

		//new window 
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(5000);
		
		
		 //id locator 
		driver.findElement(By.id("tabButton")).click();
	  Thread.sleep(5000);
		 


		//handing th multiple tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);

		//switch from 0th to 1st tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);





		//title of the page
		String titl = driver.getTitle();
		System.out.println("title of the page"+" "+titl);
		Thread.sleep(5000);
		
	

		//switch from 1st to 0th tab
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(5000);

		//title of the page
		String tit = driver.getTitle();
		System.out.println("title of the page"+" "+tit);
		Thread.sleep(5000);






		driver.quit();

	}

}
