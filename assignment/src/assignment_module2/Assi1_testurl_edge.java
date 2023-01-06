package assignment_module2;

import org.openqa.selenium.edge.EdgeDriver;

public class Assi1_testurl_edge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://Google.com");
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
