package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class Mehmet {
    List<Object> appointmentIDList;
    @Given("Kullanci baglanti kurar")
    public void kullanciBaglantiKurar() {
        createConnection(ConfigReader.getProperty("database_url"),
                ConfigReader.getProperty("database_username"), ConfigReader.getProperty("database_password"));
    }

    @And("Kullanici tum kayitli appointment bilgileri ceker {string} ve {string}")
    public void kullaniciTumKayitliAppointmentBilgileriCekerVe(String query, String columnName) {
        appointmentIDList = getColumnData(query, columnName);
    }

    @Then("Kullanici appointment bilgilerini Database Testi ile dogrular")
    public void kullaniciAppointmentBilgileriniDatabaseTestiIleDogrular() {
        assertTrue(appointmentIDList.toString().contains("373934"));

    }
}
