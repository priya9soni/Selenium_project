// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Testsuite2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC3assert() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.cssSelector(".sbhl .wM6W7d > span")).click();
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    assertThat(driver.getTitle(), is("Swag Labs"));
    driver.findElement(By.id("login_credentials")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector(".login_password")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) > .inventory_item_description")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_desc")).getText(), is("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."));
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
    driver.close();
  }
  @Test
  public void tC4assert() {
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.cssSelector(".sbhl .wM6W7d > span")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc a .iUh30"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc a > .TbwUpd"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb")).click();
    assertThat(driver.getTitle(), is("Priya Labs"));
    driver.findElement(By.id("login_credentials")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector(".login_password")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    driver.findElement(By.cssSelector(".inventory_item:nth-child(1) > .inventory_item_description")).click();
    assertThat(driver.findElement(By.cssSelector(".inventory_item:nth-child(1) .inventory_item_desc")).getText(), is("carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection."));
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
    driver.close();
  }
}
