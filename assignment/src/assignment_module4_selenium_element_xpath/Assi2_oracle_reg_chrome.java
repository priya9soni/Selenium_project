package assignment_module4_selenium_element_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi2_oracle_reg_chrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(5000);
		
		//email
		driver.findElement(By.name("sView1:r1:0:email")).sendKeys("priya@gmail.com");
		Thread.sleep(5000);
		
		
		//password
		driver.findElement(By.name("sView1:r1:0:password")).sendKeys("Dhruv@1234");
		Thread.sleep(5000);
		
		//retype password
		driver.findElement(By.name("sView1:r1:0:retypePassword")).sendKeys("Dhruv@1234");
		Thread.sleep(5000);
		
		//dropdown country
		Select country = new Select(driver.findElement(By.id("sView1:r1:0:country::content")));
		country.selectByValue("HK");
		Thread.sleep(5000);
		
		//first or given name
		driver.findElement(By.name("sView1:r1:0:firstName")).sendKeys("Priya");
		Thread.sleep(5000);
		
		//last name
		driver.findElement(By.name("sView1:r1:0:lastName")).sendKeys("soni");
		Thread.sleep(5000);
		
		//job title
		driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("testing");
		Thread.sleep(5000);
		
		//work phone
		driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("8401947357");
		Thread.sleep(5000);
		
		//country name
		driver.findElement(By.name("sView1:r1:0:companyName")).sendKeys("India");
		Thread.sleep(5000);
		
		//Address
		driver.findElement(By.name("sView1:r1:0:address1")).sendKeys("shamsabad, hyderabad");
		Thread.sleep(5000);
		
		//city
		driver.findElement(By.name("sView1:r1:0:city")).sendKeys("hyderabad");
		Thread.sleep(5000);
		
		//state
		Select state = new Select(driver.findElement(By.name("sView1:r1:0:state")));
		state.selectByValue("31");
		Thread.sleep(5000);
		
		//zip
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("501218");
		Thread.sleep(5000);
		
		
		
		driver.close();
	}

}
