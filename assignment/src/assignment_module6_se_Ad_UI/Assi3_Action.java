package assignment_module6_se_Ad_UI;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi3_Action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//double click on button
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a = new Actions(driver);
		//a.doubleClick(button).build().perform();
		a.contextClick(button).build().perform();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();
		//Thread.sleep(5000);
	
		driver.close();
		
		
	}

}
