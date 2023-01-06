package topic_TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_VP2 {
@Test
	
	public void verifySDLogin() throws InterruptedException 
	{
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		//fill the username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		//fill the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		
		//login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		
		//verification point
		String expURL = "inventory.html";
		String actURL = driver.getCurrentUrl();
		if (actURL.contains(expURL)) 
		{
			System.out.println("Login success-Test passed");
		}
		else 
		{
			System.out.println("Login Failed-Test Failed");
		}
		driver.close();
		
		

	}
}
