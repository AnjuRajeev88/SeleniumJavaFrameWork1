package com.obsqura.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	 WaitUtility waitUtility=new WaitUtility();
	 PageUtility pageUtility=new PageUtility();
	// ExcelUtilitiy excelUtility=new ExcelUtilitiy();
	
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/customers']")
	WebElement Client;
	@FindBy(xpath = "//a[@href='https://qalegend.com/mobile_service/panel/reparation']")
	WebElement Reparation;
	@FindBy(xpath = "//p[text()='Logged In Successfully']")
	WebElement LoginSucess;
	@FindBy(xpath="//p[text()='Sign in to start your session']")
	WebElement LoginFailed;
	@FindBy(xpath="//input[@id='emailto_']")
	WebElement EmailTo;
	@FindBy(xpath="//input[@id='subject_']")
	WebElement SubjectEmail;
	@FindBy(xpath="//textarea[@id='body_']")
	WebElement Message;
	@FindBy(xpath="//button[@form='send_email_form']")
	WebElement SendEmail;
	@FindBy(xpath="//input[@id='phone_number']")
	WebElement PhoneNo;
	@FindBy(xpath="//textarea[@placeholder='SMS Text']")
	WebElement TypeMsg;
	@FindBy(xpath="//button[@form='send_quicksms']")
	WebElement SMSSend;
	@FindBy(xpath="//li[text()='This value is required.']")
	WebElement FailedToSendEmail;
	@FindBy(xpath="//ul[@id='parsley-id-5']")
	WebElement InvalidEmailSucess;
	@FindBy(xpath="//div[text()='Quick SMS']")
	WebElement SMSsend;
	@FindBy(xpath="//li[text()='This value is required.']")
	WebElement SendInvalidSMS;
	@FindBy(xpath="//h1[text()='Home']")
	WebElement Scroll;
	@FindBy(xpath="//img[@class='user-image']")
	WebElement AdminName;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/auth/logout']")
	WebElement Logout;
	@FindBy(xpath="//p[text()='Logged Out Successfully']")
	WebElement LogoutSucess;
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		 public ClientPage clickClient() {
		    	Client.click();
				return  new ClientPage(driver);
		    }
		 public void clickReparation() {
			 Reparation.click();
		 }
	   public void typeEmailTo(String email) {
		   EmailTo.sendKeys(email);
		   
	   }
	   public void typeSubject(String emailsubject) {
		   SubjectEmail.sendKeys(emailsubject);
		  
	   }
	   public void typeMessage(String message) {
		   Message.sendKeys(message);
		   
	   }
	   public void clickSendEmail() {
		   SendEmail.click();
		 
	   }
	   public void quickSmsPhone(String phone) {
		   PhoneNo.sendKeys(phone);
	   }
	 
	 
	   
	   public void sendEmail() throws EncryptedDocumentException, IOException, InterruptedException {
		   
		   JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2000)");
		
		    waitUtility.hardSleep(driver);
		   
		    
		   
		  /* EmailTo.sendKeys(email);
		   SubjectEmail.sendKeys(emailsubject);
		   Message.sendKeys(message);
		   SendEmail.click();*/
		   
	   }
	  /* public void sendEmail(String email,String emailsubject,String message)  {
			  
			  
		   EmailTo.sendKeys(email);
		   SubjectEmail.sendKeys(emailsubject);
		   Message.sendKeys(message);
		   SendEmail.click();
		   
	   }*/
	   public void sendEmailError(String email,String emailsubject,String message)  {
			  
		  
		   EmailTo.sendKeys(email);
		   SubjectEmail.sendKeys(emailsubject);
		   Message.sendKeys(message);
		   SendEmail.click();
		   
	   }
	  
	   
	  
	   public void quickSmsMessage(String textmsg) {
		   TypeMsg.sendKeys(textmsg);
		   
	   }
	   public void sendQuicksms() {
		   SMSSend.click();
	   }
	   public void sendQuickMsg(String phone,String textmsg){
		   PhoneNo.sendKeys(phone);
		   TypeMsg.sendKeys(textmsg);
		   SMSSend.click();
	   }
	
	   public void clickLogout() {
		   AdminName.click();
	   }
	   public void homeLogout() {
		   Logout.click();
	   }
	   public void logout() {
		   AdminName.click();
		   Logout.click();
	   }
	
	   public String getMsgForNotSendEmail() {
			  String st4=FailedToSendEmail.getText();
			  return st4;
		  }
	   public String msgForValidSma() {
		   String st=SMSsend.getText();
		   return st;
	   }
	  public String msgForInvalidSms() {
		  String st=SendInvalidSMS.getText();
		  return st;
	  }
	  
	  public String msgForlogout() {
		  String st3=LogoutSucess.getText();
		  return st3;
	  }
	  
	 public String getMsgForSendEmail() {
		 String st=SendEmail.getText();
		 return st;
	 }
	 public String getMsgForSendSMS() {
		 String st=SMSSend.getText();
		 return st;
	 }
	}


