package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Yusuf {

    public Yusuf() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // US17_18 Baslangic
    @FindBy(css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy(css = "[id='login-item']")
    public WebElement signin; // Giris simgesine tıkladıktan sonra acilan menude signin secenegi

    @FindBy(css = "[name='username']")
    public WebElement usernameBox;

    @FindBy(css = "[name='password']")
    public WebElement passwordBox;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement singinButonu; // Kullanici girisi kisminda bulunan signin butonu

    @FindBy(css = "[id='entity-menu']")
    public WebElement itemsTitleMenusu;

    @FindBy(xpath = "//span[text()='Test Item']")
    public WebElement testItem; // Item&Title menusunde bulunan bolum

    @FindBy(id = "jh-create-entity")
    public WebElement createANewTestItems;

    @FindBy(css = "[id='c-test-item-name']")
    public WebElement nameBox; // Create a New Test Item butonuna tıkladıktan sonra acilan Menude bulunan name kutusu;

    @FindBy(css = "[class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement kaydedildiYazisi; // Test Item kaydı yapıldıktan sonra cikan kaydedildi yazisi

    // US17 TC002 ek
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[14]")
    public WebElement serumEditButonu;

    // US17 TC003 ek
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[13]")
    public WebElement serumGoruntulemeButonu;

    @FindBy(xpath = "(//*[text()='Test Item'])[2]")
    public WebElement guncelUrunName;

    // US17 TC004 ek
    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[15]")
    public WebElement serumDeleteButonu;

    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public WebElement deleteButonu;

    // US18 TC001 ek
    @FindBy(css = "[name='id']")
    public WebElement doktorID;

    @FindBy(xpath = "//span[text()='Physician']")
    public WebElement physician; // Item&Title menusunde bulunan Physician bolumu

    @FindBy(xpath = "//tbody//tr[4]//td[18]//span[text()='Edit']")
    public WebElement doktorEdit;

    // US18 TC002 ek
    @FindBy(xpath = "//*[text()='Create a new Physician']")
    public WebElement doktorCreataNewButonu;

    @FindBy (id = "searchSSN")
    public WebElement doktorSSNBox;

    @FindBy(css = "[class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement kayitliUyarisi;

    // US18 TC003 ek
    @FindBy (xpath = "//*[text()='Save']")
    public WebElement saveButonu;

    @FindBy (xpath = "//*[text()='Create or edit a Physician']")
    public WebElement createOrEditSayfasi;

    @FindBy (css = "[name='firstName']")
    public WebElement drFirstnameBox;

    // US18 TC004 ek
    @FindBy (css = "[id='physician-speciality']")
    public WebElement specialityBox;

    // US18 TC005 ek

    @FindBy (css = "[id='physician-adress']")
    public WebElement addressBox;

    @FindBy (css = "[id='file_image']")
    public WebElement profilPhoto;


    // US18 TC006 ek
    @FindBy (css = "[id='physician-examFee']")
    public WebElement examFeeBox;


    // US18 TC007 ek
    @FindBy (css = "[id='admin-menu']")
    public WebElement administrationMenu;

    @FindBy (css = "//span[text()='User management']")
    public WebElement userManagement;

    @FindBy (xpath = "(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement adminEditButonu;

    @FindBy (xpath = "//*[text()='ROLE_STAFF']")
    public WebElement profilesStaff;

    // US18 TC008 ek
    @FindBy (xpath = "(//*[@class='btn btn-danger btn-sm'])[1]")
    public WebElement deleteButonuDr;

    @FindBy (id = "jhi-confirm-delete-physician")
    public WebElement onayDeleteDr;


}
