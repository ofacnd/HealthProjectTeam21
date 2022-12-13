package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.io.IOException;

public class Hatice {
    pages.Hatice haticePage = new pages.Hatice();


    @And("My Pages butonuna tiklar")
    public void myPagesButonunaTiklar() {
        haticePage.myPages.click();
    }

    @When("Make An Appointment'e tiklar")
    public void makeAnAppointmentETiklar() {
        haticePage.makeAnAppointment.click();
    }

    @Then("Hasta Firstname yazar bos birakilamadigini dogrular")
    public void hastaFirstnameYazarBosBirakilamadiginiDogrular() {

        haticePage.sil(haticePage.hastaFirstName);
        haticePage.sendAnAppointmentRequest.click();
        Assert.assertTrue(haticePage.hastaFirstNameRequired.isDisplayed());

    }

    @And("Hasta Lastname yazar bos birakilamadigini dogrular")
    public void hastaLastnameYazarBosBirakilamadiginiDogrular() {

        haticePage.sil(haticePage.hastaLastName);
        haticePage.sendAnAppointmentRequest.click();
        Assert.assertTrue(haticePage.hastaLastNameRequired.isDisplayed());
    }

    @And("Hasta SSN yazar bos birakilamadigini dogrular")
    public void hastaSSNYazarBosBirakilamadiginiDogrular() {

        haticePage.sil(haticePage.hastaSsn);
        ReusableMethods.jsScrollClick(haticePage.sendAnAppointmentRequest);
        Assert.assertTrue(haticePage.hastaSsnRequired.isDisplayed());

    }

    @And("Hasta Email yazar bos birakilamadigini dogrular")
    public void hastaEmailYazarBosBirakilamadiginiDogrular() {

        haticePage.sil(haticePage.hastaEmail);
        haticePage.sendAnAppointmentRequest.click();
        Assert.assertTrue(haticePage.hastaEmailRequired.isDisplayed());
    }

    @And("Hasta Phone yazar bos birakilamadigini dogrular telefon numarasi ucuncu ve altinci rakamdan sonra - icermeli")
    public void hastaPhoneYazarBosBirakilamadiginiDogrularTelefonNumarasiUcuncuVeAltinciRakamdanSonraIcermeli() {
        ReusableMethods.jsScrollClick(haticePage.sendAnAppointmentRequest);
        Assert.assertTrue(haticePage.hastaPhoneRequiredOrInvalid.isDisplayed());

        haticePage.hastaPhone.sendKeys(ConfigReader.getProperty("hastaPhone"));
        haticePage.sendAnAppointmentRequest.click();

        String hataMesaji = "";

        try {
            if (haticePage.hastaPhoneRequiredOrInvalid.isDisplayed()) {
                hataMesaji = "hata mesaji algilandi";
            }

        } catch (NoSuchElementException exception) {

            hataMesaji = "hata mesaji algilanamadi";
        }

        Assert.assertEquals("hata mesaji algilandi", hataMesaji);
    }


    @When("My Appointments'e tiklar")
    public void myAppointmentsETiklar() {
        haticePage.myAppointments.click();
    }

    @Then("Hasta randevularinin kaydedildigini dogrular")
    public void hastaRandevularininKaydedildiginiDogrular() {

        Assert.assertTrue(haticePage.appointmentListesi.isDisplayed());
    }

    @Then("Yazili olan tarihin gun-ay-yil seklinde oldugunu dogrular")
    public void yaziliOlanTarihinGunAyYilSeklindeOldugunuDogrular() throws InterruptedException, IOException {

        // System.out.println(haticePage.appointmentDate.getText());
        haticePage.appointmentDate.clear();
        ReusableMethods.getScreenshotWebElement("tarih formati", haticePage.appointmentDate);


    }

    @And("Gecerli tarih girilmesi gerektigini dogrular")
    public void gecerliTarihGirilmesiGerektiginiDogrular() {
        haticePage.sendAnAppointmentRequest.click();
        ReusableMethods.waitForVisibility(haticePage.randevuSaved, 3000);
        Assert.assertTrue(haticePage.randevuSaved.isDisplayed());


    }

    @Then("Gecmis tarih girilemedigini dogrular")
    public void gecmisTarihGirilemediginiDogrular() {
        haticePage.appointmentDate.sendKeys(ConfigReader.getProperty("hastaGecmisRandevuTarihi"));
        Assert.assertTrue(haticePage.pastDate.isDisplayed());
    }


    @Then("Kullanici Concact butonunun tiklanabildigini kontrol eder")
    public void kullaniciConcactButonununTiklanabildiginiKontrolEder() {
        Assert.assertTrue(haticePage.contactButton.isEnabled());
    }

    @When("Kullanici Concact butonuna tiklar")
    public void kullaniciConcactButonunaTiklar() {
        haticePage.contactButton.click();
    }

    @When("Contact name'ini girer")
    public void contactNameIniGirer() {
        haticePage.contactName.sendKeys(ConfigReader.getProperty("contactName"));

    }

    @And("Contact email'ini girer")
    public void contactEmailIniGirer() {
        haticePage.contactEmail.sendKeys(ConfigReader.getProperty("contactEmail"));
    }

    @And("Contact subject'ini girer")
    public void contactSubjectIniGirer() {
        haticePage.contactSubject.sendKeys(ConfigReader.getProperty("contactSubject"));
    }

    @And("Contact mesaj'ini girer")
    public void contactMesajIniGirer() {
        haticePage.contactMessage.sendKeys(ConfigReader.getProperty("contactMessage"));
    }

    @Then("Mesajin gonderildigini dogrular")
    public void mesajinGonderildiginiDogrular() {
        ReusableMethods.jsScrollClick(haticePage.sendButton);
        ReusableMethods.waitForVisibility(haticePage.sendMessage, 3000);
        Assert.assertTrue(haticePage.sendMessage.isDisplayed());
    }


    @Then("Hasta phone yazar")
    public void hastaPhoneYazar() {
        haticePage.hastaPhone.sendKeys(ConfigReader.getProperty("hastaPhone"));
    }
}
