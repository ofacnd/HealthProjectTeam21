package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Mine {
    Actions actions = new Actions(Driver.getDriver());
    pages.Mine medunnam = new pages.Mine();

    @Given("Kullanici Staff www.medunna.com adresine gider")
    public void kullanici_staff_www_medunna_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Then("Kullanici staff giris yap simgesine ve acilan menude Sign-in secenegine tiklar")
    public void kullanici_staff_giris_yap_simgesine_ve_acilan_menude_sign_in_secenegine_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.simge.click();
        medunnam.sign.click();
    }

    @Then("Kullanici Staff gecerli bir Username girer")
    public void kullanici_staff_gecerli_bir_username_girer() {
        medunnam.userBox.sendKeys(ConfigReader.getProperty("StaffUsername"));

    }

    @Then("Kulanici Staff gecerli bir password girer")
    public void kulanici_staff_gecerli_bir_password_girer() {
        ReusableMethods.waitFor(2);
        medunnam.paswordBox.sendKeys(ConfigReader.getProperty("StaffPassword"));

    }

    @Then("Kullanici Staff Sign in butonuna tiklar")
    public void kullanici_staff_sign_in_butonuna_tiklar() {
        medunnam.singButonu.click();
        ReusableMethods.waitFor(2);

    }

    @Then("Kullanici Staff MyPages butonuna tiklar")
    public void kullanici_staff_my_pages_butonuna_tiklar() {
        medunnam.mypages.click();

    }

    @Then("Kullanici Staff Search Patient a tiklar Patients sayfasina gelir")
    public void kullanici_staff_search_patient_a_tiklar_patients_sayfasina_gelir() {
        ReusableMethods.waitFor(3);
        medunnam.searchpatient.click();

    }

    @Then("Kullanici Staff Patient SSN id numarasi ile arama yapabildigini dogrular")
    public void kullanici_staff_patient_ssn_id_numarasi_ile_arama_yapabildigini_dogrular() throws IOException {
        ReusableMethods.waitFor(4);
        medunnam.ssnbox.sendKeys("715-15-1516" + Keys.ENTER);
        String arananSSN = "715-15-1516";
        ReusableMethods.waitFor(5);
        String actualAramaSonucStr = medunnam.aramasonucelemnt.getText();
        ReusableMethods.waitFor(5);
        Assert.assertTrue(actualAramaSonucStr.contains(arananSSN));
        ReusableMethods.getScreenshot("Patient");


    }

    @Then("Sayfasini kapatir")
    public void sayfasini_kapatir() {
        Driver.closeDriver();
    }

    //us22-tc002
    @Then("Kullanici Staff Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer")
    public void kullanici_staff_patients_sayfasinda_test_sonucunu_gormek_istedigi_hastanin_ssn_id_sini_girer() {
        ReusableMethods.waitFor(2);
        medunnam.ssnbox.sendKeys("715-15-1516");

    }

    @Then("Kullanici Staff ShowAppointments butonuna tiklar")
    public void kullanici_staff_show_appointments_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        medunnam.ShowAppoint.click();



    }

    @Then("Kullanici Staff acilan sayfada Show Test butonuna tiklar")
    public void kullanici_staff_acilan_sayfada_show_test_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.Showtest.click();

    }

    @Then("Kullanici Staff acilan sayfada Test Result basliginin gorunulurlugunu dogrular")
    public void kullanici_staff_acilan_sayfada_test_result_basliginin_gorunulurlugunu_dogrular() throws IOException {
        ReusableMethods.waitFor(2);
        medunnam.viewresult.click();
        ReusableMethods.waitFor(2);
        assert medunnam.Testresult.getText().equals("TestResult");
        ReusableMethods.getScreenshot("Test Result");


    }

    //us_022 tc003
    @Then("Kullanici Staff Appointments sayfasinda\"\" nolu hastanin show test butonuna tiklar")
    public void kullanici_staff_appointments_sayfasinda_nolu_hastanin_show_test_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.Showtest.click();

    }

    @Then("Kullanici Staff acilan Tests sayfasinda nolu id li testin View Results secenegine tiklar")
    public void kullanici_staff_acilan_tests_sayfasinda_nolu_id_li_testin_view_results_secenegine_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.viewresult.click();
        //  medunnam.Testresult.isDisplayed();

    }

    @Then("Kullanici Staff acilan Test Result sayfasinda sonuc bilgilerinin\"id,date,result,description\" gorunulurulugunu dogrular")
    public void kullanici_staff_acilan_test_result_sayfasinda_sonuc_bilgilerinin_id_date_result_description_gorunulurulugunu_dogrular() throws IOException {
        assert medunnam.TestResultid.getText().equals("ID");
        assert medunnam.TestResultname.getText().equals("Name");
        assert medunnam.TestResultDefaultmin.getText().equals("Default Min. Value");
        assert medunnam.TestResultDefaultmax.getText().equals("Default Max. Value");
        assert medunnam.TestResultresult.getText().equals("Result");
        assert medunnam.TestResultDescription.getText().equals("Description");
        //ReusableMethods.getScreenshot("Test Result");
        ReusableMethods.waitFor(3);
    }

    @Then("Staff Test result sayfasindagelen test sonuclarinin edit butonuna tiklar save butona tiklar")
    public void staff_test_result_sayfasindagelen_test_sonuclarinin_edit_butonuna_tiklar_save_butona_tiklar() {

        medunnam.TestResultEditbutonu.click();

        ReusableMethods.waitFor(3);

        medunnam.resultbox.sendKeys("100",Keys.ENTER);

    }



    @And("Staff  Staff A Patient is updated with identifier yazisinin gorunulurlugunu dogrular ve ekran goruntusunu alir")
    public void staffStaffAPatientIsUpdatedWithIdentifierYazisininGorunulurlugunuDogrularVeEkranGoruntusunuAlir() {
        ReusableMethods.waitFor(3);
        //  actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertTrue(medunnam.updatedWithIdentifer.isDisplayed());
        // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.alertIsPresent());

        // String updatedWithIdentifer = Driver.getDriver().switchTo().alert().getText();
        // String expectedAlertYazisi ="A Test Result is updated with identifier";
        // Assert.assertEquals(expectedAlertYazisi, updatedWithIdentifer);

    }
    @Given("Kullanicim Staffi www.medunna.com adresine gider")
    public void kullanicim_staffi_www_medunna_com_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("Kullanicim staffi giris yap simgesine ve acilan menude Sign-in secenegine tiklar")
    public void kullanicim_staffi_giris_yap_simgesine_ve_acilan_menude_sign_in_secenegine_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.simge.click();
        medunnam.sign.click();
    }

    @Then("Kullanicim Staffi gecerli bir Username girer")
    public void kullanicim_staffi_gecerli_bir_username_girer() {
        medunnam.userBox.sendKeys(ConfigReader.getProperty("StaffUsername"));

    }

    @Then("Kulanicim Staffi gecerli bir password girer")
    public void kulanicim_staffi_gecerli_bir_password_girer() {
        medunnam.paswordBox.sendKeys(ConfigReader.getProperty("StaffPassword"));

    }

    @Then("Kullanicim Staffi Sign in butonuna tiklar")
    public void kullanicim_staffi_sign_in_butonuna_tiklar() {
        medunnam.singButonu.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Kullanicim Staffi MyPages butonuna tiklar")
    public void kullanicim_staffi_my_pages_butonuna_tiklar() {
        medunnam.mypages.click();
    }

    @Then("Kullanicim Staffi Search Patient a tiklar Patients sayfasina gelir")
    public void kullanicim_staffi_search_patient_a_tiklar_patients_sayfasina_gelir() {
        ReusableMethods.waitFor(3);
        medunnam.searchpatient.click();
    }

    @Then("Kullanicim Staffi Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer")
    public void kullanicim_staffi_patients_sayfasinda_test_sonucunu_gormek_istedigi_hastanin_ssn_id_sini_girer() {
        ReusableMethods.waitFor(2);
        medunnam.ssnbox.sendKeys("715-15-1516");
    }

    @Then("Kullanicim Staffi ShowAppointments butonuna tiklar")
    public void kullanicim_staffi_show_appointments_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        medunnam.ShowAppoint.click();

    }

    @Then("Kullanicim Staffi Appointments sayfasinda nolu hastanin payment invoice butonuna tiklar")
    public void kullanicim_staffi_appointments_sayfasinda_nolu_hastanin_payment_invoice_butonuna_tiklar() {
        ReusableMethods.waitFor(5);
        medunnam.paymentInvoiceProcesbuton.click();

    }

    @Then("Kullanicim staff acilan sayfada Payment Detail basliginin gorunulurlugunu dogrular")
    public void kullanicim_staff_acilan_sayfada_payment_detail_basliginin_gorunulurlugunu_dogrular() {
        ReusableMethods.waitFor(3);
        assert medunnam.paymentdetailbaslik.getText().equals("PAYMENT DETAIL");
    }

    @Then("Kullanicim staffi Show invoice butonuna tiklayip faturayi olusturur")
    public void kullanicim_staffi_show_invoice_butonuna_tiklayip_faturayi_olusturur() {
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        medunnam.showInvoicebuton.click();


    }

    //us23 Tc 002
    @Then("Kullanici staff status durumunun Completed oldugunu dogrular")
    public void kullanici_staff_status_durumunun_completed_oldugunu_dogrular() {
        assert medunnam.completedstatusu.getText().equals("COMPLETED");
        ReusableMethods.waitFor(5);
    }

    //us23 tc 003

    @Then("Kullanici Staff Payment Detail sayfasindaki muayene, test urun ucretlerinin sayfada gorundugunu dogrular")
    public void kullanici_staff_payment_detail_sayfasindaki_muayene_test_urun_ucretlerinin_sayfada_gorundugunu_dogrular() {
        ReusableMethods.waitFor(3);
        assert medunnam.muayeneucreti.getText().equals("Exam Fee:");
        assert medunnam.testucreti.getText().equals("Test Item Fee");
        ReusableMethods.waitFor(2);

    }
    @Then("Kullanici staff sayfa sonundaki show invoice yazisina tiklar")
    public void kullanici_staff_sayfa_sonundaki_show_invoice_yazisina_tiklar() throws IOException {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        medunnam.showInvoicebuton.sendKeys(Keys.ENTER);
        medunnam.showInvoicebuton.click();
        ReusableMethods.waitFor(3);
        ReusableMethods.getScreenshot("Show Invoice");

    }
    @Then("Kullanici Invoice basligini dogrular")
    public void kullanici_invoice_basligini_dogrular() {
        ReusableMethods.waitFor(2);
        medunnam.invoicebaslik.isDisplayed();
        assert medunnam.invoicebaslik.getText().equals("INVOICE");
        ReusableMethods.waitFor(3);

    }

    @Given("Kullanici Patient Medunna Url'sine gider")
    public void kullanici_patient_medunna_url_sine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Given("Kullanici Patient oturum açma icin Sign in'e tiklar")
    public void kullanici_patient_oturum_açma_icin_sign_in_e_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.simge.click();
        medunnam.sign.click();


    }
    @Given("Kulanici Patient Username ve password girer")
    public void kulanici_patient_username_ve_password_girer() {
        medunnam.userBox.sendKeys(ConfigReader.getProperty("hastausername"));
        ReusableMethods.waitFor(2);
        medunnam.paswordBox.sendKeys(ConfigReader.getProperty("hastapassword"));

    }
    @Given("Kullanici Patient Sign in butonuna tiklar")
    public void kullanici_patient_sign_in_butonuna_tiklar() {
        medunnam.singButonu.click();
        ReusableMethods.waitFor(5);
    }
    @Given("Kullanici Patient MyPages Patient butonuna tiklar")
    public void kullanici_patient_my_pages_patient_butonuna_tiklar() {
        medunnam.mypagespatient.click();

    }
    @Given("Kullanici Patient My Appoinments butonuna tiklar")
    public void kullanici_patient_my_appoinments_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        medunnam.myappointmentpatiend.click();
    }



    @Given("Kullanici Patient acilan sayfada Show Test butonuna tiklar")
    public void kullanici_patient_acilan_sayfada_show_test_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        medunnam.showtest.click();
        // medunnam.showtest.click();



    }
    @Given("Kullanici Patient acilan safyada iew esult utonuna tiklar")
    public void kullanici_patient_acilan_safyada_iew_esult_utonuna_tiklar() {
        ReusableMethods.waitFor(2);
        medunnam.viewresultuu.click();

    }


    @Given("Kullanici Patient sayfada Test Result basligi altina id,name,default max,min value,test date,descriptio gorunulurlugunu dogrular")
    public void kullanici_patient_sayfada_test_result_basligi_altina_id_name_default_max_min_value_test_date_descriptio_gorunulurlugunu_dogrular() {

        assert medunnam.testREbaslik.isDisplayed();
        //("ID","Name","Result","Default Max. Value","Default Min.Value","Test","Description","Date"));
        //assert medunnam.ID.getText().equals("ID");
        //assert medunnam.Name.getText().equals("Name");
        //assert medunnam.Result.getText().equals("Result");
        //assert medunnam.defaultminvalue.getText().equals("Default Min.Value");
        // assert medunnam.defaultmaxvalue.getText().equals("Default Max.Value");
        assert medunnam.Test.getText().equals("Test");
        //assert medunnam.description.getText().equals("Description");
        // assert medunnam.date.getText().equals("Date");
        //ReusableMethods.getScreenshot("Test Result");
        ReusableMethods.waitFor(3);
        for (WebElement w:medunnam.testbasliklari) {
            assert w.isDisplayed();

        }

    }

    @Given("Kullanici Patient acilan sayfada Showinvoice butonuna tiklar")
    public void kullanici_patient_acilan_sayfada_showinvoice_butonuna_tiklar() throws InterruptedException {
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        medunnam.Shwinvoice.click();

    }
    @Given("Kullanici Patient acilan safyada Invoice basliginin gorunulurlugunu dogrular ekran goruntusunu alir")
    public void kullanici_patient_acilan_safyada_invoice_basliginin_gorunulurlugunu_dogrular_ekran_goruntusunu_alir() {
        ReusableMethods.waitFor(3);
        assert medunnam.faturayigoruyorum.isDisplayed();

    }
    @Given("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();
    }



}



