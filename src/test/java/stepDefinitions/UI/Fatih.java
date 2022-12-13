package stepDefinitions.UI;

import io.cucumber.java.en.And;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Fatih {

    LoginPage medunna = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());
   pages.Fatih fatihPage = new pages.Fatih();
    JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
    String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());


    @And("Doktor My Appointments butonuna tiklar")
    public void doktorMyAppointmentsButonunaTiklar() {
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ReusableMethods.waitFor(3);
        // actions.moveToElement(fatihPage.myAppointments).click();
        js.executeScript("arguments[0].click();", fatihPage.myAppointments);
    }

    @And("Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.")
    public void doktorEkranaGelecekAppointmentsListesindenIlkindekiEDITButonunaTiklar() {

        js.executeScript("arguments[0].click();", fatihPage.editButton);
    }

    @And("Doktor “Create or Edit an Appointment” yazisinin gorunur oldugunu dogrular.")
    public void doktorCreateOrEditAnAppointmentYazisininGorunurOldugunuDogrular() {
        assertTrue(fatihPage.createOrEditAppointment.isDisplayed());
    }


    @And("Doktor Request A Test Butonuna tiklar.")
    public void doktorRequestATestButonunaTiklar() throws AWTException {
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();", fatihPage.requestATestButton);
        ReusableMethods.waitFor(3);
        Robot robot = new Robot();
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_CONTROL);
            //  Driver.getDriver().navigate().refresh();
        }
    }

    @And("Doktor “id, start date, end date, Status, physician” bilgilerinin gorunur oldugunu dogrular.")
    public void doktorIdStartDateEndDateStatusPhysicianBilgilerininGorunurOldugunuDogrular() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);  //CTRL`ye tikladi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - `ye tikladi
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // -`yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL);  //  CTRL`yi birakti
            // Buraya kadar olan: CTRL+ "-"  ye basildi ve Acilan Chrome sayfasi %10 ZoomIn yapilmis oldu.
            //  Driver.getDriver().navigate().refresh();
        }

        assertTrue(fatihPage.idText.isDisplayed());
        assertTrue(fatihPage.startDateText.isDisplayed());
        assertTrue(fatihPage.endDateText.isDisplayed());
        ReusableMethods.waitFor(3);
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


        js.executeScript("arguments[0].scrollIntoView(true);", fatihPage.physicianText);
        //   Su anda Calisiyor ama actions ile DAHA SONRA sayfayi tam ortalarsin.
        ReusableMethods.waitFor(3);
        assertTrue(fatihPage.physicianText.isDisplayed());
    }

    @And("Doktor,  Anamnesis, Treatment ve Diagnosis alanlarinin alt kisimlarinda “This field is required.” uyari yazisinin belirdigini ve bu nedenle bu alanlarin bos birakilamayacagini dogrular.")
    public void doktorAnamnesisTreatmentVeDiagnosisAlanlarininAltKisimlarindaThisFieldIsRequiredUyariYazisininBelirdiginiVeBuNedenleBuAlanlarinBosBirakilamayacaginiDogrular() throws AWTException {

        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            //  Driver.getDriver().navigate().refresh();
        }
        ReusableMethods.waitFor(3);
        actions.click(fatihPage.saveButoon).perform();
        assertTrue(fatihPage.requiredText1.isDisplayed());
        ReusableMethods.waitFor(1);
        assertTrue(fatihPage.requiredText2.isDisplayed());
        ReusableMethods.waitFor(1);
        assertTrue(fatihPage.requiredText3.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("Ayni durumda “Prescription” ve “Description” alanlarinin alt kisminda “This field is required.” uyarisinin yer almadigini ve bu nedenle bu alanlarin bos birkilabilecegini dogrular.")
    public void ayniDurumdaPrescriptionVeDescriptionAlanlarininAltKismindaThisFieldIsRequiredUyarisininYerAlmadiginiVeBuNedenleBuAlanlarinBosBirkilabileceginiDogrular() {
    }

    @And("Anamnesis, Treatment ve Diagnosis Text Box`larina gerekli verileri girer.")
    public void anamnesisTreatmentVeDiagnosisTextBoxLarinaGerekliVerileriGirer() {

        actions.moveToElement(fatihPage.anamnesisTextBox).click().sendKeys("Anamnesis OK").sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(2);
        actions.sendKeys(fatihPage.treatmentTextBox, "Treatment OK").perform();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB).sendKeys(fatihPage.diagnosisTextBox, "Diagnosis OK").perform();
    }

    @And("Doktor Ekrana gelecek Appointments listesinden ucuncu EDIT butonuna tiklar.")
    public void doktorEkranaGelecekAppointmentsListesindenUcuncuEDITButonunaTiklar() {
        actions.moveToElement(fatihPage.editButton3).click().perform();
    }

    @And("Doktor “Status” alanina tiklayarak {string} seceneklerinden birini secer.")
    public void doktorStatusAlaninaTiklayarakSeceneklerindenBiriniSecer(String arg0) {

        actions.moveToElement(fatihPage.statusBox).click().perform();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).perform();

    }


    @And("Acilan ekranda “Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin\" Seceneklerini bulup sag kisimlarinda yer alan kutucuklari isaretler.")
    public void acilanEkrandaGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinSecenekleriniBulupSagKisimlarindaYerAlanKutucuklariIsaretler() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();

        js.executeScript("arguments[0].click();", fatihPage.testUrea);
        js.executeScript("arguments[0].click();", fatihPage.testAlbumin);
        js.executeScript("arguments[0].click();", fatihPage.testHemoglobin);
        js.executeScript("arguments[0].click();", fatihPage.testGlucose);
        js.executeScript("arguments[0].click();", fatihPage.testCreatinine);
        js.executeScript("arguments[0].click();", fatihPage.testPotassium);
        js.executeScript("arguments[0].click();", fatihPage.testTotalProtein);
        js.executeScript("arguments[0].click();", fatihPage.testSodium);
        js.executeScript("arguments[0].click();", fatihPage.testPageSaveButton);

        // js.executeScript("arguments[0].scrollIntoView(true);", fatihPage.testPageSaveButton);


    }

    @And("Acilan ekranda {string} Seceneklerini bulup sag kisimlarinda yer alan kutucuklari isaretler.")
    public void acilanEkrandaSecenekleriniBulupSagKisimlarindaYerAlanKutucuklariIsaretler(String tests) {
        List<String> names = new ArrayList<>();

        String[] testList = tests.replace("{", "").replace("}", "").split(",");
        for (WebElement w : fatihPage.nameList) {
            names.add(w.getText());
        }
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            for (String s : testList) {
                if (s.equals(names.get(i))) {
                    js.executeScript("arguments[0].scrollIntoView(true);", Driver.getDriver().findElement(By.xpath("(//*[@type='checkbox'])" + "[" + (i + 1) + "]")));
                    js.executeScript("arguments[0].click();", Driver.getDriver().findElement(By.xpath("(//*[@type='checkbox'])" + "[" + (i + 1) + "]")));
                    count++;
                }
            }
        }
        ReusableMethods.waitFor(3);
        int testSayisi = testList.length;
        System.out.println("count = " + count);
        System.out.println("testSayisi = " + testSayisi);
        assertEquals(testSayisi, count);
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();", fatihPage.testPageSaveButton);

    }


