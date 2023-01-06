package assignment_module4_selenium_element_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi1_fblocator_dhropdown_chrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		//username
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		Thread.sleep(5000);
		
		//lastname
		driver.findElement(By.name("lastname")).sendKeys("soni");
		Thread.sleep(5000);
		
		//mob no
		driver.findElement(By.name("reg_email__")).sendKeys("8401947357");
		Thread.sleep(5000);
		
		//new pass
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pr1234@");
		Thread.sleep(5000);
		
		//dhropdown day with select
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("4");
		//day.selectByIndex(3);
		Thread.sleep(5000);
		
		//dhropdown month with select
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("1");
		month.selectByIndex(0);
		Thread.sleep(5000);
		
		//dhropdown year with select
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("2021");
		year.selectByIndex(1);
		Thread.sleep(5000);
		
		driver.close();
	}

}
