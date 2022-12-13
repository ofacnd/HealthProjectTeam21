package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Ali {

    public Ali() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span" )
    public WebElement itemsTitles;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[9]/span")
    public WebElement messagesButton;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[1]/span")
    public WebElement messagesID;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[2]")
    public WebElement messagesName;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[3]/span")
    public WebElement messagesEmail;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[4]/span")
    public WebElement messagesSubject;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[5]/span")
    public WebElement messagesMessage;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement messagesNewMessage;

    @FindBy(xpath = "//*[@id=\"c-message-name\"]")
    public WebElement messagesNewName;

    @FindBy(xpath = "//*[@id=\"c-message-email\"]")
    public WebElement messagesNewEmail;

    @FindBy(xpath = "//*[@id=\"c-message-subject\"]")
    public WebElement messagesNewSubject;

    @FindBy(xpath = "//*[@id=\"c-message-message\"]")
    public WebElement messagesWriteMessage;

    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement messagesSaveMessage;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]")
    public WebElement lastSentMessages;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[2]/td[1]/a")
    public WebElement ilkMessageID;

    @FindBy (xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/a[2]/span/span")
    public WebElement editMessage;

    @FindBy (xpath = "//*[@id=\"c-message-message\"]")
    public WebElement editMessageWrite;

    @FindBy (xpath = "//*[@id=\"save-entity\"]")
    public WebElement editMessageSave;

    @FindBy (xpath = "//span[normalize-space()='Country']")
    public WebElement countryButton;

    @FindBy (xpath = "//*[@id=\"jh-create-entity\"]")
    public WebElement newCountryButton;

    @FindBy (xpath = "//*[@id=\"country-name\"]")
    public WebElement newCountryNameButton;

    @FindBy (xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement countrySaveButton;

    @FindBy (css="[class='Toastify__close-button Toastify__close-button--success']")
    public WebElement onayYazisi;


    @FindBy (xpath = "//*//tbody//tr//td[2]")
    public List<WebElement>countryList;




    @FindBy (xpath="//*[contains(text(), 'A Country is deleted with identifier')]")
    public WebElement silindiYazisi;

    @FindBy (xpath="//*[contains(text(), 'A new Country is created with identifier')]")
    public WebElement olusturulduYazisi;



}
