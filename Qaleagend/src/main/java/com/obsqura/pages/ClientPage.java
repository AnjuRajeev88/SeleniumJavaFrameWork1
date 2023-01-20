package com.obsqura.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.GenericUtility;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.WaitUtility;

public class ClientPage {
	WaitUtility waitUtility = new WaitUtility();
	PageUtility pageUtility = new PageUtility();
	GenericUtility genericUtility=new GenericUtility();

	public WebDriver driver;
	@FindBy(xpath = "//a[@href='https://qalegend.com/mobile_service/panel/customers']")
	WebElement Client;
	@FindBy(xpath = "//label[text()='Search']")
	WebElement search;
	@FindBy(xpath = "//select[@name='dynamic-table_length']")
	WebElement show;
	@FindBy(xpath = "//button[@href='#clientmodal']")
	WebElement AddClient;
	@FindBy(xpath = "//input[@id='name1']")
	WebElement ClientName;
	@FindBy(xpath = "//input[@id='company1']")
	WebElement CompanyName;
	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement GeoLocate;
	@FindBy(xpath = "//input[@id='route']")
	WebElement Address;
	@FindBy(xpath = "//input[@id='locality']")
	WebElement City;
	@FindBy(xpath = "//input[@id='postal_code']")
	WebElement PostalCode;
	@FindBy(xpath = "//input[@id='telephone']")
	WebElement Telephone;
	@FindBy(xpath = "//input[@id='email1']")
	WebElement Email;
	@FindBy(xpath = "//input[@id='vat1']")
	WebElement Vat;
	@FindBy(xpath = "//input[@id='cf1']")
	WebElement SSN;
	@FindBy(xpath = "//input[@id='image']")
	WebElement Fileupload;
	@FindBy(xpath = "//textarea[@id='comment1']")
	WebElement Comments;
	@FindBy(xpath = "//button[text()=' Add Client']")
	WebElement AddClientDetails;
	@FindBy(xpath = "//div[@id='titoloclienti']")
	WebElement MsgForClientAdded;
	@FindBy(xpath = "//td[text()='Keerthi']//preceding-sibling::td")
	WebElement SelectCheckbox;
	@FindBy(xpath = "//*[@id='dynamic-table']/tbody/tr[1]/td[7]//button")
	WebElement Actions;
	@FindBy(xpath = "//a[@href='#view_client']")
	WebElement viewClient;
	@FindBy(xpath = "//table[@id='dynamic-table']//tr[1]//td[5]")
	WebElement MsgForViewClient;
	// @FindBy(xpath="//span[text()='multidata@gmail.com']")
	// WebElement msgForViewClient;
	@FindBy(xpath = "//a[@id='delete_client']")
	WebElement DeleteClient;
	@FindBy(xpath = "//button[@data-bb-handler='confirm']")
	WebElement confirmmsg;
	@FindBy(xpath = "//div[text()='Client was deleted from the database']")
	WebElement DeleteClientMsg;
	@FindBy(xpath = "//a[@id='modify_client']")
	WebElement ModifyClientDetails;
	@FindBy(xpath = "//button[@id='submit']")
	WebElement EditSaveButton;
	@FindBy(xpath = "//div[text()='Client: Aswathy']")
	WebElement MsgForEditClient;
	// @FindBy(xpath="//a[@data-num='4d5ae80d87aa59fdf0ce951053bd84e7.jpg']")
	//@FindBy(xpath = "//a[@id='view_image']")
	@FindBy(xpath = "//a[@id='view_image']")
	WebElement ViewClientImage;
	@FindBy(xpath = "//div[text()='No Image Uploaded']")
	WebElement MsgForUnuploadedImage;
	
