package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;


public class Basak {

    List<Object> actualDataStaff;

    // @DBTest19A

    @Given("Kullanci connection kurar")
    public void kullanciConnectionKuarar() throws SQLException {
        createConnection(ConfigReader.getProperty("database_url"),
                ConfigReader.getProperty("database_username"), ConfigReader.getProperty("database_password"));
    }

    @And("Kullanici tum yeni staff kayitli bilgileri ceker {string} ve {string}")
    public void kullaniciTumYeniStaffKayitliBilgileriCekerVe(String query, String columnName) {
        actualDataStaff = getColumnData(query, columnName);



    }

    @Then("Kullanici staff bilgilerini dogrular")
    public void kullaniciStaffBilgileriniDogrular() {
        assertTrue("Data match etmedi", actualDataStaff.toString().contains(ConfigReader.getProperty("staffFirstName")));

    }


    // @DBTest19B
    @Then("Kullanici staff bilgilerinin guncellendigini dogrular")
    public void kullaniciKullaniciBilgilerininGuncellendiginiDogrular() {
        System.out.println("actualDataStaff = " + actualDataStaff);

        assertTrue("Data match etmedi", actualDataStaff.contains(ConfigReader.getProperty("staffUpdatedName")));

    }

    // @DBTest19C
    @Then("Kullanici staff bilgilerinin silindigini dogrular")
    public void kullaniciKullaniciBilgilerininSilindiginiDogrular() {
        assertFalse("Data match etmedi", actualDataStaff.contains(ConfigReader.getProperty("staffUpdatedName")));

    }
}

