package com.obsqura.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	 WaitUtility waitUtility=new WaitUtility();
	 PageUtility pageUtility=new PageUtility();
	@FindBy(xpath = "//input[@id='identity']")
	WebElement UserName;
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement Login;
	@FindBy(xpath = "//p[text()='Logged In Successfully']")
	WebElement LoginSucess;
	@FindBy(xpath="//p[text()='Sign in to start your session']")
	WebElement MsgForInvalidLogin;
	@FindBy(xpath = "//a[@href='https://qalegend.com/mobile_service//panel/login/forgot_password']")
	WebElement Forgotpassword;
	@FindBy(xpath="//input[@id='identity']")
	WebElement SendEmail;
	@FindBy(xpath="//input[@name='submit']")
	WebElement SubmitFP;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service//panel/login']")
	WebElement Back;
	

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void typeUsername(String username) {
		waitUtility.waitForElementToBeClickable(driver,UserName );
		UserName.sendKeys(username);
	}
	public void typePassword(String password) {
		Password.sendKeys(password);
	}
	public void clickLogin() {
		Login.click();
	 
	}
	public HomePage login(String Username, String Password) {
	     typeUsername(Username);
	     typePassword(Password);
	     Login.click();
	     System.out.println("login sucessfully");
	    
	     return new HomePage(driver);
	}
	public void typeForgotPassword(){
		Forgotpassword.click();
	}
	public void typeSendEmail(String sendemail)
	{
		SendEmail.sendKeys(sendemail);
	}
	public void clickSubmit() {
		SubmitFP.click();
	}
	public void typeBack() {
	
		Back.click();
	}
	public String msgForValidLogin()
	{        String st= LoginSucess.getText();
	         return st;
		     

	}


	public String msgForInvalidLogin() {
		 String st1=MsgForInvalidLogin.getText();
		 System.out.println(st1);
		 
		 return st1;
	}
}

