package assignment_module2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assi2_Testscript_edge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		System.out.println("hello");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
		Thread.sleep(5000);
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("title of the page"+" "+title);
		if(title.equalsIgnoreCase("Google"))
		{
			System.out.println("title is match");
		}
		else {
			System.out.println("title is match");
		
		}
		
		
		driver.close();

	}

}