//   >>>    US013 TC001


    @And("Staff “My Pages” butonuna ve ardindan “Search Patient” butonuna tiklar")
    public void staffMyPagesButonunaVeArdindanSearchPatientButonunaTiklar() {
        actions.moveToElement(fatihPage.myPagesButton).click().moveToElement(fatihPage.searchPatientButton).click().perform();
    }

    @And("Search Patient Kismindan SSN numarasini aratarak ilgili hastaya ulasir.")
    public void searchPatientKismindanSSNNumarasiniAratarakIlgiliHastayaUlasir() throws AWTException {
        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            //  Driver.getDriver().navigate().refresh();
        }
        actions.moveToElement(fatihPage.ssnInputBox).click().sendKeys("120-12-1224").perform();
        ReusableMethods.waitFor(2);
    }

    @And("Show Appointments`a tiklar, ardindan Show Test ve View Results `a tiklayip Test Listesine Ulasir.")
    public void showAppointmentsATiklarArdindanShowTestVeViewResultsATiklayipTestListesineUlasir() {
        actions.moveToElement(fatihPage.showAppointmentsButton).click().perform();
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click()", fatihPage.showTestsButton);
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click()", fatihPage.viewResultsButton);
        ReusableMethods.waitFor(3);


    }

    @And("Her bir test icin Edit butonlarina tiklar.")
    public void herBirTestIcinEditButonlarinaTiklar() {

        for (int i = 0; i < fatihPage.descriptionList.size(); i++) {

            ReusableMethods.waitFor(5);
            js.executeScript("arguments[0].click()", fatihPage.editButton);
            ReusableMethods.waitFor(3);
            actions.moveToElement(fatihPage.resultInputBox).click().
                    doubleClick().sendKeys("Negative (-)").
                    sendKeys(Keys.TAB).sendKeys("Test = OK", Keys.ENTER).perform();
            ReusableMethods.waitFor(3);
        }
    }

    @And("Result ve Description alanlarini doldurup SAVE e tiklar.")
    public void resultVeDescriptionAlanlariniDoldurupSAVEETiklar() {
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);

    }

    @And("Sign-Out butonu ile cikis yapar.")
    public void signOutButonuIleCikisYapar() {
    }


    @And("Acilan ekranda “View Results” Butonuna tklar.")
    public void acilanEkrandaViewResultsButonunaTklar() {
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click()", fatihPage.viewResultsDoctorButton);

    }

    @And("Doktor “default max  value, default min value,  test, description and the date” Bilgilerinin goruntulendigini dogrular.")
    public void doktorDefaultMaxValueDefaultMinValueTestDescriptionAndTheDateBilgilerininGoruntulendiginiDogrular() {
        for (WebElement w : fatihPage.doctorListAssertion) {
            assertTrue(w.isDisplayed());
        }

    }


    @And("Doktor acilan ekranda Show Test Results  butonuna tiklar.")
    public void doktorAcilanEkrandaShowTestResultsButonunaTiklar() {
        //    js.executeScript("arguments[0].click()", fatihPage.showTestResultsDoctorButton);
        actions.moveToElement(fatihPage.showTestResultsDoctorButton).click().perform();

    }

    @And("Staff yeni bir pencere acar.")
    public void staffYeniBirPencereAcar() {
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);


    }


