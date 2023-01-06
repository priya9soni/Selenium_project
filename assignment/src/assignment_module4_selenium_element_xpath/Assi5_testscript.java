package assignment_module4_selenium_element_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi5_testscript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("dhruv");
		Thread.sleep(5000);
		firstname.clear();
		Thread.sleep(5000);
		firstname.sendKeys("priya");
		Thread.sleep(5000);
		String fname = firstname.getAttribute("value");
		System.out.println(fname);
	
		driver.close();

	}

}
