package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class InventoryPage {
	 WaitUtility waitUtility=new WaitUtility();
	 PageUtility pageUtility=new PageUtility();
	public WebDriver driver;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory']")
	WebElement InventoryClick;
	@FindBy(xpath="//label[text()='Search']")
	WebElement searchInventory;
	@FindBy(xpath="//td[text()='93837']")
	WebElement  MsgForSeachInventory;
	@FindBy(xpath="//*[@id=\"4\"]/td[9]/div/div/button")
	WebElement InventoryProductionActions;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory/edit/4']")
	WebElement EditInventoryProduct;
	@FindBy(xpath="//input[@id='name']")
	WebElement EditNameFromInventoryDetails;
	@FindBy(xpath="//input[@name='edit_product']")
	WebElement EditProduct;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/div")
	WebElement MsgUpdated;
	@FindBy(xpath="//*[@id=\"94\"]/td[9]/div/div/button")
	WebElement ActionButtonForPrintBarcode;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory/print_barcodes/4']")
	WebElement PrintBarcode;
	@FindBy(xpath="//input[@name='print']")
	WebElement update;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/div[1]")
	WebElement MsgProductAdded;
	@FindBy(xpath="//i[@title='Remove']")
	WebElement RemoveButtonBarcodePrintingPage;
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/section[2]/div[1]")
	WebElement MsgForNoProductInBarcodeList;
	@FindBy(xpath="//*[@id=\"94\"]/td[9]/div/div/button")
	WebElement ActionButtonForDeleteProduct;
	@FindBy(xpath="//*[@id=\"94\"]/td[9]/div/div/ul/li[5]/a")
	WebElement DeleteProduct;
	@FindBy(xpath="//a[@href='https://qalegend.com/mobile_service/panel/inventory/delete/73']")
	WebElement confirmDeleteButton;
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickInventory() {
		InventoryClick.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void searchInventoryProducts(String name) {
		searchInventory.sendKeys(name);
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void actionButtonClickInInventoryPage() {
		
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InventoryProductionActions.click();
		
		
	}
   public String msgForInventorySearch() {
	  String st= MsgForSeachInventory.getText();
	  System.out.println(st);
	  return st;
   }
  public void clickOnEditInventoryProduct() {
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  EditInventoryProduct.click();
	  }
  public void editNameFromInventoryProductDetails(String name) {
	  EditNameFromInventoryDetails.clear();
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  EditNameFromInventoryDetails.sendKeys(name);
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  

	   }
  public void clickEditProductButton() {
	  EditProduct.click();
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  public String msgForEditSuceessfullyUpdated() {
	 String st= MsgUpdated.getText();
	 System.out.println(st);
	  return st;
  }
  public void clickOnBarcodeActionButton() {
	  ActionButtonForPrintBarcode.click();
  }
  public void clickToPrintBarcode() {
	  PrintBarcode.click();
	 
  }
  public void clickOnUpadateButtonOnBarcodePage() {
	  update.click();
	 
  }
  public String msgForAddedInventoryProductToBarcodePrintingList() {
	  String st=MsgProductAdded.getText();
	 
	  return st;
  }
 

  public void ClickOnRemoveButtonInBarcodePrinting() {
	  RemoveButtonBarcodePrintingPage.click();
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  public String ErrorMsgForNoProductAddedToBarcodePrintintList() {
	  String st=MsgForNoProductInBarcodeList.getText();
	  System.out.println(st);
	  return st;
  }
  public void clickOnActionsButtonToDeleteTheProduct() throws Exception {
	  ActionButtonForDeleteProduct.click();
	  waitUtility.hardSleep(driver);
  }
  public void clickOnDeleteProductInInventoryPage() {
	  DeleteProduct.click();
	  try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 // pageUtility.alert(driver);
  }
  public void clickToConfirmDeleteButton() {
	  confirmDeleteButton.click();
  }
  }
