package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.getColumnData;

public class Msk {
    List<Object> appointmentList;
    @And("Kullanici appointment bilgilerini ceker {string} ve {string}")
    public void kullaniciAppointmentBilgileriniCekerVe(String query, String columnName) {
        appointmentList = getColumnData(query, columnName);
    }

    @Then("Kullanici appointment bilgilerini dogrular")
    public void kullaniciAppointmentBilgileriniDogrular() {
        assertTrue("Data match etmedi",
                appointmentList.toString().contains(ConfigReader.getProperty("appointmentId")));
    }
}
