package com.obsqura.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;





public class PageUtility {
	//Utility for clicking dropdown.
	//utility use for page class.

	// utility method click with javascript.
	
	
	public void fileUpload(WebDriver driver, WebElement Fileupload ){
		Fileupload.sendKeys("C:\\Users\\hp\\Desktop\\Payroll testcases.txt");
		
	}
      public void alert(WebDriver driver) {
	   Alert ob=driver.switchTo().alert();
	   ob.accept();

   }
        public void dropDownHandling(By element, String visibleText, WebDriver driver) {
		WebElement testdropdown = driver.findElement(element);
		Select dropdown = new Select(testdropdown);
		dropdown.selectByVisibleText(visibleText);
	}
        
}
	
