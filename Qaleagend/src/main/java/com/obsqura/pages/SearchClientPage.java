package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.WaitUtility;

public class SearchClientPage {
	 public WebDriver driver;
	 WaitUtility waitUtility=new WaitUtility();
	 @FindBy(xpath="//label[text()='Search']")
	 WebElement search;
	 @FindBy(xpath="//table[@id='dynamic-table']//tr[1]//td[2]")
	    WebElement ClientSearch;
	public SearchClientPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSearchUsingName(String clientname) {
		 search.sendKeys(clientname);
		 try {
				waitUtility.hardSleep(driver);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
    }
	public void clickSearchUsingPhoneNo(String phone) {
		 search.sendKeys(phone);
   }
	 public String msgForValidClientSearch() {
	    	String st=ClientSearch.getText();
	    	System.out.println(st);
	    	return st;
	    }
	
}
