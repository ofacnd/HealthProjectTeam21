package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Basak {

    public Basak() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //US19-TC01
    @FindBy(css = "[id='entity-menu']")
    public WebElement ItemsTitle;
    @FindBy(xpath = "(//span[text()='Staff'])[1]")
    public WebElement staff;

    @FindBy(xpath = "//span[text()='Create a new Staff']")
    public WebElement createANewStaff;

    @FindBy(css ="[type='checkbox']")
    public WebElement useSearch;

    @FindBy(css ="[id='searchSSN']")
    public WebElement searchSSNBox;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement ssnSearchAlert;

    //US19-TC02
    @FindBy(css ="[name='firstName']")
    public WebElement staffFirstName;

    @FindBy(css ="[name='lastName']")
    public WebElement staffLastName;

    @FindBy(css ="[name='birthDate']")
    public WebElement staffBirthDate;

    @FindBy(css ="[name='phone']")
    public WebElement staffPhoneNumber;

    @FindBy(css ="[name='gender']")
    public WebElement staffGender;

    @FindBy(css ="[name='bloodGroup']")
    public WebElement staffBloodGroup;

    @FindBy(css ="[name='adress']")
    public WebElement staffAdress;

    @FindBy(css ="[name='description']")
    public WebElement staffDescription;

    @FindBy(css ="[name='createdDate']")
    public WebElement staffCreatedDate;

    @FindBy(css ="[name='user.id']")
    public WebElement staffUserId;

    @FindBy(css ="[name='country.id']")
    public WebElement staffCountry;

    @FindBy(css ="[name='cstate.id']")
    public WebElement staffState;

    @FindBy(css="[id='save-entity']")
    public WebElement staffSaveButton;

    //US19 TC03

    @FindBy(xpath ="(//*[@class='btn btn-link btn-sm'])[1]")
    public WebElement staffID;

    @FindBy(xpath="(//*[text()='Staff'])[2]")
    public WebElement staffIdDogrulama;

    //US19 TC04
    @FindBy(xpath="(//*[@class='btn btn-primary btn-sm'])[1]")
    public WebElement staffEdit;

    @FindBy(css="[id='staff-adress']")
    public WebElement staffEditAdress;

    @FindBy(css="[class='btn btn-primary']")
    public WebElement staffEditSave;

    @FindBy(xpath="//div[contains(text(),'A Staff is updated with identifier')]")
    public WebElement staffEditSuccess;

    //US19 TC05
    @FindBy(xpath="(//*[@class='btn btn-danger btn-sm'])[1]")
    public WebElement staffDelete;

    @FindBy(css="[id='jhi-confirm-delete-staff']")
    public WebElement staffConfirmDelete;

    @FindBy(xpath="//div[contains(text(),'A Staff is deleted with identifier')]")
    public WebElement staffDeleteSuccess;

    //US20 TC01

    @FindBy(css="[id='admin-menu']")
    public WebElement administrationButton;

    @FindBy(xpath="//*[text()='User management']")
    public WebElement userManagement;

    @FindBy(xpath="(//*[@class='btn btn-info btn-sm'])[1]")
    public WebElement AdminViewButton;

    @FindBy (xpath="//*//dt")
    public List<WebElement> kayitliKisiler;

    //US20TC02

    @FindBy(xpath="(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement usersEditButton;

    @FindBy(css="[id='activated']")
    public WebElement usersEditActivatedButton;


    @FindBy(css="[id='authorities']")
    public WebElement usersEditRole;


    @FindBy(css=" [class='btn btn-primary']")
    public WebElement AdminEditSaveButton;

    @FindBy(xpath="//div[contains(text(),'A user is updated with identifier')]")
    public WebElement adminDeleteSuccess;




    //US20 TC03
    @FindBy(xpath="(//*[@class='btn btn-danger btn-sm'])[15]")
    public WebElement adminDeleteButton;

    @FindBy(xpath="(//*[@class='page-link'])[7]")
    public WebElement adminSonSayfa;

    @FindBy(xpath="//*[@class='modal-content']//*[text()='Delete']")
    public WebElement adminConfirmDelete;


    @FindBy(css="[class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement adminSaveSuccess;

    //US21TC01

    @FindBy(xpath="//*[text()='MY PAGES']")
    public WebElement staffMyPages;


    @FindBy(xpath="(//*[text()='Search Patient'])[1]")
    public WebElement staffSearchPatient;

    @FindBy(xpath="(//*[text()='Show Appointments'])[1]")
    public WebElement staffShowAppointments;

    @FindBy(xpath="(//*[text()='Edit'])[1]")
    public WebElement staffEditButton;

    @FindBy(css="[name='startDate']")
    public WebElement staffStartDate;
    @FindBy(css="[id='appointment-status")
    public WebElement staffStatus;
    @FindBy(css="[id='appointment-physician']")
    public WebElement staffPhysician;
    @FindBy(css="[id='save-entity']")
    public WebElement staffSaveButton2;

    @FindBy(xpath="//div[contains(text(),'The Appointment is updated with identifier')]")
    public WebElement staffEditSuccessAlert;



    //US21TC02
    @FindBy(css="[id='appointment-status']")
    public List <WebElement> StaffStatus;



    //US21TC03
    @FindBy(css="[id='appointment-anamnesis']")
    public WebElement staffAnemnesis;

    @FindBy(css="[id='appointment-treatment']")
    public WebElement staffTreatment;

    @FindBy(css="[id='appointment-diagnosis']")
    public WebElement staffDiagnosis;





}
