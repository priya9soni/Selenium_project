package assignment_module4_selenium_element_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi4_nooflinks_fb_chrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 Thread.sleep(5000);
		 
		@SuppressWarnings("unchecked")
		List<WebElement>  e = driver.findElements(By.tagName("a"));
		
		System.out.println(e);
		
		System.out.println(e.size());
		for(int i=0;i<e.size();i++)
		{
			System.out.println(e.get(i).getText());
		}
		 
		 driver.close();

	}

}
