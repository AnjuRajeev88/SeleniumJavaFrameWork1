package com.obsqura.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.constants.GenericConstant;
import com.obsqura.pages.InventoryPage;
import com.obsqura.pages.LoginPage;


public class InventoryTest extends Base {
	
   @Test()
  public void verifyUserAbleToSearchInventoryProducts() {
	  InventoryPage inventoryPage=new InventoryPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  inventoryPage.clickInventory();
	  inventoryPage.searchInventoryProducts("helloProduct");
	  String st= inventoryPage.msgForInventorySearch();
	  Assert.assertEquals(st, "93837");
	  
	  
  }
@Test()
  public void verifyUserAbleToEditInventoryProducts() {
	  InventoryPage inventoryPage=new InventoryPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  inventoryPage.clickInventory();
	  inventoryPage.actionButtonClickInInventoryPage();
	  inventoryPage.clickOnEditInventoryProduct();
	  inventoryPage.editNameFromInventoryProductDetails("Apple");
	  inventoryPage.clickEditProductButton();
	  String st=inventoryPage.msgForEditSuceessfullyUpdated();
	  Assert.assertEquals(st, "×\n"
	  		+ "Product successfully updated");
	  
	  

}
  @Test()
  public void verifyUserAbleToaddInventoryProductsBarcodePrintingList() {
	  InventoryPage inventoryPage=new InventoryPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  inventoryPage.clickInventory();
	  inventoryPage.actionButtonClickInInventoryPage();
	  inventoryPage.clickToPrintBarcode();
	  inventoryPage.clickOnUpadateButtonOnBarcodePage();
	  String st=inventoryPage.msgForAddedInventoryProductToBarcodePrintingList();
	  Assert.assertEquals(st, "×\n"
	         +"Product is added to barcode printing list");
  }
  @Test()
  public void verifyUserAbleToGetErrorMsgNoProductAddedToPrintBarcodeList() {
	  InventoryPage inventoryPage=new InventoryPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  inventoryPage.clickInventory();
	  inventoryPage.actionButtonClickInInventoryPage();
	  //inventoryPage.clickOnPrintBarcode();
	  inventoryPage.clickToPrintBarcode();
	  inventoryPage.ClickOnRemoveButtonInBarcodePrinting();
	  inventoryPage.clickOnUpadateButtonOnBarcodePage();
	  String st=inventoryPage.ErrorMsgForNoProductAddedToBarcodePrintintList();
	  Assert.assertEquals(st,"×\n"
	  		+ "No product selected. Please select at least one product." );
	  
}
  @Test()
  public void verifyUserAbleToDeleteIventoryProduct() throws Exception {
	  InventoryPage inventoryPage=new InventoryPage(driver);
	  LoginPage loginPage=new LoginPage(driver);
	  loginPage.login(GenericConstant.Username,GenericConstant.Password);
	  inventoryPage.clickInventory();
	  inventoryPage.clickOnActionsButtonToDeleteTheProduct();
	  inventoryPage.clickOnDeleteProductInInventoryPage();
	 //inventoryPage.clickToConfirmDeleteButton();
}
}
