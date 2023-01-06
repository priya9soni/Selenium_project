package topic_TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test10_alwaysrun {
	
	public WebDriver driver;

	//public static void main(String[] args) throws InterruptedException
	@Test(priority = 0)
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test(priority = 1) 
	public void gotoURL() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "gotoURL")
	public void type_username() throws InterruptedException
	{
		//fill the username with input
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "type_username")
	public void type_password() throws InterruptedException
	{
		//fill the password with input
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "type_password")
	public void click_Login() throws InterruptedException
	{
		//click on login with input
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods = "click_Login")
	public void verifyLogin()
	{
		//verifyLogin
		String expURL = "https://www.saucedemo.com/inventory.html";
		String actURL = driver.getCurrentUrl();
		if (actURL.equals(expURL)) {
			System.out.println("Login Success-Test Passed");
			
		}
		else {
			System.out.println("Login Success-Test failed");
		}
	}
	@Test(dependsOnMethods = "verifyLogin",alwaysRun = true)
	public void teardown()
	{
		driver.close();
	}
}

