package com.obsqura.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstant;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ReparationPage;

public class ReparationTest extends Base{
//@Test()
  public void verifyUserAbleToAddTheReparationField() {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.clickOnAddReparationField();
	  reparationPage.addImei("344555667467778");
	  reparationPage.selectclientName();
	
	  reparationPage.typeManufacture("phone");
	  reparationPage.typeModel("Nokia12");
	  reparationPage.typeDefect("Camera Not WorKing");
	  reparationPage.tyeCloseDate();
	 // reparationPage.typePurchaseDate("25/6/2020");
	 // reparationPage.typeServiceCharge();
	 // reparationPage.clickOnAddReparationButton();
	  
	
  }
  //@Test()
  public void verifyUserAbleToSearchTheReparationDetails() {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.searchReparationDetailsUsingReparationCode("EIXEUQ");
	  String st=reparationPage.msgForSearchUsingReparationCode();
	  Assert.assertEquals(st, "EIXEUQ");
  
}
//@Test()
  public void verifyUserAbleToSearchCompletedRepairsList() {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.clickForSearchingcompletedRepais();
	  String st=reparationPage.listShowedCompletedRepairs();
	  Assert.assertEquals(st, "Delivered");
	 
	  
  
}
 // @Test()
  public void verifyUserAbleToSearchPendingRepairsList() {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.searchForPendingRepairs();
	  reparationPage.listShowedAsPendingRepairs();
	  String st=reparationPage.listShowedAsPendingRepairs();
	  Assert.assertEquals(st, "#000000");
    
  
}
// @Test()
  public void verifyUserAbleToViewReparationDetails() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.getViewClientDetails();
	  // String st=reparationPage.getMsgForviewedClientDetails();
	   //Assert.assertEquals(st,"Reparation: 12345" );
	  
}
 // @Test()
  public void verifyUserAbleToeditReparationDetails() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	 /* reparationPage.getEditedClientDetails();
	  String st=reparationPage.getMsgForEditedClient();
	  Assert.assertEquals(st, "Edit Reparation12345");*/
}
//@Test()
  public void verifyUserAbleToViewPayMentDetails() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.paymentsDetailsshowed();
	  String st=reparationPage.getMsgForViewedPayment();
	  Assert.assertEquals(st, "View Payments ( : MB4A49)");
}
//@Test()
 public void verifyUserAbleToPrintTheInvoice() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.ableToTakeprintOutTheInvoice();
	  String st=reparationPage.msgForValidateInvoice();
	  Assert.assertEquals(st, "Invoice MB4A49");
 }
//@Test()
 public void verifyUserAbleToSendEmailInvoice() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.emailInvoice();
	 
}
 //@Test()
 public void verifyUserAbleToDeleteReparationDetails() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.clickOnActioButtonForDeleteCClientReparationDetails();
	  
 }
//@Test()
 public void verifyUserAbleToViewLogDetails() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.viewLogSearch();
	  String st=reparationPage.getMsgViewLog();
	  Assert.assertEquals(st, "View log");
}
 //@Test()
 public void verifyUserAbleToPrintBarcode() throws Exception {
	  ReparationPage reparationPage=new ReparationPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  reparationPage.clickReparation();
	  reparationPage.typePrintBarcode();
	  String st=reparationPage.getMsgForPrint();
	  Assert.assertEquals(st, "Print");
}
}
