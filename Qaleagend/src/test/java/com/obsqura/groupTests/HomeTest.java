package com.obsqura.groupTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstant;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.scripts.Base;
public class HomeTest extends Base {
  // @Test(priority=4)
 // @Parameters({"s","n"})
 /*public void verifyTClientPage(String s,String n) {
	  LoginPage loginPage=new LoginPage(driver);
	 // loginPage.login("admin@admin", "password");
	 
	  HomePage homePage=loginPage.login(s,n);
	  homePage.homeClient();
	  
	  String st=homePage.clientClickSucess();
	  Assert.assertEquals(st,"Customers");
	  
  }*/
 
	
 // @Test(priority=3)
  //@Parameters({"s","n"})
 /* public void verifyAdminAbleToSendQuickEmail(String s,String n) {
	 
	  LoginPage loginPage=new LoginPage(driver);
	 // loginPage.login("admin@admin.com", "password");
	 // loginPage.login(s, n);
	  HomePage homePage =  loginPage.login(s, n);
	  homePage.sendEmail("anjunnair48@gmail.com", "AutomationProject", "Hello,How are you");
	  String st=homePage.getMsgForSendEmail();
	  Assert.assertEquals(st, "Send");
	 
  }*/
 // @Test(groups= {"smoke"})

  /*public void verifyAdminAbleToSendQuickEmail() {
	 
	  LoginPage loginPage=new LoginPage(driver);
	 // loginPage.login("admin@admin.com", "password");
	 // loginPage.login(s, n);
	  HomePage homePage =  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  homePage.sendEmail("anjunnair48@gmail.com", "AutomationProject", "Hello,How are you");
	  // homePage.sendEmail(ExcelUtilitiy.class.);
	  String st=homePage.getMsgForSendEmail();
	  Assert.assertEquals(st, "Send");
	 
  }*/
   @Test(priority=4)
  public void verifyAdimNotAbleToSendInvalidQuickEmail() {
	    LoginPage loginPage=new LoginPage(driver);
	    //loginPage.login("admin@admin.com", "password");
	    HomePage homePage= loginPage.login("admin@admin.com", "password");
	   // HomePage homePage =new HomePage(driver);
	    homePage.sendEmailError(" ", "Automatioproject","Hai");
	    String st4=homePage.getMsgForNotSendEmail();
	    Assert.assertEquals(st4, "This value is required.");
	  
	  
  }
@Test(groups= {"smoke","regression"})
  public void verifyAdminAbleToSendQuickSMS() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login("admin@admin.com", "password");
	 // loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  HomePage homePage =new HomePage(driver);
	  homePage.sendQuickMsg("9856354790", "Hello");
	  String st=homePage.getMsgForSendSMS();
	  Assert.assertEquals(st, "Send");
  }
  @Test(groups= {"smoke"})
  public void verifyAdminNotAbleToSendQuickSMS() throws InterruptedException {
	  LoginPage loginPage=new LoginPage(driver);
	  //loginPage.login("admin@admin.com", "password");
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  HomePage homePage =new HomePage(driver);
	 
	  homePage.sendQuickMsg("", "Hai");
	  String st=homePage.msgForInvalidSms();
	  Assert.assertEquals(st, "This value is required.");
	  
  }
 
 @Test(priority=7)
  public void verifyHomeLogout() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  HomePage homePage =new HomePage(driver);
	  homePage.logout();
	  String st3=homePage.msgForlogout();
	  Assert.assertEquals(st3,"Logged Out Successfully");
  }
}


