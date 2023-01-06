package assignment_module7_seleniumjavaRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on got it button
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		Thread.sleep(5000);
		
		//click on choosefile button
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(5000);
		
		//put of file
		//put the data into clipboard
		StringSelection r = new StringSelection("C:\\Automation\\test1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(r, null);
		Thread.sleep(5000);
		
		//paste operation
		//Implementing java Robot
		Robot s = new Robot();
		
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(14000);
		
		//click download button
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		Thread.sleep(5000);
		
		//click save to devise
		driver.findElement(By.xpath("//div[text()='Save to device']")).click();
		Thread.sleep(5000);

		
		driver.close();
	}

}
