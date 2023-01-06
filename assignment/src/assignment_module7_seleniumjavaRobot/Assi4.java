package assignment_module7_seleniumjavaRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi4 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//java robot
		Robot s= new Robot();
		s.keyPress(KeyEvent.VK_PAGE_DOWN);
		s.keyRelease(KeyEvent.VK_PAGE_DOWN);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		
	 //driver.findElement(By.xpath("//h2[contains(text(),'Selenium Clients and WebDriver')]")).getText();
	 //Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[text()='Python']")).getText();
		System.out.println("paython");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//p[text()='Java']")).getText();
		System.out.println("Java");
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
