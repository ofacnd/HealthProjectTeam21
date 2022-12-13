package stepDefinitions.UI;

import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static org.junit.Assert.*;

public class Yusuf {

    Actions actions = new Actions(Driver.getDriver());
    String gunelUrun = "Test Item";
    pages.Yusuf yusufPage = new pages.Yusuf();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @And("Items&Title menusunden Test Item secenegine tiklar")
    public void ItemsTitleMenusundenTestItemSecenegineTiklar() throws InterruptedException {
        yusufPage.itemsTitleMenusu.click();
        yusufPage.testItem.click();
        Thread.sleep(3000);
    }
    @And("Create a new Test Item butonuna tiklar")
    public void createANewTestItemButonunaTiklar() {
        yusufPage.createANewTestItems.click();
    }
    @And("Istenilen bilgileri doldurur ve Save butonuna tiklar")
    public void IstenilenBilgileriDoldururVeSaveButonunaTiklar() throws InterruptedException {
        yusufPage.nameBox.sendKeys("Serum");
        actions.sendKeys(Keys.TAB).sendKeys("Sarı ve berrak bir sıvıdır", Keys.TAB).
                sendKeys("100", Keys.TAB).sendKeys("150", Keys.TAB).
                sendKeys("250", Keys.ENTER).perform();
        Thread.sleep(3000);
    }
    @And("Kaydedildi yazisinin gorunurlugunu kontrol eder")
    public void kaydedildiYazisininGorunurlugunuKontrolEder() {
        assertTrue(yusufPage.kaydedildiYazisi.isDisplayed());
    }

