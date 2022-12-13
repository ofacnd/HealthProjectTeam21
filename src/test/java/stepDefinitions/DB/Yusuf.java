package stepDefinitions.DB;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigReader;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static org.junit.Assert.*;
import static stepDefinitions.UI.Ali.countryUI;
import static utilities.DatabaseUtility.*;

public class Yusuf {
    static Faker faker = new Faker();

    List<Object> actualDataCountry;
    List<Object> actualDataTest;

    Map<String,Object> actualDataDr;


    @Given("Kullanci connection kurar")
    public void kullanciConnectionKurar() throws SQLException {
        createConnection(ConfigReader.getProperty("database_url"),
                ConfigReader.getProperty("database_username"), ConfigReader.getProperty("database_password"));
    }

    @Given("Kullanici tum yeni kayitli bilgileri ceker {string} ve {string}")
    public void kullanici_tum_yeni_kayitli_bilgileri_ceker_ve(String query, String columnName) {
        actualDataCountry = getColumnData(query, columnName);
    }

    @Then("Kullanici yeni ulke bilgilerini Database Testi ile dogrular")
    public void kullaniciYeniUlkeBilgileriniDatabaseTestiIleDogrular() {
        System.out.println("country = " + countryUI);
        System.out.println("Post islemi sonrasi ulke listesi : "+actualDataCountry);
        assertTrue(actualDataCountry.contains(countryUI));
    }


    @Then("Kullanici silinen ulke bilgisini Database Testi ile dogrular")
    public void kullaniciSilinenUlkeBilgisiniDatabaseTestiIleDogrular() {
        System.out.println("Delete islemi sonrasi ulke listesi : " + actualDataCountry);
        assertFalse(actualDataCountry.contains(countryUI));
    }


    @Then("Kullanici test_item bilgisini Database Testi ile dogrular")
    public void kullaniciTest_itemBilgisiniDatabaseTestiIleDogrular() {
        System.out.println("actualDataTest = " + actualDataTest);
        assertTrue(actualDataTest.toString().contains("372402"));
    }

    @And("Kullanici tum kayitli test bilgileri ceker {string} ve {string}")
    public void kullaniciTumKayitliTestBilgileriCekerVe(String query, String ColumnName) {
        actualDataTest = getColumnData(query, ColumnName);
    }

    @And("Kullanici doktor bilgileri ceker {string} ve {string}")
    public void kullaniciDoktorBilgileriCekerVe(String query, String ColumnName) {
        actualDataDr= getRowMap(query+" "+ColumnName);
    }

    @Then("Kullanici doktor bilgilerini Database Testi ile dogrular")
    public void kullaniciDoktorBilgileriniDatabaseTestiIleDogrular() {
        Map<String,Object> expectedDataDr=new HashMap<>();
        BigDecimal exam_fee = new BigDecimal("7500.00");
        expectedDataDr.put("id",393813L);
        expectedDataDr.put("first_name","yusuf");
        expectedDataDr.put("last_name","demir");
        expectedDataDr.put("phone","2164192071");
        expectedDataDr.put("exam_fee",exam_fee);

        // Validation

        assertEquals(expectedDataDr.get("id"),actualDataDr.get("id"));
        assertEquals(expectedDataDr.get("first_name"),actualDataDr.get("first_name"));
        assertEquals(expectedDataDr.get("last_name"),actualDataDr.get("last_name"));
        assertEquals(expectedDataDr.get("phone"),actualDataDr.get("phone"));
        assertEquals(expectedDataDr.get("exam_fee"),actualDataDr.get("exam_fee"));
    }
}