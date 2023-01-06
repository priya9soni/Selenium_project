package assignment_module5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assi4_handlingWebAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//switch into frame
		driver.switchTo().frame(1);
		Thread.sleep(5000);
		
		//click on try it 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		
		//enter text 
		driver.switchTo().alert().sendKeys("Priya");
		Thread.sleep(5000);
		
		
		 //accept the alert 
		driver.switchTo().alert().accept(); Thread.sleep(5000);
		  
		  String alertText1 = driver.switchTo().alert().getText();
		  System.out.println(alertText1); Thread.sleep(5000);
		 
		
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(5000);
		
		
		
		//System.out.println("soni priya");
		//Thread.sleep(5000);
		
		/*
		 * String alertText1 = driver.switchTo().alert().getText();
		 * System.out.println(alertText1); Thread.sleep(5000);
		 * 
		 * //accept the alert driver.switchTo().alert().accept(); Thread.sleep(5000);
		 */
	
		
		
		driver.close();

	}

}
