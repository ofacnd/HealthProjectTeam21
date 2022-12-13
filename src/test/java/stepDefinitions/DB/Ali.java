package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class Ali {
    List<Object> emailList;

    @And("Kullanici tum mesaj bilgilerini ceker {string} ve {string}")
    public void kullaniciTumMesajBilgileriniCekerVe(String query, String columnName) {
        emailList =getColumnData(query,columnName);
    }

    @Then("Kullanici mesaj bilgilerini Database Testi ile dogrular")
    public void kullaniciMesajBilgileriniDatabaseTestiIleDogrular() {
        Assert.assertTrue(emailList.toString().contains("kemalkurt2929@gmail.com"));

    }
}
