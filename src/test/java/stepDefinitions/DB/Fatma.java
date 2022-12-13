package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class Fatma {
    List<Object> actualDataRoom;



    @And("Kullanici tum room kayitli bilgileri ceker {string} ve {string}")
    public void kullaniciTumRoomKayitliBilgileriCekerVe(String query, String columnName) {
        actualDataRoom = getColumnData(query, columnName);
    }

    @Then("Kullanici room bilgilerini Database Testi dogrular")
    public void kullaniciRoomBilgileriniDatabaseTestiDogrular() {

        assertTrue(actualDataRoom.toString().contains("112232"));
    }

    @Given("Kullanci connection baglantisi kurar")
    public void kullanciConnectionBaglantisiKurar() {

        createConnection(ConfigReader.getProperty("database_url"),
                ConfigReader.getProperty("database_username"), ConfigReader.getProperty("database_password"));
    }
}
