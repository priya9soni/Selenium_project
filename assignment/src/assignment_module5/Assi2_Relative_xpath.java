package assignment_module5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi2_Relative_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		
		//create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		
		//firstname
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Priya");
		Thread.sleep(5000);
		
		//surname
		driver.findElement(By.xpath("//input[@name='lastname' or @name ='reg_email__']")).sendKeys("soni");
		Thread.sleep(5000);
		
		//mob no
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("8402983467");
		Thread.sleep(5000);
		
		//new pass
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Po$234");
		Thread.sleep(5000);
	
		
		
		
		Select day = new Select(driver.findElement(By.xpath("//select[@name='birthday_day' or @name='birthday_month']")));
		day.selectByValue("4");
		Thread.sleep(5000);
		
		
		
		
		
		driver.close();
		

	}

}
