package com.obsqura.groupTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.scripts.Base;
import com.obsqura.constants.GenericConstant;
import com.obsqura.listener.ExtentReportListeners;


@Listeners(ExtentReportListeners.class)
public class LoginTest extends Base {
  @Test(dataProvider="logindata")  
public void verifyValidLogin(String username,String password) {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  String st=loginPage.msgForValidLogin();
	  Assert.assertEquals(st, "Logged In Successfully");
	 
}
@Test(dataProvider="Invalidlogindata") 
public void verifyInValidLogin(String username,String password) {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.login(username, password);
	// loginPage.login(username, password);
	// loginPage.login(username, password);
	 String st1=loginPage.msgForInvalidLogin();
	 Assert.assertEquals(st1, "Sign in to start your session");
	 }

@Test(priority=2)
public void verifyForgotPassword() {
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.typeForgotPassword();
	  loginPage.typeSendEmail("anjunnair48@gmail.com");
	  loginPage.clickSubmit();
	  loginPage.typeBack();
}
@DataProvider(name="logindata")
public Object[][] loginData()
{
	return new Object[][]
			{
		
		{"admin@admin.com","password"},
		
	};
}
	
@DataProvider(name="Invalidlogindata")
public Object[][] invalidloginData()
{
	return new Object[][]
			{
		{"admin.com","2334"},
		{"admin122.com","password"},
		{"admin@a.com","Password"},
};
}
}
