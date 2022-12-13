package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Basak {
    Actions action = new Actions(Driver.getDriver());
    JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());


    pages.Basak basakPage = new pages.Basak();
    ReusableMethods reusableMethods = new ReusableMethods();


    //US19-TC01
    @And("Item&title basligina tiklar")
    public void ItemTitleBasliginaTiklar() throws InterruptedException {
        basakPage.ItemsTitle.click();
        Thread.sleep(3000);

    }

    @And("Item&title basligidan staff secer")
    public void ItemTitleBasligidanStaffSecer() throws InterruptedException {
        basakPage.staff.click();
        Thread.sleep(3000);

    }

    @And("Create a new Staff butonuna tiklar")
    public void createANewStaffButonunaTiklar() throws InterruptedException {
        basakPage.createANewStaff.click();
        Thread.sleep(3000);
    }

    @And("SSN kutucuguna gecerli SSN yazar")
    public void ssnKutucugunaGecerliSSNYazar() throws InterruptedException {
        basakPage.searchSSNBox.sendKeys("777-11-5555", Keys.ENTER);

        Thread.sleep(3000);
    }

    @And("Use Search kutucugunu secili hale getirir")
    public void useSearchKutucugunuSeciliHaleGetirir() throws InterruptedException {
        basakPage.useSearch.click();
        Thread.sleep(3000);
    }

    @And("Islemin basarilgi olduguna dair User found with search SSN yazisini gorur")
    public void islemBasariliOldugunaDairYaziyiGorur() {
        assertTrue(basakPage.ssnSearchAlert.isDisplayed());

    }

    //US19-TC02

    @Then("First name girer")
    public void first_name_girer() {
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Mevsim").sendKeys(Keys.TAB).sendKeys("Polat").sendKeys(Keys.TAB).
                sendKeys("22.02.2016").sendKeys(Keys.TAB).sendKeys("19:19").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2154896521").sendKeys(Keys.TAB).sendKeys("FEMALE")
                .sendKeys(Keys.TAB).sendKeys("0+").sendKeys(Keys.TAB).sendKeys("Florida").sendKeys(Keys.TAB).sendKeys("Basak").sendKeys(Keys.TAB).
                sendKeys("22.11.2022").sendKeys(Keys.TAB).sendKeys("19:19").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("team51_616").sendKeys(Keys.TAB).sendKeys("USA").sendKeys(Keys.TAB).sendKeys("California").perform();


    }

    @Then("Last name girer")
    public void last_name_girer() {

    }

    @Then("Birthdate girer")
    public void birthdate_girer() {

    }

    @Then("Phone number girer")
    public void phone_number_girer() {

    }

    @Then("Gender girer")
    public void gender_girer() {

    }

    @Then("Blood group girer")
    public void blood_group_girer() {

    }

    @Then("Adress girer")
    public void adress_girer() {

    }

    @Then("Description girer")
    public void description_girer() {

    }

    @Then("Created Date girer")
    public void created_date_girer() {

    }

    @Then("Username girer")
    public void username_girer() {

    }

    @Then("State girer")
    public void state_girer() {

    }

    @Then("Country girer")
    public void country_girer() {

    }

    @Then("Admin save butonuna tiklar")
    public void admin_save_butonuna_tiklar() {
        basakPage.staffSaveButton.click();

    }


    //US19 TC03
    @And("Admin idye tiklayarak kayitli kisilerden kullanici secer")
    public void adminIdyeTiklayarakKayitliKisilerdenKullaniciSecer() {
        basakPage.staffID.click();

    }

    @Then("Admin kayitli kisilerden kullanici sectigini dogrular")
    public void admin_kayitli_kisilerden_kullanici_sectigini_dogrular() {
        assertTrue(basakPage.staffIdDogrulama.isDisplayed());

    }


    //US19 TC04

    @Then("acilan sayfadan ilgili kullanici icin Edite tiklar")
    public void acilan_sayfadan_ilgili_kullanici_icin_edite_tiklar() throws InterruptedException {
        basakPage.staffEdit.click();
    }

    @Then("kullanici bilgilerini duzenler")
    public void kullanici_bilgilerini_duzenler() throws InterruptedException {
        action.moveToElement(basakPage.staffFirstName).doubleClick().perform();
        action.sendKeys("Basak").perform();
        ReusableMethods.jsScrollClick(basakPage.staffEditSave);
        Thread.sleep(1000);

    }


    @And("Admin A Staff is updated with identifier yazisini gorur")
    public void adminAStaffIsUpdatedWithIdentifierYazisiniGorur() throws InterruptedException {
        assertTrue(basakPage.staffEditSuccess.isDisplayed());
    }

    //US19 TC005

    @Then("Admin acilan sayfada Delete butonuna tiklar")
    public void admin_acilan_sayfada_delete_butonuna_tiklar() {
        basakPage.staffDelete.click();

    }

    @Then("Admin Confirm delete operation kutusundan delete butonuna tiklar")
    public void admin_confirm_delete_operation_kutusundan_delete_butonuna_tiklar() throws InterruptedException {
        basakPage.staffConfirmDelete.click();
        Thread.sleep(3000);

    }

    @Then("A staff is deleted with identifier yazisini gorur")
    public void a_staff_is_deleted_with_identifier_yazisini_gorur() {
        assertTrue(basakPage.staffDeleteSuccess.isDisplayed());

    }


    //US20 TC01
    @Then("Administration basligina tiklar")
    public void administration_basligina_tiklar() throws InterruptedException {
        basakPage.administrationButton.click();
        Thread.sleep(1000);
    }

    @Then("Admin User Managementa tiklar")
    public void admin_user_managementa_tiklar() throws InterruptedException {
        basakPage.userManagement.click();


    }

    @Then("Admin View kutucuguna tiklar")
    public void admin_view_kutucuguna_tiklar() throws InterruptedException {
        basakPage.AdminViewButton.click();
        Thread.sleep(2000);


    }

    @Then("Admin kayitli kisilerin first name, Last name, email gibi bilgilerini gorur")
    public void admin_kayitli_kisilerin_first_name_last_name_email_gibi_bilgilerini_gorur() {
        List<WebElement> userList = basakPage.kayitliKisiler;
        List<String> expectedList = new ArrayList<>(
                Arrays.asList("Login", "First name", "Last name", "Email",
                        "Language", "Created by", "Created date", "Modified by", "Modified date", "Profiles"));

        for (int i = 0; i < userList.size(); i++) {
            assertEquals(userList.get(i).getText(), expectedList.get(i));
        }

        for (WebElement user : userList) {
            System.out.println(user.getText());

        }


    }


    //US20 TC02
    @Then("Admin Edite tiklar")
    public void admin_edite_tiklar() {
        basakPage.usersEditButton.click();

    }

    @Then("Activated kutusunu isaretler")
    public void activated_kutusunu_isaretler() {
        basakPage.usersEditActivatedButton.click();

    }

    @Then("Admin Edit kısmından Admin, User, Patient, Staff ve Physician rollerinden birini atayabilir.")
    public void admin_edit_kismindan_admin_user_patient_staff_ve_physician_rollerinden_birini_atayabilir() throws InterruptedException {

        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", basakPage.usersEditRole);
        Thread.sleep(2000);
        action.moveToElement(basakPage.usersEditRole).doubleClick().perform();
        Thread.sleep(2000);
        Select select = new Select(basakPage.usersEditRole);
        select.selectByValue("ROLE_USER");

    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        ReusableMethods.jsScrollClick(basakPage.AdminEditSaveButton);


    }

    @Then("A user is updated with identifier staff yazisini gorur.")
    public void a_user_is_updated_with_identifier_staff_yazisini_gorur() {
        assertTrue(basakPage.adminSaveSuccess.isDisplayed());


    }


    //US20 TC03

    @Then("Admin sectigi kullaniciyi silebilmek icin DELETE butonuna tiklar")
    public void admin_sectigi_kullaniciyi_silebilmek_icin_delete_butonuna_tiklar() throws InterruptedException {
        ReusableMethods.jsScrollClick(basakPage.adminSonSayfa);
        Thread.sleep(2000);
        ReusableMethods.jsScrollClick(basakPage.adminDeleteButton);
        Thread.sleep(2000);
        action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);

    }

    @Then("A user is deleted with identifier yazisini gorur.")
    public void a_user_is_deleted_with_identifier_yazisini_gorur() {
        assertTrue(basakPage.adminDeleteSuccess.isDisplayed());

    }

    //US21TC01
    @Then("My Pages basligina tiklar")
    public void my_pages_basligina_tiklar() {
        basakPage.staffMyPages.click();


    }

    @Then("Staff My Pages basligi altinda Search Patienta tiklar")
    public void staff_my_pages_basligi_altinda_search_patienta_tiklar() {
        basakPage.staffSearchPatient.click();

    }

    @Then("Admin sectigi kullanicinin randevularini guncelleyebilmek icin Show Appointments butonuna tiklar")
    public void admin_sectigi_kullanicinin_randevularini_guncelleyebilmek_icin_show_appointments_butonuna_tiklar() {
        basakPage.staffShowAppointments.click();

    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        basakPage.staffEditButton.click();

    }

    @Then("Admin randevu bilgilerini tarih, status, doktor gunceller")
    public void admin_randevu_bilgilerini_tarih_status_doktor_gunceller() throws InterruptedException {
        basakPage.staffStartDate.click();
        action.sendKeys("22.02.2016").sendKeys(Keys.TAB).sendKeys("19:19").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("22.03.2016").sendKeys(Keys.TAB).sendKeys("19:19").perform();
        Select select = new Select(basakPage.staffStatus);
        select.selectByValue("PENDING");
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", basakPage.staffPhysician);
        Select select1 = new Select(basakPage.staffPhysician);
        select1.selectByValue("276299");

    }

    @Then("Save Butonuna tiklar")
    public void save_butonuna_tiklar() throws InterruptedException {
        ReusableMethods.jsScrollClick(basakPage.staffSaveButton2);
        Thread.sleep(1000);

    }

    @Then("The appointment is updated with identifier uyarisini gorur")
    public void the_appointment_is_updated_with_identifier_uyarisini_gorur() {
        assertTrue(basakPage.staffEditSuccessAlert.isDisplayed());

    }


    //US21TC02
    @Then("Staff Status'e tiklar")
    public void staff_status_e_tiklar() throws InterruptedException {
        Thread.sleep(1000);
        /*
        List <String> statuslist = new ArrayList<>();
        for (WebElement w: basakPage.StaffStatus) {
            statuslist.add(w.getText());
        }
        */


    }

    @Then("Staff hasta statusunun unapproved secilebildigini gorur")
    public void staff_hasta_statusunun_unapproved_secilebildigini_gorur() throws InterruptedException {
        String expectedData="UNAPPROVED";
        String actualData="UNAPPROVED";
        action.moveToElement( basakPage.staffStatus).click().sendKeys(expectedData).click().perform();
        assertEquals(expectedData,actualData);
        Thread.sleep(3000);

    }
    @Then("Staff hasta statusunun pending secilebildigini gorur")
    public void staff_hasta_statusunun_pending_secilebildigini_gorur() throws InterruptedException {
        String expectedData="PENDING";
        String actualData="PENDING";
        action.moveToElement( basakPage.staffStatus).click().sendKeys(expectedData).click().perform();
        assertEquals(expectedData,actualData);
        Thread.sleep(3000);

    }
    @Then("Staff hasta statusunun cancelled secilebildigini gorur")
    public void staff_hasta_statusunun_cancelled_secilebildigini_gorur() throws InterruptedException {
        String expectedData="CANCELLED";
        String actualData="CANCELLED";
        action.moveToElement( basakPage.staffStatus).click().sendKeys(expectedData).click().perform();
        assertEquals(expectedData,actualData);
        Thread.sleep(3000);


    }
    @Then("Staff hasta statusunun Completed secilemedigini gorur.")
    public void staff_hasta_statusunun_completed_secilemedigini_gorur() throws InterruptedException {
        String expectedData="COMPLETED";
        String actualData="CANCELLED";
        action.moveToElement( basakPage.staffStatus).click().sendKeys(expectedData).click().perform();
        assertNotEquals(expectedData,actualData);
        Thread.sleep(3000);

    }





    //US21TC03
    @Then("Staff Anemnesis,Treatment veya Diagnosis kisimlarina data girer")
    public void staff_anemnesis_treatment_veya_diagnosis_kisimlarina_data_girer() {
        String actualAnemnesis=basakPage.staffAnemnesis.getText();
        String actualTreatment=basakPage.staffTreatment.getText();
        String actualDiagnosis=basakPage.staffDiagnosis.getText();


        ReusableMethods.jsScrollClick(basakPage.staffAnemnesis);
        action.sendKeys("d").sendKeys(Keys.TAB).sendKeys("e").
                sendKeys(Keys.TAB).sendKeys("f").perform();



        String expectedAnemnesis=basakPage.staffAnemnesis.getText();
        String expectedTreatment= basakPage.staffTreatment.getText();
        String expectedDiagnosis= basakPage.staffDiagnosis.getText();

        assertNotEquals(actualAnemnesis,expectedAnemnesis);
        assertNotEquals(actualTreatment,expectedTreatment);
        assertNotEquals(actualDiagnosis,expectedDiagnosis);

    }

    @Then("Staff Data girilemedigine dair yaziyi gorur")
    public void staff_data_girilemedigine_dair_yaziyi_gorur() {


    }


    //US21TC04
    @And("Admin doktor bilgilerini gunceller")
    public void adminDoktorBilgileriniGunceller() {
        jsexecutor.executeScript("arguments[0].scrollIntoView(true);", basakPage.staffPhysician);
        Select select1 = new Select(basakPage.staffPhysician);
        select1.selectByValue("178694");
    }


    //US19TC001
    @And("Gerekli bilgileri doldurur")
    public void gerekliBilgileriDoldurur() throws InterruptedException {
        basakPage.staffPhoneNumber.sendKeys("8326772336");
        Thread.sleep(3000);

    }



}
