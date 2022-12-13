package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Denemee
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

}
