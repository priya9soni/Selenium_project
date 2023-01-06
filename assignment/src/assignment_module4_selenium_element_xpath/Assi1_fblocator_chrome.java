package assignment_module4_selenium_element_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Assi1_fblocator_chrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		
		//username
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		//firstname
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		Thread.sleep(5000);
		
		//surname
		driver.findElement(By.name("lastname")).sendKeys("soni");
		Thread.sleep(5000);
		
		
		//mob no
		driver.findElement(By.name("reg_email__")).sendKeys("8401947357");
		Thread.sleep(5000);
		
		//new pass
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pr1234@");
		Thread.sleep(5000);
		
		
		//below
				By maleRB = RelativeLocator.with(By.tagName("input")).below(By.id("month"));
				driver.findElement(maleRB).click();
				Thread.sleep(5000);

				//above
				By pwdtextbox = RelativeLocator.with(By.tagName("input")).above(By.id("month"));
				driver.findElement(pwdtextbox).sendKeys("Mypassword123");
				Thread.sleep(5000);

				//toleftof
				By femaleRB = RelativeLocator.with(By.tagName("input")).toLeftOf(maleRB);
				driver.findElement(femaleRB).click();
				Thread.sleep(5000);


				//near
				By plaintext = RelativeLocator.with(By.tagName("p")).near(maleRB);
				String ptext = driver.findElement(plaintext).getText();
				System.out.println(ptext);
				Thread.sleep(5000);

				//torightof
				By customRB = RelativeLocator.with(By.tagName("input")).toRightOf(maleRB);
				driver.findElement(customRB).click();
				Thread.sleep(5000);
				
				
				
				
		
		
		
		driver.close();
	}

}
