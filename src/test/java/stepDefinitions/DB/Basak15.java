package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.getColumnData;

public class Basak15 {

    List<Object> hastaEmail;
    @And("Kullanici hasta bilgilerini ceker {string} ve {string}")
    public void kullaniciHastaBilgileriniCekerVe(String query, String columnName) {
        hastaEmail = getColumnData(query, columnName);

    }

    @Then("Kullanici hasta bilgilerini dogrular")
    public void kullaniciHastaBilgileriniDogrular() {
        System.out.println(hastaEmail);
        assertTrue("Data match etmedi", hastaEmail.toString().contains(ConfigReader.getProperty("hastaEmails")));

    }
}

