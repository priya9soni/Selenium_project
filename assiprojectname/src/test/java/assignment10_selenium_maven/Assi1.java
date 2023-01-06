package assignment10_selenium_maven;

import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assi1 {

	//public static void main(String[] args) throws InterruptedException {

	public WebDriver driver; 


	@Test

	public void asetup() throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test
	public void bgotoURL() throws InterruptedException
	{

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}
	@Test
	public void ctype_Username() throws InterruptedException
	{
		//fill the username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
	}
	@Test
	public void dtype_Password() throws InterruptedException
	{
		//fill the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
	}
	@Test
	public void eclick_Login() throws InterruptedException
	{
		//login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void fverifyLogin() throws InterruptedException
	{
		//verification point
		String expURL = "https://www.saucedemo.com/inventory.html";
		String actURL = driver.getCurrentUrl();

		if (actURL.equals(expURL)) {
			System.out.println("login su");

		}

		else {
			System.out.println("login failed");
		}
		Thread.sleep(5000);
	}
	@Test
	public void gteardown() throws InterruptedException
	{
		driver.close();

	}
}


