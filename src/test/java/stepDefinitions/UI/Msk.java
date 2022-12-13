package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Msk {
    pages.Msk medunna = new pages.Msk();
    Actions actions = new Actions(Driver.getDriver());
    Select select;
    public String yeniPassword = "yenisif";

    @Given("Kullanici {string} sayfasine gider")
    public void kullaniciSayfasineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Kullanici oturum acma icin Sign in'e tiklar")
    public void kullaniciOturumAcmaIcinSignInETiklar() {
        medunna.girisSimgesi.click();
        medunna.signin.click();
    }
// US_008
    @And("Kulanici Username ve pasword girer")
    public void kulaniciUsernameVePaswordGirer() throws InterruptedException {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("bosUsername"));
        ReusableMethods.waitFor(2);
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("bosPassword"));
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        medunna.singinButonu.click();
    }
    @And("Kullanici giris yaptigini dogrular")
    public void kullaniciGirisYaptiginiDogrular() {
        String expectedName = "Kerem Polat";
        Assert.assertEquals("Kullanici dogru degil",expectedName,medunna.bosUser.getText());
    }
    @And("Kullanici isminin ustune tiklar ve Pasword sekmesine gider")
    public void kullaniciIsmininUstuneTiklarVePaswordSekmesineGider() {
        medunna.bosUser.click();
        medunna.passwordSimgesi.click();
        ReusableMethods.waitFor(1);
    }
    @And("Kullanici Current Pasword'u girer")
    public void kullaniciCurrentPaswordUGirer() {
        medunna.currentPassword.sendKeys(ConfigReader.getProperty("bosPassword"));
        ReusableMethods.waitFor(1);
    }
    @And("Kullanici New pasword 'u girer")
    public void kullaniciNewPaswordUGirer() {
        medunna.newPassword.sendKeys(yeniPassword);
        ReusableMethods.waitFor(1);
    }
    @And("Kullanici New pasword Confirmation'u girer")
    public void kullaniciNewPaswordConfirmationUGirer() {
        medunna.confirmPassword.sendKeys(yeniPassword);
    }
    @And("Kullanici New password ile New Pasword Confirmation'u dogrular")
    public void kullaniciNewPasswordIleNewPaswordConfirmationUDogrular() {
        Assert.assertEquals("New password ile New password confirm ayni degil",yeniPassword,"yenisif");
        ReusableMethods.waitFor(2);
    }
    @And("TC_002 Kullanici password icinde en az bir kucuk harf oldugunu dogrular")
    public void TC_002kullaniciPasswordIcindeEnAzBirKucukHarfOldugunuDogrular() {
        yeniPassword=yeniPassword+"r";
        medunna.newPassword.sendKeys("r");
        medunna.confirmPassword.sendKeys("r");
        if(yeniPassword.contains("r")){
                System.out.println("Sifre en az bir kucuk harf icermektedir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_002 Kullanici password strength: seviyesinin degistigini gormelidir")
    public void tc_002KullaniciPasswordStrengthSeviyesininDegistiginiGormelidir() {
        List<WebElement> passwordGucuGri = medunna.controlPasswordStreght;
        if(passwordGucuGri.size()>0){
            System.out.println("Password gucu " + (5-passwordGucuGri.size())+" dis degismistir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_003 Kullanici password icinde en az bir buyuk harf oldugunu dogrular")
    public void tc_003KullaniciPasswordIcindeEnAzBirBuyukHarfOldugunuDogrular() {
        yeniPassword=yeniPassword+"E";
        medunna.newPassword.sendKeys("E");
        medunna.confirmPassword.sendKeys("E");
        if(yeniPassword.contains("E")){
            System.out.println("Sifre en az bir buyuk harf icermektedir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_003 Kullanici password strength: seviyesinin degistigini gormelidir")
    public void tc_003KullaniciPasswordStrengthSeviyesininDegistiginiGormelidir() {
        List<WebElement> passwordGucuGri = medunna.controlPasswordStreght;
        if(passwordGucuGri.size()>0){
            System.out.println("Password gucu " + (5-passwordGucuGri.size())+" dis degismistir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_004 Kullanici password icinde en az bir rakam oldugunu dogrular")
    public void tc_004KullaniciPasswordIcindeEnAzBirRakamOldugunuDogrular() {
        yeniPassword=yeniPassword+"1";
        medunna.newPassword.sendKeys("1");
        medunna.confirmPassword.sendKeys("1");
        if(yeniPassword.contains("1")){
            System.out.println("Sifre en az bir rakam icermektedir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_004 Kullanici Password strength: seviyesinin degistigini gormelidir")
    public void tc_004KullaniciPasswordStrengthSeviyesininDegistiginiGormelidir() {
        List<WebElement> passwordGucuGri = medunna.controlPasswordStreght;
        if(passwordGucuGri.size()>0){
            System.out.println("Password gucu " + (5-passwordGucuGri.size())+" dis degismistir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_005 Kullanici password icinde en az bir ozel karakter oldugunu dogrular")
    public void tc_005KullaniciPasswordIcindeEnAzBirOzelKarakterOldugunuDogrular() {
        yeniPassword=yeniPassword+"-";
        medunna.newPassword.sendKeys("-");
        medunna.confirmPassword.sendKeys("-");
        if(yeniPassword.contains("-")){
            System.out.println("Sifre en az bir ozel karakter icermektedir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_005 Kullanici password strength: seviyesinin degistigini gormelidir")
    public void tc_005KullaniciPasswordStrengthSeviyesininDegistiginiGormelidir() {
        List<WebElement> passwordGucuYesil = medunna.passwordStrengthGreen;
        if(passwordGucuYesil.size()==5){
            System.out.println("Password gucu " + passwordGucuYesil.size()+" dis degismistir");
        }
        System.out.println("passwordGucu = " + passwordGucuYesil.size());
        System.out.println("yeniPassword = " + yeniPassword);
        ReusableMethods.waitFor(2);
    }
    @And("TC_006 Kullanici password en az yedi karakter oldugunu dogrular")
    public void tc_006KullaniciPasswordEnAzYediKarakterOldugunuDogrular() {
        if(yeniPassword.length()>=7){
            System.out.println("Sifre en az yedi karakterden olusmaktadir");
        }
        ReusableMethods.waitFor(2);
    }
    @And("TC_006 Kullanici Save butonuna basarak kaydeder")
    public void tc_006KullaniciSaveButonunaBasarakKaydeder() {
        //medunna.savePasswordButton.click();
        System.out.println("Sava butonuna tiklanmali");
        ReusableMethods.waitFor(2);
    }
    @And("TC_007 Kullanici isminin ustune tiklar ve sign out sekmesine gider")
    public void tc_007KullaniciIsmininUstuneTiklarVeSignOutSekmesineGider() {
        medunna.bosUser.click();
        medunna.signOutSimgesi.click();
        ReusableMethods.waitFor(2);
    }
    @And("TC_007 Kullanici SIGN IN AGAIN butonuna tiklar")
    public void tc_007KullaniciSIGNINAGAINButonunaTiklar() {
        medunna.signinAgain.click();
    }
    @And("TC_007 Kullanici username ve eski paswordu girer")
    public void tc_007KullaniciUsernameVeEskiPasworduGirer() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("bosUsername"));
        ReusableMethods.waitFor(2);
        medunna.passwordBox.sendKeys("****************");
        ReusableMethods.waitFor(2);
        medunna.singinButonu.click();
    }
    @And("TC_007 Kullanici eski sifre ile giris yapilamadigini test eder")
    public void tc_007KullaniciEskiSifreIleGirisYapilamadiginiTestEder() {
        String expectedFailed="Failed to sign in!";
        if(medunna.failedToSignin.getText().contains(expectedFailed)){
            System.out.println("Giris yapilamadi");
        }
        Assert.assertTrue(expectedFailed.contains(medunna.failedToSignin.getText()));
        ReusableMethods.waitFor(2);
    }
    // US_009
    @And("Kulanici Staff bilgileri ile giris yapar.")
    public void kulaniciStaffBilgileriIleGirisYapar() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("staffUsername"));
        ReusableMethods.waitFor(2);
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("staffPassword"));
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici  MY PAGES sekmesinde Search Patient butonuna tiklar")
    public void kullaniciMYPAGESSekmesindeSearchPatientButonunaTiklar() {
        medunna.myPagesButton.click();
        medunna.searchPatientButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici hasta bilgilerini gorebildigini kontrol eder\\(ekran resmi ile)")
    public void kullaniciHastaBilgileriniGorebildiginiKontrolEderEkranResmiIle() {
        try {
            ReusableMethods.getScreenshot("Us_009_TC_003");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici Edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        medunna.patientSearchBox.sendKeys("715-15-1516");
        medunna.editButton.click();
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici butun hasta bilgilerini duzenleyebilmelidir ve degistigini kontrol eder.")
    public void kullaniciButunHastaBilgileriniDuzenleyebilmelidirVeDegistiginiKontrolEder() {
        String expectedFirstname = medunna.patientFirstName.getAttribute("value");
        String expectedLastname = medunna.patientLastName.getAttribute("value");
        String expectedBirthDate = medunna.patientBirthDate.getAttribute("value");
        String expectedEmail = medunna.patientEmail.getAttribute("value");
        String expectedPhone = medunna.patientPhone.getAttribute("value");
        String expectedGender = medunna.patientGender.getAttribute("value");
        String expectedBloodDroup = medunna.patientBloodGroup.getAttribute("value");
        String expectedAdress = medunna.patientAdress.getAttribute("value");
        String expectedDescription = medunna.patientDescription.getText();
        String expectedUser = medunna.patientUser.getAttribute("value");
        String expectedCountry = medunna.patientCountry.getAttribute("value");
        String expectedStateCity = medunna.patientStateCity.getAttribute("value");
        ReusableMethods.waitFor(2);

        /*System.out.println("expectedFirstname = " + expectedFirstname);
        System.out.println("expectedLastname = " + expectedLastname);
        System.out.println("expectedBirthDate = " + expectedBirthDate);
        System.out.println("expectedEmail = " + expectedEmail);
        System.out.println("expectedPhone = " + expectedPhone);
        System.out.println("expectedGender = " + expectedGender);
        System.out.println("expectedBloodDroup = " + expectedBloodDroup);
        System.out.println("expectedAdress = " + expectedAdress);
        System.out.println("expectedDescription = " + expectedDescription);
        System.out.println("expectedUser = " + expectedUser);
        System.out.println("expectedCountry = " + expectedCountry);
        System.out.println("expectedStateCity = " + expectedStateCity);*/
        medunna.patientFirstName.clear();
        medunna.patientFirstName.sendKeys("Hasta1");
        String actualFirstname=medunna.patientFirstName.getAttribute("value");
        Assert.assertNotEquals("Hasta ismi degismemistir",expectedFirstname,actualFirstname);
        ReusableMethods.waitFor(1);

        medunna.patientLastName.clear();
        medunna.patientLastName.sendKeys("Mine1");
        String actualLastname=medunna.patientLastName.getAttribute("value");
        Assert.assertNotEquals("Hasta soyismi degismemistir",expectedLastname,actualLastname);
        ReusableMethods.waitFor(1);

        medunna.patientBirthDate.sendKeys("2005-09-09T08:30");
        String actualBirthDate=medunna.patientBirthDate.getAttribute("value");
        Assert.assertNotEquals("Hasta dogum tarihi degismemistir",expectedBirthDate,actualBirthDate);
        ReusableMethods.waitFor(1);

        medunna.patientPhone.clear();
        medunna.patientPhone.sendKeys("9202121250");
        String actualPhone=medunna.patientPhone.getAttribute("value");
        Assert.assertNotEquals("Hasta telefon degismemistir",expectedPhone,actualPhone);
        ReusableMethods.waitFor(1);

        medunna.patientEmail.clear();
        medunna.patientEmail.sendKeys("minebi_1@hotmail.com");
        String actualEmail=medunna.patientEmail.getAttribute("value");
        Assert.assertNotEquals("Hasta email degismemistir",expectedEmail,actualEmail);
        ReusableMethods.waitFor(1);


        medunna.patientGenderMALE.click();
        String actualGender=medunna.patientGenderMALE.getAttribute("value");
        Assert.assertNotEquals("Hasta Gender degismemistir",expectedGender,actualGender);
        ReusableMethods.waitFor(1);

        medunna.patientBloodBnegative.click();
        String actualBloodGroup=medunna.patientBloodBnegative.getAttribute("value");
        Assert.assertNotEquals("Hasta kan grubu degismemistir",expectedBloodDroup,actualBloodGroup);
        ReusableMethods.waitFor(1);

        medunna.patientAdress.sendKeys("-A");
        String actualAdress=medunna.patientAdress.getAttribute("value");
        Assert.assertNotEquals("Hasta adres degismemistir",expectedAdress,actualAdress);
        ReusableMethods.waitFor(1);

        medunna.patientDescription.sendKeys("Test amacli yazilmistir");
        String actualDescription=medunna.patientDescription.getAttribute("value");
        Assert.assertNotEquals("Hasta Description degismemistir",expectedDescription,actualDescription);
        ReusableMethods.waitFor(1);

        medunna.patientUserJonathan.click();
        String actualUser=medunna.patientUserJonathan.getAttribute("value");
        Assert.assertNotEquals("Hasta User degismemistir",expectedUser,actualUser);
        ReusableMethods.waitFor(1);

        medunna.patientCountryTurkiye.click();
        String actualCountry=medunna.patientCountryTurkiye.getAttribute("value");
        Assert.assertNotEquals("Hasta Country degismemistir",expectedCountry,actualCountry);
        ReusableMethods.waitFor(1);

        medunna.patientCityKutahya.click();
        String actualCity=medunna.patientCityKutahya.getAttribute("value");
        Assert.assertNotEquals("Hasta City degismemistir",expectedStateCity,actualCity);
        ReusableMethods.waitFor(6);

    }
    @And("Kullanici Save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        medunna.patientSaveButton.click();
        ReusableMethods.waitFor(1);
    }
    @And("Patients search kismina 715-15-1515 yazarak arama yapar.")
    public void patientsSearchKisminaYazarakAramaYapar() {
        medunna.patientSearchBox.sendKeys("715-15-1516");
        ReusableMethods.waitFor(1);
    }
    @And("Arama yaptigini kontrol eder")
    public void aramaYaptiginiKontrolEder() {
        Assert.assertEquals("Aranan SSN bulunan SSN numarasina esit degildir",
                medunna.searchSSNnumber.getText(),"715-15-1516");
        ReusableMethods.waitFor(1);
    }
    @And("Tum kayit bilgilerinin dolduruldugunu kontrol eder.")
    public void tumKayitBilgilerininDolduruldugunuKontrolEder() {
        List<WebElement> bilgilerinDogrulugu= medunna.appointmentsRow;
        for (WebElement w: bilgilerinDogrulugu) {
            Assert.assertTrue(w.getText()+" is empty",w.getText().isEmpty());
        }
        ReusableMethods.waitFor(1);
    }
    @And("Kullanici Delete butonunun olmadigini kontrol eder.")
    public void kullaniciButonununOlmadiginiKontrolEder() {
        String expectedDeleteButonu="Delete";
        Assert.assertFalse(expectedDeleteButonu,medunna.appointmentsText.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    // US_010
    @And("Kullanici Doktor bilgileri ile giris yapar")
    public void kullaniciDoktorBilgileriIleGirisYapar() {
        medunna.usernameBox.sendKeys(ConfigReader.getProperty("drUsername"));
        ReusableMethods.waitFor(2);
        medunna.passwordBox.sendKeys(ConfigReader.getProperty("drPassword"));
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici  MY PAGES sekmesinde My Appointments butonuna tiklar")
    public void kullaniciMYPAGESSekmesindeMyAppointmentsButonunaTiklar() {
        medunna.myPagesButton.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.jsclick(medunna.myAppointmentsButon);
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici Appointments sayfasina girdigini kontrol eder")
    public void kullaniciAppointmentsSayfasinaGirdiginiKontrolEder() {
        String expectedAppointmnts="Appointments";
        Assert.assertEquals(expectedAppointmnts,medunna.appointmentsText.getText());
        ReusableMethods.waitFor(2);
    }
    @And("Kullanici Randevu listesini gorebilmelidir")
    public void kullaniciRandevuListesiniGorebilmelidir() {
    List<WebElement> appointmentsRowText = medunna.appointmentsRow;
    List<String> actualListMenu= new ArrayList<>();

    actualListMenu.add("ID");
    actualListMenu.add("Start DateTime");
    actualListMenu.add("End DateTime");
    actualListMenu.add("Status");
    actualListMenu.add("Anamnesis");
    actualListMenu.add("Treatment");
    actualListMenu.add("Diagnosis");
    actualListMenu.add("Prescription");
    actualListMenu.add("Description");
    actualListMenu.add("Created Date");
    actualListMenu.add("Physician");
    actualListMenu.add("Patient");
        for (WebElement w: appointmentsRowText) {
            for (int i = 0; i <actualListMenu.size() ; i++) {
                if(actualListMenu.get(i).equalsIgnoreCase(w.getText())){
                    System.out.println(actualListMenu.get(i)+" gorulmektedir");
                }
            }
        }

        ReusableMethods.waitFor(2);
    }
    @And("Kullanici zaman dilimlerini gorebilmelidir")
    public void kullaniciZamanDilimleriniGorebilmelidir() {
        String expectedFromDate="2022-11-22";
        String actualFromDate= medunna.fromToDate.getAttribute("value");
        Assert.assertEquals(expectedFromDate,actualFromDate);

        String expectedToDate="2022-12-05";
        String actualToDate= medunna.toDate.getAttribute("value");

        Assert.assertEquals(expectedToDate,actualToDate);
        ReusableMethods.waitFor(1);
    }


}
