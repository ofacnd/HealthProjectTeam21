package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Mustafa {

    public Mustafa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement girisSimgesi;

    @FindBy(css = "[id='login-item']")
    public WebElement signin; // Giris simgesine tıkladıktan sonra acilan menude signin secenegi

    @FindBy(css = "[name='username']")
    public WebElement signInUsernameBox;

    @FindBy(css = "[name='password']")
    public WebElement passwordBox;

    @FindBy(css = "[class='btn btn-primary']")
    public WebElement singinButonu; // Kullanici girisi kisminda bulunan signin butonu

    @FindBy(xpath = "//a[@class='dropdown-item'][2]")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "(//div//div//form//div)[1]")
    public WebElement ssnInvalidFeedback;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "(//div//div//form//div)[2]")
    public WebElement firstNameInvalidFeedback;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "(//div//div//form//div)[3]")
    public WebElement lastNameInvalidFeedback;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "(//div//div//form//div)[4]")
    public WebElement userNameinvalidFeedback;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "(//div//div//form//div)[5]")
    public WebElement emailBoxinvalidFeedback;

    @FindBy(xpath = "(//div//div//form//div)[6]")
    public WebElement passwordInvalidFeedback;

    @FindBy(xpath = "//input[@id='firstPassword']")//Registration sayfasindaki password box
    public WebElement regPasswordBox;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationIcon;

    @FindBy(xpath = "//span[text()='Remember me']")
    public WebElement rememberMeOption;

    @FindBy(xpath = "//span[text()='Did you forget your password?']")
    public WebElement didYouForgetYourPasswordOption;

    @FindBy(xpath = "//span[text()='Register a new account']")
    public WebElement registerANeAccountOption;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelOption;


    @FindBy(xpath = "(//ul[@id='strengthBar']//li)[1]")
    public WebElement passwordStrengthbar;

    public int passwordStrengthLevel() {
        int level = 0;
        String strPasswordStrenghtLevel = passwordStrengthbar.getAttribute("style");

        switch (strPasswordStrenghtLevel) {
            case "background-color: rgb(255, 0, 0);":
                level = 1;
                break;
            case "background-color: rgb(255, 153, 0);":
                level = 2;
                break;
            case "background-color: rgb(153, 255, 0);":
                level = 3;
                break;
            case "background-color: rgb(0, 255, 0);":
                level = 4;
                break;
        }
        return level;
    }

}
