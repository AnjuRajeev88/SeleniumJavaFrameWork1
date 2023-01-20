package com.obsqura.scripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.obsqura.constants.GenericConstant;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
	public Properties prop;
	
	
  @Parameters({ "browser" })
  @BeforeMethod(alwaysRun = true)
  public void multipleBrowser(@Optional("chrome")String browser) throws IOException {
	 
	
	  
	  if(browser.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  else if(browser.equals("chrome"))
	  {
		  //System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\chromedriver.exe\\");
		  WebDriverManager.chromedriver().setup();
	      driver=new ChromeDriver();
	  }
	  else if(browser.equals("gecko"))
	  {
		 // System.setProperty("webdriver.gecko.driver","D:\\Automation Testing\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
	  }
	    
	  driver.get(GenericConstant.Url);
         
	  //driver.get("https://qalegend.com/mobile_service/panel/login");
	   
	 
	  driver.manage().window().maximize();
  }

  @AfterMethod
  
  public void afterMethod(ITestResult r) throws IOException {
	  driver.close();
	  if (ITestResult.FAILURE == r.getStatus()) {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("user.dir" + r.getName() + ".jpeg"));
		}
	 
  }



}