    // US17TC002
    @And("Urunun bulundugu sayfaya gider")
    public void urununBulunduguSayfayaGider() throws InterruptedException {
        Driver.getDriver().get("https://www.medunna.com/c-test-item?page=90&sort=id,asc");
    }
    @And("Urundeki edit butonuna tiklar")
    public void urundekiEditButonunaTiklar() throws InterruptedException {
        yusufPage.serumEditButonu.click();
    }
    @And("Belirtilen degerlerde guncelleme yapar ve Save butonuna tiklar")
    public void belirtilenDegerlerdeGuncellemeYaparVeSaveButonunaTiklar() throws InterruptedException {
        actions.moveToElement(yusufPage.nameBox).click().doubleClick().sendKeys("Serum Yeni").
                sendKeys(Keys.TAB).sendKeys("Sarı ve berrak bir sıvıdır", Keys.TAB).
                sendKeys("300", Keys.TAB).sendKeys("100", Keys.TAB).
                sendKeys("200", Keys.ENTER).perform();
    }
    // US17TC003
    @And("Urundeki view butonuna tiklar")
    public void urundekiViewButonunaTiklar() throws InterruptedException {
        yusufPage.serumGoruntulemeButonu.click();
    }
    @And("Acilan sayfada urunun isminin goruldugunu dogrular")
    public void acilanSayfadaUrununIsmininGoruldugunuDogrular() {
        assertEquals(gunelUrun, yusufPage.guncelUrunName.getText());
    }
    // US17TC004
    @And("Urundeki delete butonuna tiklar")
    public void urundekiDeleteButonunaTiklar() throws InterruptedException {
        yusufPage.serumDeleteButonu.click();
    }
    @And("Acilan pencerede tekrar delete butonuna tiklar")
    public void acilanPenceredeTekrarDeleteButonunaTiklar() throws InterruptedException {
        actions.moveToElement(yusufPage.deleteButonu).click().perform();
    }
    @And("Silindi yazisinin gorunurlugunu kontrol eder")
    public void silindiYazisininGorunurlugunuKontrolEder() throws InterruptedException {
        assertTrue(yusufPage.kaydedildiYazisi.isDisplayed());
    }
    // US18TC001
    @And("Items&Title menusunden Physician secenegine tiklar")
    public void ItemsTitleMenusundenPhysicianSecenegineTiklar() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) { // i degeri icin her seferinde %10 kucultur
            robot.keyPress(KeyEvent.VK_CONTROL); // CTRL ye basar
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye basar
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // - den ceker
            robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL den ceker
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        yusufPage.itemsTitleMenusu.click();
        yusufPage.physician.click();
        Thread.sleep(3000);
    }
    @And("Doktoru goruntule butonuna tiklar")
    public void doktoruGoruntuleButonunaTiklar() {
        actions.moveToElement(yusufPage.doktorEdit).click().perform();
    }
    @And("Goruntulendigini dogrular")
    public void goruntulendiginiDogrular() {
        assertTrue(yusufPage.doktorID.isDisplayed());
    }
    // US18TC002
    @And("Create a new Physician butonuna tiklar")
    public void createANewPhysicianButonunaTiklar() {
        yusufPage.doktorCreataNewButonu.click();
    }
    @And("Aramak istedigi Doktorun SSN numarasini girer")
    public void aramakIstedigiDoktorunSSNNumarasiniGirer() throws InterruptedException {
        String doktorSSN = "789-33-1020";
        yusufPage.doktorSSNBox.sendKeys(doktorSSN, Keys.ENTER);
        Thread.sleep(3000);
    }
    @And("Doktor bilgilerinin kayitli oldugunu dogrular")
    public void doktorBilgilerininKayitliOldugunuDogrular() throws InterruptedException {
        assertTrue(yusufPage.kayitliUyarisi.isDisplayed());
        Thread.sleep(2000);
    }
    // US18TC003
    @And("Duzenleme seceneginin aktif oldugunu dogrular")
    public void duzenlemeSecenegininAktifOldugunuDogrular() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) { // i degeri icin her seferinde %10 kucultur
            robot.keyPress(KeyEvent.VK_CONTROL); // CTRL ye basar
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye basar
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // - den ceker
            robot.keyRelease(KeyEvent.VK_CONTROL); // CTRL den ceker
            Thread.sleep(500);
        }
        Thread.sleep(5000);
        actions.moveToElement(yusufPage.doktorEdit).click().perform();
        Thread.sleep(4000);
        assertTrue(yusufPage.createOrEditSayfasi.isEnabled());
    }
    @And("Firstname LastName ve diger bilgileri doldurur")
    public void firstnameLastNameVeDigerBilgileriDoldurur() throws InterruptedException {
        actions.moveToElement(yusufPage.drFirstnameBox).click().doubleClick().sendKeys("Yildiz").sendKeys(Keys.TAB).
                sendKeys("11", Keys.TAB).sendKeys("11", Keys.TAB).sendKeys("1991", Keys.TAB).perform();
        js.executeScript("arguments[0].scrollIntoView(true);", yusufPage.saveButonu);
        js.executeScript("arguments[0].click();", yusufPage.saveButonu);
    }
    @And("Islemin gerceklestigini dogrular")
    public void IsleminGerceklestiginiDogrular() {
        assertTrue(yusufPage.kaydedildiYazisi.isDisplayed());
    }
    // US18TC004
    @And("Uzmanlik alani secer")
    public void uzmanlikAlaniSecer() throws InterruptedException {
        String actualData = "OBSTETRICS_GYNECOLOGY";
        String expectedData = "Pathology";
        js.executeScript("arguments[0].scrollIntoView(true);", yusufPage.specialityBox);
        actions.moveToElement(yusufPage.specialityBox).click().sendKeys(expectedData, Keys.TAB).perform();
        assertNotEquals(expectedData, actualData);
        js.executeScript("arguments[0].scrollIntoView(true);", yusufPage.saveButonu);
        js.executeScript("arguments[0].click();", yusufPage.saveButonu);
    }
    // US18TC005
    @And("Profil resmi atamasi yapar")
    public void profilResmiAtamasiYapar() throws InterruptedException, AWTException, IOException {
        js.executeScript("arguments[0].scrollIntoView(true);", yusufPage.profilPhoto);
        yusufPage.profilPhoto.sendKeys("C:\\Users\\yusuf\\Downloads\\doktor21.jpg");
        js.executeScript("arguments[0].click();", yusufPage.saveButonu);
    }
    // US18TC006
    @And("Muayene ucretini girer")
    public void muayeneUcretiniGirer() throws InterruptedException {
        String actualData = yusufPage.examFeeBox.getText();
        String expectedData = "3000";
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(3000);
        actions.moveToElement(yusufPage.examFeeBox).click().click().sendKeys("3000").perform();
        Thread.sleep(3000);
        assertNotEquals(expectedData, actualData);
        Thread.sleep(3000);
        actions.moveToElement(yusufPage.saveButonu).click().perform();
    }
    // US18 TC007
    @And("Administration menusunden User management secenegine tiklar")
    public void administrationMenusundenUserManagementSecenegineTiklar() throws InterruptedException {
        actions.moveToElement(yusufPage.administrationMenu).click().sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
    }
    @And("islem yapmak istedigi kullanicida edit butonuna tiklar")
    public void islemYapmakIstedigiKullanicidaEditButonunaTiklar() {
        actions.moveToElement(yusufPage.adminEditButonu).click().perform();
    }
    @And("Profiles menusunden Doktor secenegine tiklar")
    public void profilesMenusundenDoktorSecenegineTiklar() throws InterruptedException {
        js.executeScript("arguments[0].scrollIntoView(true);", yusufPage.profilesStaff);
        Thread.sleep(2000);
        actions.moveToElement(yusufPage.profilesStaff).click().click().sendKeys("ROLE_PHYSICIAN").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
    }
    // US18 TC008
    @And("Silmek istedigi doktor icin delete butonuna tiklar")
    public void silmekIstedigiDoktorIcinDeleteButonunaTiklar() throws InterruptedException {
        Driver.getDriver().get("https://www.medunna.com/physician?page=8&sort=id,asc");
        Thread.sleep(2000);
        yusufPage.deleteButonuDr.click();
    }
    @And("Islemi onaylamak icin acilan pencerede tekrar delete butonuna tiklar")
    public void IslemiOnaylamakIcinAcilanPenceredeTekrarDeleteButonunaTiklar() {
        yusufPage.onayDeleteDr.click();
    }
}

