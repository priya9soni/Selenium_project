package topic_TestNGExample;

import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test7_multipleMethods_Alphabethics_VP7 {

	//public static void main(String[] args) throws InterruptedException {

	public WebDriver driver; 


	@Test(priority = 1)

	public void setup() throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	@Test(priority = 2)
	public void gotoURL() throws InterruptedException
	{

		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
	}
	@Test(priority = 3)
	public void type_Username() throws InterruptedException
	{
		//fill the username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
	}
	@Test(priority = 4)
	public void type_Password() throws InterruptedException
	{
		//fill the password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
	}
	@Test(priority = 5)
	public void click_Login() throws InterruptedException
	{
		//login
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
	}
	@Test(priority = 6)
	public void verifyLogin() throws InterruptedException
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
	@Test(priority = 7)
	public void teardown() throws InterruptedException
	{
		driver.close();

	}
}


