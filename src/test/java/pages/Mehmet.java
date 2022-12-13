package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Mehmet {

    public Mehmet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement makeAnAppointmentButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstNameButton;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(css="[class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement successBar;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesText;

    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement userText;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement settingsFirstNameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement settingsLastNameTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement settingsEmailTextBox;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement settingsSaveButton;

    @FindBy(css = "[id='phone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//*[span='Make an Appointment']")
    public WebElement userMakeAnAppointmentButton;


    @FindBy(css = "[id='appoDate']")
    public WebElement appointmentDateTimeTextBox;











}
