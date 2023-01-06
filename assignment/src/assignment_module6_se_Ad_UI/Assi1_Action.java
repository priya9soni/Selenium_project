package assignment_module6_se_Ad_UI;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi1_Action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on X
		driver.findElement(By.xpath("(//span[text()='Login'])[2]/preceding::*[24]")).click();
		Thread.sleep(5000);
		
		//move mouse to more link\
		WebElement more = driver.findElement(By.xpath("//div[text()='More']/parent::*[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(more).build().perform();
		
		Thread.sleep(5000);
		
		//notification-preference
		driver.findElement(By.xpath("//*[text()='Notification Preferences']")).click();
		Thread.sleep(5000);
		//hower the women
		WebElement e = driver.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		//click on sarees
		driver.findElement(By.xpath("//a[text()='Sports Shoes']Thread.sleep(5000);")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
