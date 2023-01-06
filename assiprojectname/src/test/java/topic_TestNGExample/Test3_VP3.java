package topic_TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3_VP3 {
@Test
	
	public void verifySDLogin() throws InterruptedException 
	{
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		
		
		//verification point
		String expTitle = "Swag Labs";
		String actTitle = driver.getTitle();
		if (actTitle.equals(expTitle)) {
			System.out.println("Launched SD page - Test passed");
			
		}
		else {
			System.out.println("Launched SD page - Test failed");
		}
		Thread.sleep(5000);
		driver.close();
		
		

	}
}
