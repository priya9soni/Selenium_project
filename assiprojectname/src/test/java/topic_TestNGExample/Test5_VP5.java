package topic_TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5_VP5 {
	@Test

	public void verifySDLogin() throws InterruptedException 
	{



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		

        //verification point
		boolean buttondisplayed=driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
		System.out.println(buttondisplayed);
		if (buttondisplayed==true) {
			System.out.println("Launched SD Page - Test passed");

		}
		else {
			System.out.println("Launched SD Page - Test failed");
		}
		Thread.sleep(5000);
		driver.close();



	}
}
