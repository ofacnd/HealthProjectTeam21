package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Fatma {


    public Fatma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement itemsTitles;


    @FindBy(xpath = "//*[text()='Patient']")
    public WebElement patientButonu;


    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement createANewPatientButonu;


    @FindBy(css = "[name='firstName']")
    public WebElement newPatientFirstName;


    @FindBy(xpath = "//*[@id=\"patient-lastName\"]")
    public WebElement newPatientlastName;

    @FindBy(xpath = "//*[@id=\"patient-birthDate\"]")
    public WebElement newPatientBirtDay;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement newPatientEmail;

    @FindBy(xpath = "//*[@id=\"patient-phone\"]")
    public WebElement newPatientPhone;

    @FindBy(xpath = "//*[@id=\"patient-gender\"]")
    public WebElement newPatientGender;

    @FindBy(xpath = "//*[@id=\"patient-bloodGroup\"]")
    public WebElement newPatientBloodGroup;

    @FindBy(xpath = "//*[@id=\"patient-adress\"]")
    public WebElement newPatientAddress;

    @FindBy(xpath = "//*[@id=\"patient-description\"]")
    public WebElement newPatientDescription;

    @FindBy(xpath = "//*[@id=\"patient-user\"]")
    public WebElement newPatientUser;

    @FindBy(xpath = "//*[@id=\"patient-country\"]")
    public WebElement newPatientCountry;

    @FindBy(xpath = "//*[@id=\"patient-cstate\"]")
    public WebElement newPatientCity;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement newPatientSaveButonu;

    @FindBy(xpath = "//div[contains(text(),'A new Patient is created with identifier')]")
    public WebElement newPatientSuccess;


    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement newPatientEdit;

    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement createPatientEditFirstName;


    @FindBy(xpath = "//div[contains(text(),'A Patient is updated with identifier')]")
    public WebElement newPatientUpdated;

    @FindBy(xpath = "(//*[text()='View'])[1]")
    public WebElement newPatientView;

    @FindBy(xpath = "//*//dt")
    public List<WebElement> dogrulamaList;

    @FindBy(xpath = "//*[text()='Appointment']")
    public WebElement AppointmentButonu;

    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement AppointmentPhysicianButonu;

    @FindBy(xpath = "//div[contains(text(),'The Appointment is updated with identifier')]")
    public WebElement appointmenttUpdated;


    @FindBy(xpath = "//div[contains(text(),'A new Patient is created with identifier')]")
    public WebElement aPatientIsCreatedWithIdenfierYazi;


    @FindBy(xpath = "//*[@id=\"admin-menu\"]/a/span")
    public WebElement administrationSelectBolumu;


    @FindBy(xpath = "//*[@id=\"admin-menu\"]/div/a/span")
    public WebElement UserManagementButonu;


    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement herhangiBirHastaninDeleteButonu;


    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement createANewRoomButonu;


    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement createARoomSayfasindakiSaveButonu;


    @FindBy(xpath = "//div[contains(text(),'A Room is updated with identifier')]")
    public WebElement ARoomIsUpdateddWithIdentifierYazisi;

    @FindBy(xpath = "//*[@id=\"room-status\"]")
    public WebElement statusButonunu;

    @FindBy(xpath = "//*[@id=\'room-price\']")
    public WebElement priceBox;

    @FindBy(xpath = "//*[@id=\"room-description\"]")
    public WebElement descriptionInputBox;


    @FindBy(xpath = "//*[@id=\"room-roomNumber\"]")
    public WebElement roomKutusu;


    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[6]/span")
    public WebElement roomButonu;

    @FindBy(css = "[class='Toastify__progress-bar Toastify__progress-bar--animated Toastify__progress-bar--success']")
    public WebElement succesBar;


    @FindBy(xpath = "//*[@id=\"room-createdDate\"]")
    public WebElement tarihButonu;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[2]/div[2]/div/nav/ul/li[9]/a")
    public WebElement sayfasonunaGider;

    @FindBy(xpath = "//*//tbody//tr//td[2]")
    public List<WebElement> odalist;

    @FindBy(xpath = "//*//tbody//tr//td[7]")
    public List<WebElement> tarihList;

    @FindBy(xpath = "\n" + "//* [text()='Room Type']")
    public WebElement roomType1;

    @FindBy(xpath = "//*//tbody//tr//td[3]")
    public List<WebElement> roomTypelarinAyniOlmasi;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[8]/div/a[3]/span/span")
    public WebElement roomDeleteButonu;

    @FindBy(xpath = "(//*[text()='Delete'])[20]")
    public WebElement roomConfirmDelete;

    @FindBy(xpath = "//div[contains(text(),'A new Room is created with identifier')]")
    public WebElement aNewRoomIsCreatedWithIdentiferYazisi;


    @FindBy(xpath = "(//*[text()='Delete'])[21]")
    public WebElement usersConfirmDelete;

    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement roomEditButonu;

    @FindBy(css = "[class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement deleteSaveSuccess;

    @FindBy(xpath = "//*[@id=\"room-roomNumber\"]")
    public WebElement roomNumber;

}

