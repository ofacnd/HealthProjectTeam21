package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Msk {
    public Msk(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy (css = "[id='login-item']")
    public WebElement signin; // Giris simgesine tıkladıktan sonra acilan menude signin secenegi

    @FindBy (css = "[name='username']")
    public WebElement usernameBox;

    @FindBy (css = "[name='password']")
    public WebElement passwordBox;

    @FindBy (css = "[class='btn btn-primary']")
    public WebElement singinButonu; // Kullanici girisi kisminda bulunan signin butonu
    @FindBy (xpath = "//*[text()='Kerem Polat']")
    public WebElement bosUser;
    @FindBy (css = "[class='svg-inline--fa fa-lock fa-w-14 fa-fw ']")
    public WebElement passwordSimgesi;
    @FindBy (css = "[name='currentPassword']")
    public WebElement currentPassword;
    @FindBy (css = "[name='newPassword']")
    public WebElement newPassword;
    @FindBy (css = "[name='confirmPassword']")
    public WebElement confirmPassword;
    @FindBy (css = "[value='9g25p6v6jusd9g25p6v6jusd']")
    public WebElement controlPassword;

    @FindBy (xpath = "//li[@style='background-color: rgb(221, 221, 221);']")
    public List<WebElement> controlPasswordStreght;
    @FindBy (xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public List<WebElement> passwordStrengthGreen;




    @FindBy (css = "[class='btn btn-success']")
    public WebElement savePasswordButton;
    @FindBy (xpath = "//*[text()='Failed to sign in!']")
    public WebElement failedToSignin;
    @FindBy (css = "[class='svg-inline--fa fa-sign-out-alt fa-w-16 fa-fw ']")
    public WebElement signOutSimgesi;
    @FindBy (css = "[class='btn btn-primary']")
    public WebElement signinAgain;
    @FindBy (xpath = "//*[text()='MY PAGES']")
    public WebElement myPagesButton;
    @FindBy (css = "[class='svg-inline--fa fa-search fa-w-16 fa-fw ']")
    public WebElement searchPatientButton;
    @FindBy (css = "[class='btn btn-primary btn-sm']")
    public WebElement editButton;
    @FindBy (css = "[id='patient-id']")
    public WebElement patientId;
    @FindBy (css = "[id='patient-firstName']")
    public WebElement patientFirstName;

    @FindBy (css = "[id='patient-lastName']")
    public WebElement patientLastName;
    @FindBy (css = "[id='patient-birthDate']")
    public WebElement patientBirthDate;
    @FindBy (css = "[id='email']")
    public WebElement patientEmail;
    @FindBy (css = "[id='patient-phone']")
    public WebElement patientPhone;

    @FindBy (css = "[id='patient-gender']")
    public WebElement patientGender;

    @FindBy (xpath = "//option[@value='MALE']")
    public WebElement patientGenderMALE;
    @FindBy (xpath = "//option[@value='Bnegative']")
    public WebElement patientBloodBnegative;
    @FindBy (xpath = "//option[@value='3309']")
    public WebElement patientUserJonathan;
    @FindBy (xpath = "//option[@value='1201']")
    public WebElement patientCountryTurkiye;
    @FindBy (xpath = "//option[@value='207079']")
    public WebElement patientCityKutahya;
    @FindBy (xpath = "//*[text()='715-15-1516']")
    public WebElement searchSSNnumber;

    @FindBy (css = "[id='patient-bloodGroup']")
    public WebElement patientBloodGroup;
    @FindBy (css = "[id='patient-adress']")
    public WebElement patientAdress;
    @FindBy (css = "[id='patient-description']")
    public WebElement patientDescription;
    @FindBy (css = "[id='patient-user']")
    public WebElement patientUser;
    @FindBy (css = "[id='patient-country']")
    public WebElement patientCountry;
    @FindBy (css = "[id='patient-cstate']")
    public WebElement patientStateCity;
    @FindBy (css = "[class='svg-inline--fa fa-save fa-w-14 ']")
    public WebElement patientSaveButton;
    @FindBy (css = "[class='form-control']")
    public WebElement patientSearchBox;

    @FindBy (xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointmentsButon;
    @FindBy (xpath = "//h2[@id='appointment-heading']")
    public WebElement appointmentsText;

    @FindBy (xpath = "//tr/th/span")
    public List<WebElement> appointmentsRow;
    @FindBy (css = "[id='fromDate']")
    public WebElement fromToDate;

    @FindBy (css = "[id='toDate']")
    public WebElement toDate;

}
