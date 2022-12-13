package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class Mehmet {
    pages.Mehmet mehmetMedunnaPage = new pages.Mehmet();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());

    @Then("Kullanici Make an Appointment butonuna tiklar.")
    public void kullaniciMakeAnAppointmentButonunaTiklar() throws InterruptedException {
        Thread.sleep(2);

        js.executeScript("arguments[0].click();",mehmetMedunnaPage.makeAnAppointmentButton);

    }
    @And("Kullanici First Name girer.")
    public void kullaniciFirstNameGirer() {

        actions.moveToElement(mehmetMedunnaPage.firstNameButton).click().sendKeys(ConfigReader.getProperty("firstname")).sendKeys(Keys.TAB).perform();

    }


    @And("Kullanici Last Name girer.")
    public void kullaniciLastNameGirer() {
        actions.sendKeys(ConfigReader.getProperty("lastname")).sendKeys(Keys.TAB).perform();

    }


    @And("Kullanici SSN girer.")
    public void kullaniciSSNGirer() {
        actions.sendKeys(ConfigReader.getProperty("SSN")).sendKeys(Keys.TAB).perform();
    }

    @And("Kullanici Email adresi girer.")
    public void kullaniciEmailAdresiGirer() {
        actions.sendKeys(ConfigReader.getProperty("email")).sendKeys(Keys.TAB).perform();
    }

    @And("Kullanici Phone number girer.")
    public void kullaniciPhoneNumberGirer() {
        actions.sendKeys(ConfigReader.getProperty("phone")).sendKeys(Keys.TAB).perform();
    }


    @And("Kullanici Send an Appointment Request butonuna tiklar.")
    public void kullaniciSendAnAppointmentRequestButonunaTiklar() {
        mehmetMedunnaPage.sendAnAppointmentRequestButton.click();
    }

    @Then("Kullanici sol ustte Appointment registration saaved! yazisini gorur")
    public void kullaniciSolUstteAppointmentRegistrationSaavedYazisiniGorur() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(mehmetMedunnaPage.successBar.isDisplayed());
    }

    @And("Kullanici sol ust tarafta MY PAGES\\(PATIENT) profilini gorur.")
    public void kullaniciSolUstTaraftaMYPAGESPATIENTProfiliniGorur() {
        assertTrue(mehmetMedunnaPage.myPagesText.isDisplayed());
    }


    @And("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int wait) {


        try {
            Thread.sleep(wait* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @And("Kullanici Medunna sayfasina basarili giris yaptigini dogrular")
    public void kullaniciMedunnaSayfasinaBasariliGirisYaptiginiDogrular() {

        assertTrue(mehmetMedunnaPage.userText.isDisplayed());
    }


    @And("Kullanici Username yazili sekmeye tiklar")
    public void kullaniciUsernameYaziliSekmeyeTiklar() throws InterruptedException {
        Thread.sleep(1000);
        mehmetMedunnaPage.userText.click();
    }

    @And("Kullanici Settings butonuna tiklar")
    public void kullaniciSettingsButonunaTiklar() {
        mehmetMedunnaPage.settingsButton.click();
    }

    @And("Kullanici first name dogrular")
    public void kullaniciFirstNameDogrular() {
        assertTrue(mehmetMedunnaPage.settingsFirstNameTextBox.isDisplayed());

    }

    @And("Kullanici last name dogrular")
    public void kullaniciLastNameDogrular() {
        assertTrue(mehmetMedunnaPage.settingsLastNameTextBox.isDisplayed());

    }

    @And("Kullanici email dogrular")
    public void kullaniciEmailDogrular() {
        assertTrue(mehmetMedunnaPage.settingsEmailTextBox.isDisplayed());
    }

    @And("Kullanici firstname gunceller")
    public void kullaniciFirstnameGunceller() {

        String actualFirstname = mehmetMedunnaPage.settingsFirstNameTextBox.getAttribute("value");
        String expectedFirstname = "Basak1";
        mehmetMedunnaPage.settingsFirstNameTextBox.sendKeys(expectedFirstname);
        assertNotEquals(expectedFirstname,actualFirstname);
    }

    @And("Kullanici Settings saved! yazisin dogrular")
    public void kullaniciSettingsSavedYazisinDogrular() {
        assertTrue(mehmetMedunnaPage.successBar.isDisplayed());

    }

    @And("Kullanici lastname gunceller")
    public void kullaniciLastnameGunceller() {

        String actualLastname = mehmetMedunnaPage.settingsLastNameTextBox.getAttribute("value");
        String expectedLastname = "Polat1";
        mehmetMedunnaPage.settingsLastNameTextBox.sendKeys(expectedLastname);
        assertNotEquals(expectedLastname,actualLastname);

    }

    @And("Kullanici Email gunceller")
    public void kullaniciEmailGunceller() {

        String actualEmailname = mehmetMedunnaPage.settingsEmailTextBox.getAttribute("value");
        String expectedEmailname = "basakdeveci1@hotmail.com";
        mehmetMedunnaPage.settingsEmailTextBox.clear();
        mehmetMedunnaPage.settingsEmailTextBox.sendKeys(expectedEmailname);
        assertNotEquals(expectedEmailname,actualEmailname);
    }

    @And("Kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        mehmetMedunnaPage.settingsSaveButton.click();
    }

    @And("Kullanici  MY PAGES\\(PATIENT) butonuna tiklar")
    public void kullaniciMYPAGESPATIENTButonunaTiklar() {
        mehmetMedunnaPage.myPagesText.click();
    }

    @And("Kullanici  MY PAGES Make an Appointment butonuna tiklar")
    public void kullaniciMYPAGESMakeAnAppointmentButonunaTiklar() throws InterruptedException {
        Thread.sleep(2000);
        mehmetMedunnaPage.userMakeAnAppointmentButton.click();
    }

    @And("Kullanici tarih secer")
    public void kullaniciTarihSecer() {

        mehmetMedunnaPage.phoneTextBox.sendKeys("8734880334");
        mehmetMedunnaPage.appointmentDateTimeTextBox.sendKeys("2022-11-30");

    }

    @And("Kullanici sol ustte Appointment registration saved! yazisini gorur")
    public void kullaniciSolUstteAppointmentRegistrationSavedYazisiniGorur() {

        assertTrue(mehmetMedunnaPage.successBar.isDisplayed());
    }
}