	@FindBy(xpath = "//a[@href='https://qalegend.com/mobile_service/panel/customers/view_repairs/893']")
	WebElement viewClientRepairs;
	@FindBy(xpath="//*[@id=\"view-repars-table\"]/tbody/tr")
	WebElement NoData;
	@FindBy(xpath="//*[@id=\"dynamic-table\"]/tbody/tr[3]/td[7]/div/div/button")
	WebElement ActionButton;
	@FindBy(xpath="//img[@src='https://qalegend.com/mobile_service/assets/uploads/images/4d5ae80d87aa59fdf0ce951053bd84e7.jpg']")
    WebElement UploadedImageColor;
	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterClientDetails(String name, String company, String address, String city, String postalcode,
			String phone, String email, String vat, String ssn, String comments) throws InterruptedException {
		ClientName.sendKeys(name);
		CompanyName.sendKeys(company);
		Address.sendKeys(address);
		City.sendKeys(city);
		PostalCode.sendKeys(postalcode);
		Telephone.sendKeys(phone);
		Email.sendKeys(email);
		Vat.sendKeys(vat);
		SSN.sendKeys(ssn);
		System.out.println("addSucess");
		Comments.sendKeys(comments);
		System.out.println("addSucess");
		pageUtility.fileUpload(driver, Fileupload);
		System.out.println("file uploaded");
		System.out.println("addSucess");
		AddClientDetails.click();

	}

	public void clickClient() {
		Client.click();

	}

	public void addClientClick() {
		AddClient.click();
	}

	public void addClientname(String name) {
		ClientName.sendKeys(name);
		waitUtility.waitForElementToBeClickable(driver, ClientName);

	}

	public void addCompanyName(String companyname) {
		CompanyName.sendKeys(companyname);
	}

	public void addAddress(String address) {
		Address.sendKeys(address);
	}

	public void addCity(String city) {
		City.sendKeys(city);
	}

	public void addPostalCode(String postalcode) {
		PostalCode.sendKeys(postalcode);
	}

	public void addTelephone(String phone) {
		Telephone.sendKeys(phone);
	}

	/*public void addEmail(String email) {
		Email.sendKeys(email);
	}*/
	public void addEmail() {
		genericUtility.getRandomNumber(Email);
	}

	public void addVat(String vat) {
		Vat.sendKeys(vat);
	}

	public void addSsn(String ssn) {
		SSN.sendKeys(ssn);
	}

	public void toFileUpload() {
		pageUtility.fileUpload(driver, Fileupload);
	}

	public void addComments(String comment) {
		Comments.sendKeys(comment);
	}

	public void addClientDetails() {
		AddClientDetails.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public String addedDetails() {
		String st =MsgForClientAdded.getText();
		System.out.println(st);
		return st;
	}

	public void clickSearch(String clientname) {
		search.sendKeys(clientname);
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectClientActions() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Actions.click();

	}

	public void selectCheckboxOfAClient() {
		SelectCheckbox.click();
	}

	public void searchForViewClientDetails() {
		viewClient.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getReportForViewClient() {
		String st = MsgForViewClient.getText();
		System.out.println(st);
		return st;
	}

	public void deleteAClientFromDatabase() {
		DeleteClient.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void msgForDeleteClientConfirmation() {
		confirmmsg.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String msgForDeleteClient() {
		String st = DeleteClientMsg.getText();
		System.out.println(st);
		return st;
	}

	public void editClientDetails(String email) {
		ModifyClientDetails.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Email.clear();
		Email.sendKeys(email);
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickForEditedClientDetailsSaveButton() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EditSaveButton.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String msgForEditedClientDetails() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String st = MsgForEditClient.getText();
		return st;
	}

	public void clickToViewclientimageGotAAlertForUnuploadedFile() {
		/*try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		ViewClientImage.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickOnViewImage() {
	
		ViewClientImage.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String msgForUnuploadedFile() {
		String st = MsgForUnuploadedImage.getText();
		return st;
	}

	public void clickOnActionButton() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ActionButton.click();
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	public void searchForViewClientRepairs() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		viewClientRepairs.click();
		
	
	}
	public String getMsgForNoDataIsAvaibleInClientViewRepairs() {
		try {
			waitUtility.hardSleep(driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String st=NoData.getText();
		System.out.println(st);
		return st;
	}
	public String getUploadedImageColor() {
		String color = UploadedImageColor.getCssValue("color");
		System.out.println(color);
		String hexColor = org.openqa.selenium.support.Color.fromString(color).asHex();
		System.out.println(hexColor);
		return hexColor;
	}
	/*
	 * public void fileConverToPdfExcelImportDelete() { Select dropdown=new
	 * Select(FileChangeActions); dropdown.selectByIndex(1); } public void
	 * clickDropDown() { Selection.click(); }
	 */

	/*
	 * public void select() {
	 * 
	 * Select s = new Select(); s.selectByVisibleText("Alpha_new"); }
	 */
}

