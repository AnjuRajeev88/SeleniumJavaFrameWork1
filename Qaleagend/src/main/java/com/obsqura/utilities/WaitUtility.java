package com.obsqura.utilities;


import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
//hard sleep 
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	 public void waitImplicit( WebDriver driver) {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	   public void hardSleep(WebDriver driver) throws InterruptedException {
		   Thread.sleep(5000);
	   }
	   public void waitForElementPresent(WebDriver driver,WebElement element) {
		   WebDriverWait wait = new WebDriverWait(driver, 10);
		   wait.until(ExpectedConditions.elementToBeSelected(element));
	   }
	  
	  public void javaScriptClick(WebElement element,WebDriver driver) {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click", element);
		 
	  }	
	 /* public void waitFluent(WebDriver driver,Time timeout) {
	
		Wait w=new FluentWait(driver).withTimeout(timeout, SECONDS)
	  }*/
	  
	   }

	 

