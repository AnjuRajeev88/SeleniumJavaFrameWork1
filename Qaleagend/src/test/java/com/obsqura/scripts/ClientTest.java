package com.obsqura.scripts;

import java.sql.Timestamp;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstant;
import com.obsqura.pages.ClientPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.SearchClientPage;
import com.obsqura.utilities.GenericUtility;

public class ClientTest extends Base{
	  @Test()
	  public void verifyUserAbleToAddClientDetails() throws InterruptedException {
		  LoginPage loginPage=new LoginPage(driver);
		   loginPage.login(GenericConstant.Username,GenericConstant.Password);
		   HomePage homePage=new HomePage(driver);
		   homePage.clickClient();
		   ClientPage  clientPage=new ClientPage(driver);
		   clientPage.addClientClick();
		  //clientPage.enterClientDetails("Lekshmi", "ABC Companylimited","Nelladiyil(H),Varappetty,kothamangalam", "Kothamangalam","686691", "9496339403", "anjunnair48@gmail.com","GB14565666" ,"878-78-8564" ,"Good");
		  //clientPage.addClientname("Lekshmi"+GenericUtility.timeStamp());
		  clientPage.addClientname("Lekshmi");
		  clientPage.addCompanyName("ABC Companylimited");
		  clientPage.addAddress("Nelladiyil(H),Varappetty,kothamangalam");
		  clientPage.addCity("Kothamangalam");
		  clientPage.addPostalCode("686691");
		  clientPage.addTelephone("9496339403");
		  clientPage.addEmail();
		  clientPage.addVat("GB14565666");
		  clientPage.addSsn("878-78-8564");
		  clientPage.addComments("Good");
		  clientPage.toFileUpload();
		  clientPage.addClientDetails();
		  String st=clientPage.addedDetails();
		  Assert.assertEquals(st,"Client: Lekshmi");
		  }
	  
	@Test()
	   public void verifyUserAbleToDoValidClientSearch() {
		   LoginPage loginPage=new LoginPage(driver);
		   loginPage.login(GenericConstant.Username,GenericConstant.Password);
		  // ClientPage clientPage=new ClientPage(driver);
		   HomePage homePage=new HomePage(driver);
		   homePage.clickClient();
		   SearchClientPage searchClientPage=new  SearchClientPage(driver);
		   searchClientPage.clickSearchUsingName("Anjaly");
		   String st=searchClientPage.msgForValidClientSearch();
		   Assert.assertEquals(st, "Anjaly");
		   
		   
	   }
	  @Test()
	   public void verifyUserAbletoViewClientDetails() throws InterruptedException {
		   LoginPage loginPage=new LoginPage(driver);
		   loginPage.login(GenericConstant.Username,GenericConstant.Password);
		   ClientPage clientPage=new ClientPage(driver);
		   HomePage homePage=new HomePage(driver);
		   homePage.clickClient();
		   clientPage.selectClientActions();
		   clientPage.searchForViewClientDetails();
		   String st=clientPage.getReportForViewClient();
		   Assert.assertEquals(st, "keerthi123@gmail.com");
		 
		 
	    }
	 @Test()
	   public void verifyUserAbletoDeleteClient() {
		   LoginPage loginPage=new LoginPage(driver);
		   loginPage.login("admin@admin.com", "password");
		   ClientPage clientPage=new ClientPage(driver);
		   HomePage homePage=new HomePage(driver);
		   homePage.clickClient();
		   clientPage.selectClientActions();
		   clientPage.deleteAClientFromDatabase();
		   /*clientPage.msgForDeleteClientConfirmation();
		   String st=clientPage.msgForDeleteClient();
		   Assert.assertEquals(st, "Client was deleted from the database");*/
		
}
	  @Test()
	   public void verifyUserAbletoEditClientDetails() {
		   LoginPage loginPage=new LoginPage(driver);
		   loginPage.login("admin@admin.com", "password");
		   ClientPage clientPage=new ClientPage(driver);
		   HomePage homePage=new HomePage(driver);
		   homePage.clickClient();
		   clientPage.selectClientActions();
		   clientPage.editClientDetails("keerthi123@gmail.com");
		   clientPage.clickForEditedClientDetailsSaveButton();
		   String st=clientPage.msgForEditedClientDetails();
		   Assert.assertEquals(st,"Client: Aswathy");
	   }
	  // @Test()
	    public void verifyUserAbleToViewClientImageClickOnViewImage() {
			   LoginPage loginPage=new LoginPage(driver);
			   loginPage.login("admin@admin.com", "password");
			   ClientPage clientPage=new ClientPage(driver);
			   HomePage homePage=new HomePage(driver);
			   homePage.clickClient();
			   clientPage.selectClientActions();
			  /* clientPage.clickOnActionButton();
			    clientPage.clickOnViewImage();
			 
			    String st=clientPage.getUploadedImageColor();
				Assert.assertEquals(st, "#3c8dbc");*/
			  
			 
	   }
	  @Test()
	    public void verifyUserAbleToGetErrorMessageForUnuploadedImageClickOnViewClientImage() {
			   LoginPage loginPage=new LoginPage(driver);
			   loginPage.login("admin@admin.com", "password");
			   ClientPage clientPage=new ClientPage(driver);
			   HomePage homePage=new HomePage(driver);
			   homePage.clickClient();
			   clientPage.selectClientActions();
			   clientPage.clickToViewclientimageGotAAlertForUnuploadedFile();
			   String st=clientPage.msgForUnuploadedFile();
			   Assert.assertEquals(st, "No Image Uploaded");
			   
			   
		   
		}
	  @Test()
	    public void verifyUserAbleToCheckClientRepairsDetailsContainsNoData() {
			   LoginPage loginPage=new LoginPage(driver);
			   loginPage.login("admin@admin.com", "password");
			   ClientPage clientPage=new ClientPage(driver);
			   HomePage homePage=new HomePage(driver);
			   homePage.clickClient();
			   clientPage.selectClientActions();
			    clientPage.searchForViewClientRepairs();
			   String st=clientPage.getMsgForNoDataIsAvaibleInClientViewRepairs();
			   Assert.assertEquals(st, "No data available in table");
}
}
