package assignment_module5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi1_Relative_xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		
		
		drive.findElement(By.xpath("//input[@id='email']")).sendKeys("Pr@123");
		Thread.sleep(5000);
		
		drive.findElement(By.xpath("//input[@name='pass']")).sendKeys("Pp$1234");
		
		Thread.sleep(5000);
		
		drive.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);

		drive.close();
		
	}

}
