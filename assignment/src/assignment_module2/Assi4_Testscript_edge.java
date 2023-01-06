package assignment_module2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assi4_Testscript_edge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://Google.com");
		Thread.sleep(5000);
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("title of the page"+" "+title);
		if (title.equalsIgnoreCase("Google"))
		{
			System.out.println("Title of page is match");
			
		}
		else {
			System.out.println("Title of page is not match");
		}
		driver.close();
		
	}
}

