package topic_TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6_VP6 {
	@Test

	public void verifySDLogin() throws InterruptedException 
	{



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		//fill the username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		//fill the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauceesi");
		Thread.sleep(5000);

		//login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);

        //verification point
		String expErrMsg = "Epic sadface: Username and password do not match any user in this service";
		String actErrMsg = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface:')]")).getText();
		if (actErrMsg.equals(expErrMsg)) {
			System.out.println("Valid Error msg displyed - Test passed");

		}
		else {
			System.out.println("InValid Error msg displyed - Test failed");
		}
		Thread.sleep(5000);
		driver.close();



	}
}