//   <<<<   US013 TC001

//>>>>   US013 TC002>>>>


    @And("Acilan ekranda “Request Impatient” Butonuna tklar.")
    public void acilanEkrandaRequestImpatientButonunaTklar() {
        ReusableMethods.waitFor(2);
        fatihPage.requestInpatient.click();

    }

    @And("Islemin onaylandigina dair Yesil Onay Kutusunun goruntulendigini dogrular..")
    public void isleminOnaylandiginaDairYesilOnayKutusununGoruntulendiginiDogrular() {
        // ReusableMethods.waitFor(1);
        assertTrue(fatihPage.reqInpatSuccess.isDisplayed());
    }
    //   US14_TC001    >>>>>
    @And("Doktor “My Pages” butonuna ve ardindan “My Inpatients” butonuna tiklar")
    public void doktorMyPagesButonunaVeArdindanMyInpatientsButonunaTiklar() {

        js.executeScript("arguments[0].scrollIntoView(true);", fatihPage.myInpatientsButton);
        js.executeScript("arguments[0].click()",fatihPage.myInpatientsButton);
        // actions.sendKeys(Keys.PAGE_DOWN).moveToElement(fatihPage.myInpatientsButton).click();
    }


    @And("Doctor ID, start and end dates, description, created date, appointment id, status, room ve patient bilgilerini goruntuler.")
    public void doctorIDStartAndEndDatesDescriptionCreatedDateAppointmentIdStatusRoomVePatientBilgileriniGoruntuler() throws AWTException {
        assertTrue(fatihPage.descriptionTextInp.isDisplayed());
        //   assertTrue(fatihPage.inpatientsTextInp.isDisplayed());
        assertTrue(fatihPage.idText.isDisplayed());
        assertTrue(fatihPage.startDateTextInp.isDisplayed());
        assertTrue(fatihPage.endDateTextInp.isDisplayed());
        assertTrue(fatihPage.appointmentTextInp.isDisplayed());

        Robot robot = new Robot();
        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // %10 Kucultme
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

        assertTrue(fatihPage.roomTextInp.isDisplayed());
        assertTrue(fatihPage.patientTextInp.isDisplayed());









    }



    //   US14_TC001    <<<<<<




    //   US14_TC002  >>>>>>
    @And("Doktor Acilan sayfada Status kisminda yer alan \\(UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED) Seceneklerin aktif ve degistirilebilir oldugunu dogrular.")
    public void doktorAcilanSayfadaStatusKismindaYerAlanUNAPPROVEDDISCHARGEDSTILLSTAYINGVeyaCANCELLEDSeceneklerinAktifVeDegistirilebilirOldugunuDogrular() {

        // js.executeScript("arguments[0].scrollIntoView(true);", fatihPage.statusTextBox);
        // actions.sendKeys("STAYING").perform();
        js.executeScript("arguments[0].click()",fatihPage.statusTextBox);
        Select select  =  new Select(fatihPage.statusTextBox);
        select.selectByValue("STAYING");

    }

    @And("Doktor SAVE BUTONUnun tiklanabilir aktif oldugunu dogrular.")
    public void doktorSAVEBUTONUnunTiklanabilirAktifOldugunuDogrular() {
        assertTrue(fatihPage.saveButtonInp.isEnabled());

    }
    //US14_TC002   <<<<<<<



}


