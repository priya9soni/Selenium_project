package assi11_POM_sikuliGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assi1_LoginPOM {
	WebDriver driver;
  
	By Usernamefield = By.xpath("//input[@name='user-name']");
	By Passwordfield = By.xpath("//input[@name='password']");
	By Loginbttoun = By.xpath("//input[@id='login-button']");
	
	public Assi1_LoginPOM(WebDriver driver) {
		this.driver=driver;
	}
	public void type_username(String uname) {
		
		driver.findElement(Usernamefield).sendKeys(uname);
		
	}
	public void type_password(String pwd) {
		driver.findElement(Passwordfield).sendKeys(pwd);
	}
	public void click_Login() {
		driver.findElement(Loginbttoun).click();
	}
}
