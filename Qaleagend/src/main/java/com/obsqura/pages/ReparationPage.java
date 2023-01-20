package com.obsqura.pages;

import java.util.List;

import org.apache.poi.ss.usermodel.Color;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class ReparationPage {
	public WebDriver driver;
	WaitUtility waitUtility = new WaitUtility();
	PageUtility pageUtility = new PageUtility();
	DateUtility dateUtility=new DateUtility();
	@FindBy(xpath = "//a[@href='https://qalegend.com/mobile_service/panel/reparation']")
	WebElement Reparation;
	@FindBy(xpath = "//button[@href='#reparationmodal']")
	WebElement AddReparation;
	@FindBy(xpath = "//input[@id='imei']")
	WebElement IMEI;
	@FindBy(xpath="//select[@id='client_name']")
	WebElement clientname;
	
	@FindBy(xpath = "//span[@id='select2-assigned_to-container']")
	WebElement Assigne;
	@FindBy(xpath = "//span[@title='Joe Jacobs']")
	WebElement selectAssigne;
	@FindBy(xpath = "//input[@id='reparation_manufacturer']")
	WebElement Manufacture;
	@FindBy(xpath = "//input[@id='reparation_model']")
	WebElement Model;
	@FindBy(xpath = "//input[@id='defect']")
	WebElement Defect;
	@FindBy(xpath = "//span[@id='select2-error_code-container']")
	WebElement Error;
	@FindBy(xpath = "//input[@id='service_charges']")
	WebElement ServiceCharge;
	@FindBy(xpath="//input[@min='0']")
	WebElement ServiceChargeClick;
	@FindBy(xpath = "//input[@id='expected_close_date']")
	WebElement CloseDate;
	@FindBy(xpath="/html/body/div[8]/div[3]/table/tbody/tr[4]/td[4]")
	WebElement SelectDate;
	@FindBy(xpath = "//input[@id='date_of_purchase']")
	WebElement PurchaseDate;
	@FindBy(xpath = "//span[@id='select2-has_warranty-container']")
	WebElement HasWarranty;
	@FindBy(xpath = "//span[@id='select2-warranty-container']")
	WebElement warranty;
	@FindBy(xpath = "//input[@id='warranty_card_number']")
	WebElement warrantycardnumber;
	@FindBy(xpath = "//input[@id='repair_type']")
	WebElement Repairtype;
	@FindBy(xpath = "//input[@id='client_date']")
	WebElement ClientDate;
	@FindBy(xpath = "//textarea[@id='accessories']")
	WebElement Accessories;
	@FindBy(xpath = "//textarea[@id='comment']")
	WebElement Comments;
	@FindBy(xpath = "id=\"diagnostics\"")
	WebElement Diagnostics;
	@FindBy(xpath = "//input[@id='repair_sms']")
	WebElement checkbox1;
	@FindBy(xpath = "//input[@id='repair_email']")
	WebElement checkbox2;
	@FindBy(xpath = "id=\"sign_repair\"")
	WebElement sign;
	@FindBy(xpath="//button[@id='repair_submit']")
	WebElement AddReparationDetails;
	@FindBy(xpath = "//*[@id=\"reparationmodal\"]/div/div/div[2]/div[2]/div[1]/span[1]/span[2]")
	WebElement DeliveryStatus;

	@FindBy(xpath = "//label[text()='Search']")
	WebElement Search;
	@FindBy(xpath = "//table[@id='dynamic-table']//td[2]")
	WebElement Reparationsearchcode;
	@FindBy(xpath = "//a[@href='#CompletedRepairs']")
	WebElement CompletedRepairs;
	@FindBy(xpath = "//span[text()='Delivered']")
	WebElement CompletedRepairsList;
	@FindBy(xpath = "//a[@href='#PendingRepairs']")
	WebElement PendingRepairs;
	// @FindBy(xpath="//span[text()='In Progress']")
	@FindBy(xpath = "//span[text()='In Progress']")
	WebElement BackGroundColorOfListOfPendingRepairs;
	//@FindBy(xpath="//*[@id=\"57\"]/td[16]/div/div/button")
	@FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/button")
	WebElement ActionsClick;
	@FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/button")
	WebElement Actions;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[1]/a")
    WebElement ViewClient;
    @FindBy(xpath="//div[@id='titoloOE']")
    WebElement MsgForviewClientdetails;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[2]/a")
    WebElement Edit;
    @FindBy(xpath="//input[@id='category']")
    WebElement EditCategory;
    @FindBy(xpath="//button[@id='repair_submit']")
    WebElement saveReparation;
   // @FindBy(xpath="//button[text()=' save reparation']")
   // WebElement saveReparation;
    @FindBy(xpath="//*[@id=\"titReparation\"]")
    WebElement EditedClient;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[3]/a")
    WebElement ViewPayment;
    @FindBy(xpath="//*[@id='myModalLabel']")
    WebElement MsgViewedPayment;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[5]/a")
    WebElement Invoice;
    @FindBy(xpath="//*[@id=\"copy\"]/div[1]/div[1]/div/h4")
    WebElement MsgInvoiceHeader;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[7]/a")
    WebElement Email;
   
    @FindBy(xpath="//button[text()='OK']")
    WebElement clickokbuttononsend;
    @FindBy(xpath="//*[@id=\"35\"]/td[16]/div/div/button")
    WebElement ActionButton;
    @FindBy(xpath="//*[@id=\"35\"]/td[16]/div/div/ul/li[8]/a")
    WebElement Delete;
    @FindBy(xpath="/html/body/div[13]/div/div/div[3]/button[2]")
    WebElement Deleteconfirmation;;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[9]/a")
    WebElement viewLog;
    @FindBy(xpath="//*[@id=\"content-wrapper\"]/section[1]/h1")
    WebElement msgForViewLogHeader;
    @FindBy(xpath="//*[@id=\"41\"]/td[16]/div/div/ul/li[11]/a")
    WebElement printBarcode;
    @FindBy(xpath="//input[@ type='submit']")
    WebElement update;
    @FindBy(xpath="//*[@id=\"barcode-con\"]/button[1]")
    WebElement print;

	public ReparationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickReparation() {
		Reparation.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickOnAddReparationField() {
		AddReparation.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addImei(String Imei) {
		IMEI.sendKeys(Imei);

	}
	public void selectclientName() {
		Select dropdown = new Select(clientname);
		dropdown.selectByIndex(6);
	}

	

	public void addAssigne() {
		
		Select dropdown = new Select(Assigne);
		dropdown.selectByIndex(3);
	}

	public void typeManufacture(String manufacture) {
		Manufacture.sendKeys(manufacture);
	}

	public void typeModel(String model) {
		Model.sendKeys(model);
	}

	public void typeError(String error) {
		Error.sendKeys(error);

	}

	public void typeDefect(String defect) {
		Defect.sendKeys(defect);
	}

	public void tyeCloseDate() {
		CloseDate.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 SelectDate.click();
		 try {
				waitUtility.hardSleep(driver);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		dateUtility.selectDate(driver, "12-21-2022","MMM-dd-YYYY");
	}
	/*public void tyeCloseDate(String closedate) {
		CloseDate.sendKeys(closedate);
		
	}*/

	public void typePurchaseDate(String purchasedate) {
		PurchaseDate.sendKeys(purchasedate);
	}

	public void typeHasWarranty() {
		Select dropdown = new Select(HasWarranty);
		dropdown.selectByIndex(7);
	}

	public void typeWarranty() {
		Select dropdown = new Select(warranty);
		dropdown.selectByIndex(7);
	}

	public void typeWarrantyCardNumber(String number) {
		warrantycardnumber.sendKeys(number);
	}

	public void repairType(String type) {
		Repairtype.sendKeys(type);
	}

	public void typeClientReceiveDate() {

	}

	public void typeAccesserioes(String accessories) {
		Accessories.sendKeys(accessories);
	}

	public void typeComments(String comments) {
		Comments.sendKeys(comments);
	}

	public void typediagnostics(String diago) {
		Diagnostics.sendKeys(diago);
	}

	public void checkDeliveryStatus() {
		DeliveryStatus.click();

	}

	public void clickOnCheckBox() {
		checkbox1.click();
	}

	public void clickOnEmailSendCheckBox() {
		checkbox2.click();
	}

	public void PutSign() {
		sign.click();
	}
	public void typeServiceCharge() {
		ServiceCharge.click();
		ServiceChargeClick.click();
	}
	public void clickOnAddReparationButton() {
		AddReparationDetails.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchReparationDetailsUsingReparationCode(String code) {
		Search.sendKeys(code);
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String msgForSearchUsingReparationCode() {
		String st = Reparationsearchcode.getText();
		return st;
	}

	public void clickForSearchingcompletedRepais() {
		CompletedRepairs.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String listShowedCompletedRepairs() {
		String st = CompletedRepairsList.getText();
		System.out.println(st);
		return st;

	}

	public void searchForPendingRepairs() {
		PendingRepairs.click();
		
		
	}
	

	public String listShowedAsPendingRepairs() {
		String background = BackGroundColorOfListOfPendingRepairs.getCssValue("background-color");
		System.out.println(background);
		String hexBackgroundColor = org.openqa.selenium.support.Color.fromString(background).asHex();
		System.out.println(hexBackgroundColor);
		return hexBackgroundColor;
	}

	public void getViewClientDetails() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,2000)");
		waitUtility.hardSleep(driver);
	    js.executeScript("window.scrollTo(2000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		/*waitUtility.hardSleep(driver);
		ViewClient.click();
		waitUtility.hardSleep(driver);*/
		}
	public String getMsgForviewedClientDetails() {
		String st=MsgForviewClientdetails.getText();
		return st;
	}
	public void getEditedClientDetails() throws Exception {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,3000)");
		js.executeScript("window.scrollTo(3000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		Edit.click();
		EditCategory.sendKeys("6789");
		waitUtility.hardSleep(driver);
		saveReparation.click();
		waitUtility.hardSleep(driver);
	}
	public String getMsgForEditedClient() {
		String st=EditedClient.getText();
		return st;
	}
	public void paymentsDetailsshowed() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		waitUtility.hardSleep(driver);
		js.executeScript("window.scrollBy(1000,0)");
	
		ActionsClick.click();
		waitUtility.hardSleep(driver);
		ViewPayment.click();
		waitUtility.hardSleep(driver);
	}
	public String getMsgForViewedPayment() {
		String st=MsgViewedPayment.getText();
		return st;
	}
	public void ableToTakeprintOutTheInvoice() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,000)");
		js.executeScript("window.scrollBy(1000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		waitUtility.hardSleep(driver);
		Invoice.click();
		waitUtility.hardSleep(driver);
		
	}
	public String msgForValidateInvoice() throws Exception {
		waitUtility.hardSleep(driver);
		String st=MsgInvoiceHeader.getText();
		return st;
	}
	public void emailInvoice() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollBy(1000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		waitUtility.hardSleep(driver);
		Email.click();
		waitUtility.hardSleep(driver);
		clickokbuttononsend.click();
		waitUtility.hardSleep(driver);
	}
	


	public void clickOnActioButtonForDeleteCClientReparationDetails() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(1000,0)");
		waitUtility.hardSleep(driver);
		ActionButton.click();
		Delete.click();
		waitUtility.hardSleep(driver);
		//Deleteconfirmation.click();
	}
	public void viewLogSearch() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(1000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		waitUtility.hardSleep(driver);
		viewLog.click();
		waitUtility.hardSleep(driver);
	}
	public String getMsgViewLog() {
		String st=msgForViewLogHeader.getText();
		return st;
	}
	public void typePrintBarcode() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollBy(1000,0)");
		waitUtility.hardSleep(driver);
		ActionsClick.click();
		printBarcode.click();
		update.click();
	}
	public String getMsgForPrint() {
		String st=print.getText();
		return st;
	}


}

