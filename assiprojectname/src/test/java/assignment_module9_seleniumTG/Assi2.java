package assignment_module9_seleniumTG;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assi2 {
public WebDriver driver;
	
	@Test(dataProvider = "SDTestData")
	
	public void sdLogin(String uname,String pwd) throws InterruptedException {
	 //launch the chrome browser
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
		//fill the username with input
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(uname);
		Thread.sleep(5000);
		
		//fill the password with input
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
				
				Thread.sleep(5000);
				
				//login
				driver.findElement(By.xpath("//input[@id='login-button']")).click();
				Thread.sleep(5000);
				
				//verification point
				String expURL = "https://www.saucedemo.com/inventory.html";
				String actURL = driver.getCurrentUrl();
				
				if (actURL.equals(expURL)) {
					System.out.println("login su");
					
				}
				
				else {
					System.out.println("login failed");
				}
				
				//org.testng.Assert.assertEquals(actURL, expURL);
				Thread.sleep(5000);
	}
	@AfterMethod
	public void getTestResult(ITestResult testResult) {
		System.out.println("TestCaseName:"+testResult.getName());
		System.out.println("TestCaseResult:"+testResult.getStatus());
		int Status=testResult.getStatus();
		//Results integer value 1--pass,2--fai;
		if (Status==1) {
			driver.close();
		}
		else {
			//take fill screenshor
			File outFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(outFile,new File("C:\\Automation\\assiprojectname\\src\\test\\resources"+testResult.getParameters()[0]+"Defect.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*//take a specific Element screenshort
			
			WebElement errmsg=driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Username')]"));
			File outFile=((TakesScreenshot)errmsg).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(outFile,new File("C:\\Automation\\projectname\\src\\test\\resources\\allresources"+testResult.getParameters()[0]+"Defect.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		
	//close browser
		driver.close();
}
	
	@DataProvider(name="SDTestData")
   public Object[][] readExcle() throws BiffException, IOException {
		//open the Excle read and write which is available in same Project
		//Excle
		File f=new File("C:\\Automation\\assiprojectname\\src\\test\\resources\\TestData_SwagDemo.xls");
		//Workbook
		Workbook w= Workbook.getWorkbook(f);
		
		//sheet
		Sheet s=w.getSheet(0);
		
		//row nd column
		int noofrows= s.getRows();
		System.out.println(noofrows);
		int noofcolumn=s.getColumns();
		System.out.println(noofcolumn);
		
		//CREATE AN ARRAY TO STORE THE DATA OF AN EXCLE
		String inputData[][]  = new String[noofrows-1][noofcolumn];
		int count=0;
		for (int i = 1; i < noofrows; i++) 
		{
			for (int j = 0; j < noofcolumn; j++) 
			{
				Cell c=s.getCell(j, i);
				inputData[count][j]=c.getContents();
			}
			count++;
		}
	return inputData;
  }
}
