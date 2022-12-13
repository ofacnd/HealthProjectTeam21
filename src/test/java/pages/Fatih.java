package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Fatih {
    public Fatih() { PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy (xpath = "//*//tbody//tr//td[2]")
    public List<WebElement> nameList;

    @FindBy (xpath = "//*[@type='checkbox']")
    public List<WebElement> onayList;




    @FindBy(xpath = "(//*[text()='My Appointments'])[2]")
    public WebElement myAppointments; // Ana Sayfada en alt kisimda yer alan My Appointments Butonu
    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement editButton; // Hasta Listesindeki EDIT butonu
    @FindBy(xpath = "//h2")
    public WebElement createOrEditAppointment; // Hasta sayfasina girildiginde karsina Cikan Ilk Yazi

    @FindBy(xpath = "//*[@class='btn btn-success btn-sm']")
    public WebElement requestATestButton;

    //US_011 TC_002

    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idText;
    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateText;
    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateText;
    @FindBy(xpath = "//*[text()='Physician']")
    public WebElement physicianText;
    @FindBy(xpath = "//*[text()='Physician']")
    public WebElement screenShot5TabBoxes;
    //US_11 TC_003 Locators
    @FindBy(css = "[name='anamnesis']")
    public WebElement anamnesisTextBox;
    @FindBy(css = "[name='treatment']")
    public WebElement treatmentTextBox;

    @FindBy(css = "[name='diagnosis']")
    public WebElement diagnosisTextBox;
    //US11 TC_004 Locators
    @FindBy(css = "[id='appointment-status']")
    public WebElement statusBox;
    @FindBy(css = "//*[text()='PENDING']")
    public WebElement pendingChoice;
    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[3]")
    public WebElement editButton3;

    @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
    public WebElement requiredText1;    //  Anamnesis, Treatment ve Diagnosis  kutulari bos kalirsa Cikan Uyari Yazisi - 1
    @FindBy(xpath = "(//*[text()='This field is required.'])[2]")
    public WebElement requiredText2;    //  Anamnesis, Treatment ve Diagnosis  kutulari bos kalirsa Cikan Uyari Yazisi - 2
    @FindBy(xpath = "(//*[text()='This field is required.'])[3]")
    public WebElement requiredText3;    //  Anamnesis, Treatment ve Diagnosis  kutulari bos kalirsa Cikan Uyari Yazisi - 3
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButoon;   //  Create or Edit An Appointment sayfasindaki save Butonu



    //  US_12  >>  TC_002  >>   Secilecek 9 adet test
    @FindBy(css = "[id='1402']")
    public WebElement testUrea;
    @FindBy(css = "[id='132751']")
    public WebElement testGlucose;
    @FindBy(css = "[id='1403']")
    public WebElement testCreatinine;
    @FindBy(css = "[id='1404']")
    public WebElement testSodium;
    @FindBy(css = "[id='1405']")
    public WebElement testPotassium;
    @FindBy(css = "[id='1406']")
    public WebElement testTotalProtein	;
    @FindBy(css = "[id='1407']")
    public WebElement testAlbumin;
    @FindBy(css = "[id='1408']")
    public WebElement testHemoglobin;
    @FindBy(xpath = "//*[text()='Save']")
    public WebElement testPageSaveButton;

//    >>>>>   US_013  >>   TC_001

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButton;
    @FindBy(xpath = "(//*[text()='Search Patient'])[1]")
    public WebElement searchPatientButton;
    @FindBy(xpath = "//*[@name='ssn']")
    public WebElement ssnInputBox;

    @FindBy(css = "[class='svg-inline--fa fa-calendar-week fa-w-14 ']")
    public WebElement showAppointmentsButton;

    @FindBy(xpath = "//*[text()='Show Tests']")
    public WebElement showTestsButton;
    @FindBy(css = "[class='d-none d-md-inline']")
    public WebElement viewResultsButton;

    @FindBy(css = "[id='c-test-result-result']")
    public WebElement resultInputBox;
    @FindBy(xpath = "//*//tbody//tr//td[7]")
    public List<WebElement> descriptionList;
    @FindBy(css = "[class='btn btn-danger btn-sm']")
    public WebElement showTestResultsDoctorButton;
    @FindBy(css = "[class='d-none d-md-inline']")
    public WebElement viewResultsDoctorButton;
    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> doctorListAssertion;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> testNameList;

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> testIDList;

//    <<<<<   US13_TC001   <<<<<<


    //US_13  TC002   >>>>>

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement requestInpatient;

    @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[1]/div/div")
    public WebElement reqInpatSuccess;


    //US14_TC001   >>>
    @FindBy (xpath = "//*[text()='MyInPatients']")
    public WebElement myInpatientsButton;


    //   Inpatients Sayfasindaki TEXT locators
    @FindBy (xpath = "//*[text()='Description']")
    public WebElement descriptionTextInp;
    @FindBy (xpath = "//*[text()='In Patients']")
    public WebElement inpatientsTextInp;
    @FindBy (xpath = "//*[text()='ID']")
    public WebElement idTextInp;
    @FindBy (xpath = "//*[text()='Start Date']")
    public WebElement startDateTextInp;
    @FindBy (xpath = "//*[text()='End Date']")
    public WebElement endDateTextInp;
    @FindBy (xpath = "//*[text()='Appointment']")
    public WebElement appointmentTextInp;
    @FindBy (xpath = "//*[text()='Room']")
    public WebElement roomTextInp;
    @FindBy (xpath = "//*[text()='Patient']")
    public WebElement patientTextInp;

    //   US14_TC02_03
    @FindBy (css = "[id='in-patient-status']")
    public WebElement statusTextBox;
    @FindBy (css = "[id='save-entity']")
    public WebElement saveButtonInp;






}
