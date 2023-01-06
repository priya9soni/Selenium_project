package assignment_module7_seleniumjavaRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Robot s = new Robot();
		
		s.keyPress(KeyEvent.VK_PAGE_DOWN);
		s.keyRelease(KeyEvent.VK_PAGE_DOWN);
		s.keyRelease(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'4.5.0 (September 28, 2022)')]/preceding::*[9]")).click();
		Thread.sleep(5000);
    	driver.close();
		
	}

}
