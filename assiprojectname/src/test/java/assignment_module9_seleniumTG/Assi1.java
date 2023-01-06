package assignment_module9_seleniumTG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assi1 {

	//public static void main(String[] args) throws InterruptedException 
	@Test
	public void verifySDLogin() throws InterruptedException {
		
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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
				String expURL = "https://www.saucedemo.com/inventory.html";
				String actURL = driver.getCurrentUrl();
				
				if (actURL.equals(expURL)) {
					System.out.println("Login success-Tess passed");
					
				}
				else {
					System.out.println("Login failed");
				}
				driver.close();


	}

}
