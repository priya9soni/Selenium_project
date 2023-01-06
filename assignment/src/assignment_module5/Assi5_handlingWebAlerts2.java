package assignment_module5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi5_handlingWebAlerts2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on click here 
		driver.findElement(By.xpath("//button[text()='Click here to show confirm alert']")).click();
		Thread.sleep(5000);
		
		String alertText1 = driver.switchTo().alert().getText();
		System.out.println(alertText1);
		Thread.sleep(5000);
		
		//accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		String alertText2 = driver.switchTo().alert().getText();
		System.out.println(alertText2);
		Thread.sleep(5000);
		
		//accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		
		driver.close();

	}

}
