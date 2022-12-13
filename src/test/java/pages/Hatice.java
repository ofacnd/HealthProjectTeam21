package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hatice {
    public Hatice() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "entity-menu")
    public WebElement myPages;

    @FindBy(xpath = "//*[span='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath = "//*[span='Make an Appointment']")
    public WebElement makeAnAppointment;

    @FindBy(id = "firstName")
    public WebElement hastaFirstName;

    @FindBy(xpath = "//*[.='Your FirstName is required.']")
    public WebElement hastaFirstNameRequired;


    @FindBy(id = "lastName")
    public WebElement hastaLastName;

    @FindBy(xpath = "//*[.='Your LastName is required.']")
    public WebElement hastaLastNameRequired;

    @FindBy(id = "ssn")
    public WebElement hastaSsn;

    @FindBy(xpath = "//*[.='Your SSN is required.']")
    public WebElement hastaSsnRequired;

    @FindBy(id = "email")
    public WebElement hastaEmail;

    @FindBy(xpath = "//*[.='Your email is required.']")
    public WebElement hastaEmailRequired;

    @FindBy(id = "phone")
    public WebElement hastaPhone;

    @FindBy(className = "invalid-feedback")
    public WebElement hastaPhoneRequiredOrInvalid;

    @FindBy(id = "appoDate")
    public WebElement appointmentDate;

    @FindBy(id = "register-submit")
    public WebElement sendAnAppointmentRequest;

    @FindBy (xpath = "//*[.='Appointment registration saved!']")
    public WebElement randevuSaved;


    @FindBy (xpath = "//*[.='Appointment date can not be past date!']")
    public WebElement pastDate;

    @FindBy(id = "appointment-heading")
    public WebElement appointmentListesi;


    @FindBy(xpath = "//*[@href='/contact']")
    public WebElement contactButton;

    @FindBy(xpath = "//*[@name=\"name\"]")
    public WebElement contactName;


    @FindBy(xpath = "//*[@name=\"email\"]")
    public WebElement contactEmail;


    @FindBy(xpath = "//*[@name=\"subject\"]")
    public WebElement contactSubject;


    @FindBy(xpath = "//*[@name=\"message\"]")
    public WebElement contactMessage;

    @FindBy(id = "register-submit")
    public WebElement sendButton;

    @FindBy(xpath = "//*[.='Your message has been received'][1]")
    public WebElement sendMessage;



    public void sil(WebElement element) {
        int limit =element.getAttribute("value").length();
        for (int i=0; i<=limit; i++) {
            element.sendKeys(Keys.BACK_SPACE);

        }
    }


}

