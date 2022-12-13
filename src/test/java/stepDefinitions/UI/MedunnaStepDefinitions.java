package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MedunnaStepDefinitions {
    Actions actions = new Actions(Driver.getDriver());

    String gunelUrun="Serum Yeni";
    LoginPage medunna = new LoginPage();

    @Given("Admin www.medunna.com adresine gider")
    public void adminWwwMedunnaComAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("www.medunna.com"));
    }

    @Then("Giris yap simgesine ve acilan menude Sign-in secenegine tiklar")
    public void girisYapSimgesineVeAcilanMenudeSignInSecenegineTiklar() {
        medunna.girisSimgesi.click();
        medunna.signin.click();
    }

    @And("Admin gecerli bir Username girer")
    public void adminGecerliBirUsernameGirer() throws InterruptedException {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("username"));
        Thread.sleep(2);
    }

    @And("Admin gecerli bir password girer")
    public void adminGecerliBirPasswordGirer() throws InterruptedException {
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        Thread.sleep(2);
    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        medunna.singinButonu.click();
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("Staff gecerli bir Username girer")
    public void staffGecerliBirUsernameGirer() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("staffUsername"));
    }

    @And("Staff gecerli bir password girer")
    public void staffGecerliBirPasswordGirer() throws InterruptedException {
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("staffPassword"));
        Thread.sleep(2);
    }

    @And("Doktor gecerli bir Username girer")
    public void doktorGecerliBirUsernameGirer() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("drUsername"));
    }

    @And("Doktor gecerli bir password girer")
    public void doktorGecerliBirPasswordGirer() throws InterruptedException {
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("drPassword"));
        Thread.sleep(2);
    }

    @And("Hasta gecerli bir Username girer")
    public void hastaGecerliBirUsernameGirer() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("hastaUsername"));
    }

    @And("Hasta gecerli bir password girer")
    public void hastaGecerliBirPasswordGirer() throws InterruptedException {
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("hastaPassword"));
        Thread.sleep(2);
    }
}
