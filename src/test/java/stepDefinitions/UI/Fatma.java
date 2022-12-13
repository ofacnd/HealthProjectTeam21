package stepDefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;


import static org.junit.Assert.*;

public class Fatma {
    String roomNo;
    String tarih;



    Actions actions = new Actions(Driver.getDriver());
    pages.Fatma fatmaPage=new pages.Fatma();
    ReusableMethods reusableMethod=new ReusableMethods();
    Faker faker=new Faker();

    JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());

    @Then("items&titles select bolumu tiklar")
    public void itemsTitlesSelectBolumuTiklar() {
        fatmaPage.itemsTitles.click();

    }

    @Then("Admin patient butonuna tiklar")
    public void adminPatientButonunaTiklar() throws InterruptedException {
        fatmaPage.patientButonu.click();


    }

    @Then("Create a new patient butonuna tiklar")
    public void createANewPatientButonunaTiklar() {
        fatmaPage.createANewPatientButonu.click();
    }
    //@US15TC01
    @And("First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User," +
            " Country and state  City gibi hasta bilgilerini doldurur")
    public void firstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityGibiHastaBilgileriniDoldurur() throws InterruptedException {

        fatmaPage.newPatientFirstName.click();
        actions.sendKeys("MevsimLisa").
                sendKeys(Keys.TAB).sendKeys("deveci").
                sendKeys(Keys.TAB).sendKeys("1980")
                .sendKeys(fatmaPage.newPatientEmail).sendKeys("lisadev@gmail.com").sendKeys(Keys.TAB)
                .sendKeys("2215551312").sendKeys(Keys.TAB).sendKeys("FEMALE").sendKeys(Keys.TAB).sendKeys("A+")
                .sendKeys(Keys.TAB).sendKeys("fatmaAdressss").sendKeys(Keys.TAB).sendKeys("ACIKLAMAaa").
                sendKeys(Keys.TAB).sendKeys("fatmaaa").sendKeys(Keys.TAB).
                sendKeys("USA").perform();


        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", fatmaPage.newPatientCity);
        Select select=new Select(fatmaPage.newPatientCity);
        select.selectByValue("43522");
        reusableMethod.jsScrollClick(fatmaPage.newPatientSaveButonu);
        assertTrue(fatmaPage.newPatientSuccess.isDisplayed());

    }
    //@US15TC02
    @And("Admin ilgili hastanin view butonuna tiklar")
    public void adminIlgiliHastaninViewButonunaTiklar() {
        fatmaPage.newPatientView.click();

    }


    //@US15TC03
    @And("Admin ilgili hastanin Edit butonuna tiklar")
    public void patientSayfasindakiIlgiliHastaninEditButonunaTiklar() throws InterruptedException {
        fatmaPage.newPatientEdit.click();


    }

    @Then("Patient sayfasindaki Save butonuna tiklar")
    public void patientSaveButonunaTiklar() {

        reusableMethod.jsScrollClick(fatmaPage.newPatientSaveButonu);
    }


    @And("SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group,Address, Description, Created Date,")
    public void ssnFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDate() {
        for (WebElement w:fatmaPage.dogrulamaList) {
            Assert.assertTrue(w.isDisplayed());

        }

    }




    @And("Admin ilgili alanları gunceller")
    public void adminIlgiliAlanlariGunceller() throws InterruptedException {
        actions.moveToElement(fatmaPage.createPatientEditFirstName)
                .doubleClick().sendKeys("zehra",Keys.TAB).
                sendKeys("as",Keys.TAB).sendKeys("2000-11-11",Keys.TAB).sendKeys("10:40",Keys.TAB)
                .sendKeys("senee@gmail.com",Keys.TAB).sendKeys("1234567890",Keys.TAB)
                .sendKeys("FEMALE",Keys.TAB).sendKeys("B+",Keys.TAB)
                .sendKeys("Adresssss",Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("Turkiyem",Keys.TAB).perform();
        Thread.sleep(3000);
        actions.sendKeys("Ankara",Keys.TAB)
                .sendKeys(Keys.TAB).perform();

    }

    @And("Admin patient sayfasindaki Save butonuna tiklar")
    public void patientSayfasindakiEdittenSonraSaveButonunaTiklar() throws InterruptedException {
        Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);
    }

    @And("Admin guncellendigine dair patient is updated with identifier yazisinin cittigini gorur.")
    public void adminGuncellendigineDairPatientIsUpdatedWithIdentifierYazisininCiktiginiGorur() {
        assertTrue(fatmaPage.newPatientUpdated.isDisplayed());
    }

    @And("Admin appointmeni  butonuna tiklar")
    public void adminAppointmeniButonunaTiklar() {
        fatmaPage.AppointmentButonu.click();
    }

    @And("Admin appointment sayfasindaki edit butonuna tiklar")
    public void adminAppointmentSayfasindakiEditButonunaTiklar() throws InterruptedException {

        fatmaPage.newPatientEdit.click();

    }

    @And("physician boxe tan doktor secer")
    public void physicianBoxeTanDoktorSecer() throws InterruptedException {
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", fatmaPage.AppointmentPhysicianButonu);
        Select select=new Select(fatmaPage.AppointmentPhysicianButonu);
        Thread.sleep(3000);
        select.selectByValue("214529");


    }


    @And("Admin guncellendigine dair The appointment is updated with identifier yazisini gorur.")
    public void adminGuncellendigineDairTheAppointmentIsUpdatedWithIdentifierYazisiniGorur() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(fatmaPage.appointmenttUpdated.isDisplayed());

    }

    @And("Country and state  City gibi hasta bilgileri girilmesi zorunludur")
    public void countryAndStateCityGibiHastaBilgileriGirilmesiZorunludur() {
        fatmaPage.newPatientCountry.sendKeys("USA");
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", fatmaPage.newPatientCity);
        Select select=new Select(fatmaPage.newPatientCity);
        select.selectByValue("43522");


    }

    @And("Administration select bolumu tiklar")
    public void administrationSelectBolumuTiklar() {
        fatmaPage.administrationSelectBolumu.click();


    }

    @And("Admin User management butonuna tiklar")
    public void adminUserManagementButonunaTiklar() {
        fatmaPage.UserManagementButonu.click();
    }

    @And("herhangi bir hastanin delete butonuna tiklar")
    public void herhangiBirHastaninDeleteButonunaTiklar() throws InterruptedException {
        reusableMethod.jsScrollClick(fatmaPage.sayfasonunaGider);
        reusableMethod.waitFor(3);
        fatmaPage.herhangiBirHastaninDeleteButonu.click();
        Thread.sleep(1000);
    }



    @And("acilan boxta Delete butonuna tiklar")
    public void acilanBoxtaDeleteButonunaTiklar() throws InterruptedException {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("A patient is deleted with idenfier yazisinin ciktigini dogrular.")
    public void aPatientIsDeletedWithIdenfierYazisininCiktiginiDogrular() throws InterruptedException {

        Thread.sleep(3000);
        fatmaPage.deleteSaveSuccess.click();
    }

    @And("Admin room butonuna tiklar")
    public void adminRoomButonunaTiklar() {
        fatmaPage.roomButonu.click();
    }

    @And("Create a new room butonuna tiklar")
    public void createANewRoomButonunaTiklar() {
        fatmaPage.createANewRoomButonu.click();
    }

    @And("Acilan sayfada gerekli bilgileri doldudurur")
    public void acilanSayfadaGerekliBilgileriDoldudurur() throws InterruptedException {
        actions.moveToElement(fatmaPage.roomKutusu).click().perform();
        Thread.sleep(3000);

        roomNo = faker.number().digits(5);
        fatmaPage.roomKutusu.sendKeys(  roomNo+Keys.TAB);
        actions.sendKeys("SUITE", Keys.TAB).perform();



        Thread.sleep(2000);
        actions.moveToElement(fatmaPage.statusButonunu).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(fatmaPage.priceBox).click().sendKeys("100", Keys.TAB)
                .perform();


    }


    @And("Create a Room sayfasindaki Save butonuna tiklar")
    public void createARoomSayfasindakiSaveButonunaTiklar() throws InterruptedException {
        String actualData="";
        String expectedData=fatmaPage.descriptionInputBox.getAttribute("value");
        System.out.println("actualData = " + actualData);
        System.out.println("expectedData = " + expectedData);
        assertEquals(actualData,expectedData);
        Thread.sleep(3000);
        reusableMethod.jsScrollClick(fatmaPage.newPatientSaveButonu);

    }

    @And("islemin gerceklestigine dair cıkan A new room is created with identifier yazisini gorur")
    public void isleminGerceklestigineDairCikanANewRoomIsCreatedWithIdentifierYazisiniGorur() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(fatmaPage.aNewRoomIsCreatedWithIdentiferYazisi.isDisplayed());
    }

    @And("Yonetici Status butonunun tiklanabilir oldugunu gorur.")
    public void yoneticiStatusButonununTiklanabilirOldugunuGorur() throws InterruptedException {
        Thread.sleep(2000);
        actions.moveToElement(fatmaPage.statusButonunu).click().perform();

    }

    @And("admin price box'i tiklar ve price girisi yapilabilir oldugunu gorur.")
    public void adminPriceBoxITiklarVePriceGirisiYapilabilirOldugunuGorur() throws InterruptedException {
        actions.moveToElement(fatmaPage.priceBox).click().sendKeys("100").perform();
        Thread.sleep(3000);
        assertTrue(fatmaPage.priceBox.isDisplayed());

    }


    @And("Admin Description butonuna tiklanmadiginin hata vermedigini gorur.")
    public void adminDescriptionButonunaTiklanmadigininHataVermediginiGorur() {
        Object dogrula=fatmaPage.descriptionInputBox;
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.DOWN).perform();
        assertEquals(dogrula,"");


    }

    @And("tarih datasi girilir")
    public void tarihDatasiGirilir() {


        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.TAB)
                .sendKeys("2000",Keys.TAB)
                .sendKeys("10",Keys.TAB)
                .sendKeys("10",Keys.TAB)
                .perform();
        tarih=fatmaPage.tarihButonu.getAttribute("value");
        System.out.println("tarih = " + tarih);


    }




    @And("Room type tiklar")
    public void roomTypeTiklar() {
        reusableMethod.waitFor(3);
        fatmaPage.roomType1.click();
        reusableMethod.waitFor(4);



    }

    @And("Room type lerinin ayni oldugunu gorur.")
    public void roomTypeLerininAyniOldugunuGorur() {
        String actualData=fatmaPage.roomTypelarinAyniOlmasi.get(0).getText();
        reusableMethod.waitFor(3);

        for (WebElement w:fatmaPage.roomTypelarinAyniOlmasi ) {
            assertEquals(actualData,w.getText());

        }


    }



    @And("Room kutusuna tiklar ve oda degisikli yapar")
    public void roomKutusunaTiklarVeOdaDegisikliYapar() throws InterruptedException {

        actions.moveToElement(fatmaPage.roomNumber).doubleClick().perform();

        roomNo = faker.number().digits(5);
        fatmaPage.roomNumber.sendKeys(  roomNo+Keys.TAB);




    }

    @And("Create or edit sayfasindaki Save butonuna tiklar")
    public void createOrEditSayfasindakiSaveButonunaTiklar() {
        reusableMethod.jsScrollClick(fatmaPage.createARoomSayfasindakiSaveButonu);

    }

    @And("Oda turunun degistigine dair cikan yesil uyariyi gorur.")
    public void odaTurununDegistigineDairCikanYesilUyariyiGorur() {
        fatmaPage.ARoomIsUpdateddWithIdentifierYazisi.isDisplayed();
    }

    @And("admin ilgili odanin delete butonunu tklari")
    public void adminIlgiliOdaninDeleteButonunuTklari() {
        fatmaPage.roomDeleteButonu.click();
    }

    @And("admin confirm delete operation box'ta delete tiklar")
    public void adminConfirmDeleteOperationBoxTaDeleteTiklar() throws InterruptedException {
        Thread.sleep(1000);
        fatmaPage.roomConfirmDelete.click();

    }

    @And("Admin delete isleminin gerceklestigine dair A room is deleted with identifier yazisinin ciktigini gorur.")
    public void adminDeleteIslemininGerceklestigineDairARoomIsDeletedWithIdentifierYazisininCiktiginiGorur() {
        fatmaPage.succesBar.click();
    }

    @And("Description bolumune veri girilmeden kayit yapilabildigini dogrular")
    public void descriptionBolumuneVeriGirilmedenKayitYapilabildiginiDogrular() throws InterruptedException {
        assertTrue(fatmaPage.succesBar.isDisplayed());
    }

    @And("Tarihin degismedigi dogrulanir")
    public void tarihinDegismedigiDogrulanir() {
        reusableMethod.jsScrollClick(fatmaPage.sayfasonunaGider);
        reusableMethod.waitFor(3);


        for (int i = 0; i < fatmaPage.odalist.size(); i++) {
            if (fatmaPage.odalist.get(i).getText().equals(roomNo)) {
                String date = fatmaPage.tarihList.get(i).getText();
                assertNotEquals(tarih, date);
                System.out.println("date = " + date);
            }

        }


    }

    @And("Admin son sayfaya gider")
    public void adminSonSayfayaGider() {

        reusableMethod.jsScrollClick(fatmaPage.sayfasonunaGider);
        reusableMethod.waitFor(3);
    }

    @Then("A new patient is created with identifier yazisinin ciktigini gorur")
    public void aNewPatientIsCreatedWithIdentifierYazisininCiktiginiGorur() {
        fatmaPage.aPatientIsCreatedWithIdenfierYazi.isDisplayed();

    }

    @And("User, Country and state  City gibi hasta bilgilerini gordugunu dogrular.")
    public void userCountryAndStateCityGibiHastaBilgileriniGordugunuDogrular() {

    }

    @And("Room sayfasindaki edit Butonunu tiklar")
    public void roomSayfasindakiEditButonunuTiklar() {
        fatmaPage.roomEditButonu.click();

    }
}
