package assignment_module7_seleniumjavaRobot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://launchpad.net/sikuli/+download");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on all download
		//driver.findElement(By.xpath("//a[text()='All downloads']/ancestor::*[1]")).click();
		//Thread.sleep(5000);
		
		//click on selenium jar
		driver.findElement(By.xpath("//a[contains(text(),'sikulixsetup-1.1.2.jar')]/ancestor::*[1]")).click();
		Thread.sleep(5000);
		
		StringSelection s = new StringSelection("C:\\Automation");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(15000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(15000);
		
		
		
		driver.close();
		
	}

}
