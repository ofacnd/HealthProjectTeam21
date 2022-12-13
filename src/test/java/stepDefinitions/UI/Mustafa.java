
package stepDefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;


public class Mustafa {

    pages.Mustafa medunnaPages = new pages.Mustafa();
    Actions actions;

    @Given("{string} adresine gidilir")
    public void adresine_gidilir(String MedunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(MedunnaUrl));
    }

    @Given("Account Menu butonuna tiklanir")
    public void account_menu_butonuna_tiklanir() {
        medunnaPages.girisSimgesi.click();
    }

    @Given("Register secenegine tiklanir")
    public void register_secenegine_tiklanir() {
        medunnaPages.registerButton.click();
    }

    @Given("SSN kutusuna Valid SSN girildiginde Your SSN is invalid uyarisi alinmamali")
    public void ssn_kutusuna_valid_ssn_girildiginde_uyarisi_alinmamali() {
        actions = new Actions(Driver.getDriver());
        actions.click(medunnaPages.ssnBox)
                .sendKeys(ConfigReader.getProperty("ValidSSN")).sendKeys(Keys.TAB).perform();

        String actuelSsnMessage = medunnaPages.ssnInvalidFeedback.getAttribute("class");
        String expactedSsnMessage = "form-group";
        Assert.assertEquals("SSN girisi basarisiz", expactedSsnMessage, actuelSsnMessage);

        //Burada karakter dogrulamasi yapildi
        String actuelSSN = medunnaPages.ssnBox.getAttribute("value");
        boolean ssnCheck = actuelSSN.charAt(3) == '-' && actuelSSN.charAt(6) == '-' && actuelSSN.length() == 11;
        Assert.assertTrue("SSN istenilen sarti saglamiyor", ssnCheck);
    }

    @Given("SSN kutusu bos birakildiginda hata vermeli uyarisi alinmali")
    public void ssn_kutusu_bos_birakildiginda_uyarisi_alinmali() {
        actions = new Actions(Driver.getDriver());
        actions.click(medunnaPages.ssnBox)
                .sendKeys(Keys.TAB).perform();

        String actuelSsnMessage = medunnaPages.ssnInvalidFeedback.getAttribute("class");
        String expectedSsnMessage = "text-danger form-group";
        Assert.assertTrue("SSN kutusu bos birakilirsa hata vermiyor", actuelSsnMessage.equals(expectedSsnMessage));
    }

    @Given("First Name kutusu bos birakildiginda Your FirstName is required. uyarisi alinmali.")
    public void first_name_kutusu_bos_birakildiginda_uyarisi_alinmali() {
        actions = new Actions(Driver.getDriver());
        actions.click(medunnaPages.firstNameBox).sendKeys(Keys.TAB).perform();

        String actuelFirstnameMessage = medunnaPages.firstNameInvalidFeedback.getAttribute("class");
        String expectedFirstNameMessage = "text-danger form-group";

        Assert.assertTrue("Firstname giris testi basarisiz", actuelFirstnameMessage.equals(expectedFirstNameMessage));
    }

    @Given("Last Name kutusu bos birakildiginda Your LastName is required. uyarisi alinmali.")
    public void last_name_kutusu_bos_birakildiginda_uyarisi_alinmali() {
        actions = new Actions(Driver.getDriver());
        actions.click(medunnaPages.lastNameBox).sendKeys(Keys.TAB).perform();

        String actuellastNameMessage = medunnaPages.lastNameInvalidFeedback.getAttribute("class");
        String expectedLastNameMessage = "text-danger form-group";

        Assert.assertTrue("Last Name giris testi basarisiz", actuellastNameMessage.equals(expectedLastNameMessage));
    }


    @And("Username kutusu bos birakildiginda Your username is required. uyarisi alinmali")
    public void invalidusernameKutusuBosBirakildigindaYourUsernameIsRequiredUyarisiAlinmali() {
        actions = new Actions(Driver.getDriver());
        actions.click(medunnaPages.userNameBox).sendKeys(Keys.TAB).perform();

        String actuelUsernameMessage = medunnaPages.userNameinvalidFeedback.getAttribute("class");
        String expectedUserNameMessage = "text-danger form-group";

        Assert.assertTrue("User Name giris testi basarisiz", actuelUsernameMessage.equals(expectedUserNameMessage));
    }

    @And("Email kutusuna @ ve . olmadan Email bilgisi yazildiginda This field is invalid uyarisi alinmali")
    public void emailKutusunaVeOlmadanEmailBilgisiYazildigindaThisFieldIsInvalidUyarisiAlinmali() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();

        Driver.waiting(1);//Burada bekleme vermezsem bir alttaki kutucuk uzerinde islem yapiyor.
        actions.click(medunnaPages.emailBox).sendKeys(ConfigReader.getProperty("InvalidEmailAdress"))
                .sendKeys(Keys.TAB).perform();

        String actuelEmailMessage = medunnaPages.emailBoxinvalidFeedback.getAttribute("class");
        String expectedEmailMessage = "text-danger form-group";

        Assert.assertTrue("Email giris testi basarisiz", actuelEmailMessage.equals(expectedEmailMessage));
    }


    @And("Email kutusu bos birakildiginda This field is invalid uyarisi alinmali")
    public void emailKutusuBosBirakildigindaThisFieldIsInvalidUyarisiAlinmali() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();

        Driver.waiting(1);//Burada bekleme vermezsem bir alttaki kutucuk uzerinde islem yapiyor.
        actions.click(medunnaPages.emailBox).sendKeys(Keys.TAB).perform();

        String actuelEmailMessage = medunnaPages.emailBoxinvalidFeedback.getAttribute("class");
        String expectedEmailMessage = "text-danger form-group";

        Assert.assertTrue("Email giris testi basarisiz", actuelEmailMessage.equals(expectedEmailMessage));
    }


    @And("New password kutusuna en az bir kucuk harf iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir")
    public void newPasswordKutusunaEnAzBirKucukHarfIcerenPasswordYazildigindaPasswordStrengthSeviyesininArttigiDogrulanir() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waiting(2);
        actions.click(medunnaPages.regPasswordBox).sendKeys(ConfigReader.getProperty("PasswordKucukHarfli")).perform();
        Driver.waiting(1);
        int actuelPasswordLevel = medunnaPages.passwordStrengthLevel();
        Assert.assertTrue("Password strenght seviyesi artmadi", actuelPasswordLevel > 1);
        System.out.println(actuelPasswordLevel);
    }

    @And("New password kutusuna en az bir buyuk harf iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir")
    public void newPasswordKutusunaEnAzBirBuyukHarfIcerenPasswordYazildigindaSeviyesininArttigiDogrulanir() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waiting(2);
        actions.click(medunnaPages.regPasswordBox).sendKeys(ConfigReader.getProperty("PasswordBuyukHarfli")).perform();
        Driver.waiting(1);
        int actuelPasswordLevel = medunnaPages.passwordStrengthLevel();
        Assert.assertTrue("Password strenght seviyesi artmadi", actuelPasswordLevel > 1);
        System.out.println(actuelPasswordLevel);
    }


    @And("New password kutusuna en az bir rakam iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir")
    public void newPasswordKutusunaEnAzBirRakamIcerenPasswordYazildigindaSeviyesininArttigiDogrulanir() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waiting(2);
        actions.click(medunnaPages.regPasswordBox).sendKeys(ConfigReader.getProperty("PasswordRakamli")).perform();
        Driver.waiting(1);
        int actuelPasswordLevel = medunnaPages.passwordStrengthLevel();
        Assert.assertTrue("Password strenght seviyesi artmadi", actuelPasswordLevel > 1);
        System.out.println(actuelPasswordLevel);
    }


    @And("New password kutusuna en az bir ozel karakter iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir")
    public void newPasswordKutusunaEnAzBirOzelKarakterIcerenPasswordYazildigindaSeviyesininArttigiDogrulanir() {

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waiting(2);
        actions.click(medunnaPages.regPasswordBox).sendKeys(ConfigReader.getProperty("PasswordOzelKarakterli")).perform();
        Driver.waiting(1);
        int actuelPasswordLevel = medunnaPages.passwordStrengthLevel();
        Assert.assertTrue("Password strenght seviyesi artmadi", actuelPasswordLevel > 1);
        System.out.println(actuelPasswordLevel);
    }


    @And("New password kutusuna yedi karakterden kisa giris yapilamadigi dogrulanir")
    public void newPasswordKutusunaYediKarakterdenKisaGirisYapilamadigiDogrulanir() {
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.waiting(2);
        actions.click(medunnaPages.regPasswordBox)
                .sendKeys(ConfigReader.getProperty("PasswordAltiKarakterli")).sendKeys(Keys.TAB).perform();
        Driver.waiting(2);
        String actuelPasswordMessage = medunnaPages.passwordInvalidFeedback.getAttribute("class");
        String expectedPasswordMessage = "text-danger form-group";

        Assert.assertEquals("6 karakterden az sifreleri kabul ediyor", expectedPasswordMessage, actuelPasswordMessage);
    }

    @And("Sing-in secenegine tiklanir")
    public void singInSecenegineTiklanir() {
        medunnaPages.signin.click();
    }

    @And("Username kutusuna {string} girilir")
    public void usernameKutusunaGirilir(String username) {
        medunnaPages.signInUsernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @And("Password kutusuna {string} girilir")
    public void passwordKutusunaGirilir(String arg0) {
        medunnaPages.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Sign-in butonuna basilir")
    public void signInButonunaBasilir() {
        medunnaPages.singinButonu.click();
    }

    @And("Basarili sekilde giris yapilabildigi dogrulanir")
    public void basariliSekildeGirisYapilabildigiDogrulanir() {
        Assert.assertTrue("Basarili sekilde oturum acilamadi", medunnaPages.administrationIcon.isDisplayed());
    }


    @And("Acilan pencerede Remember me secenegi oldugu dogrulanir")
    public void acilanPenceredeRememberMeSecenegiOlduguDogrulanir() {
        Driver.waiting(2);
        Assert.assertTrue("Remember me secenegi gorulemedi", medunnaPages.rememberMeOption.isDisplayed());
    }

    @And("Acilan pencerede Did you forget your password? secenegi oldugu dogrulanir")
    public void acilanPenceredeDidYouForgetYourPasswordSecenegiOlduguDogrulanir() {
        Driver.waiting(2);
        Assert.assertTrue("Did you forget your password", medunnaPages.didYouForgetYourPasswordOption.isDisplayed());
    }

    @And("Acilan pencerede You don't have an account yet? Register a new account secenegi oldugu dogrulanir")
    public void acilanPenceredeYouDonTHaveAnAccountYetRegisterANewAccountSecenegiOlduguDogrulanir() {
        Driver.waiting(2);
        Assert.assertTrue("You don't have an account yet", medunnaPages.registerANeAccountOption.isDisplayed());
    }

    @And("Acilan pencerede Cancel butonu oldugu dogrulanir")
    public void acilanPenceredeCancelButonuOlduguDogrulanir() {
        Driver.waiting(2);
        Assert.assertTrue("Cancel secenegi gorulemedi", medunnaPages.cancelOption.isDisplayed());
    }
}
