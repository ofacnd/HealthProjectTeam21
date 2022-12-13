package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.Map;

public class Hatice {
    Long id_donustur;
    Map<String,Object> expectedData,actualData;


    @Given("Kullanici Database e baglanir")
    public void kullaniciDatabaseEBaglanir() {
        DatabaseUtility.createConnection();
    }

    @Then("DB ile {string} id nolu randevuyu sorgular")
    public void dbIleIdNoluRandevuyuSorgular(String id) {
        id_donustur= Long.valueOf(id); // DB veri tabanından id Long olarak geri döndüğü için Casting yapıldı.
        String sorgu="select * from public.appointment where id='"+id+"'";
        actualData= new HashMap<>(DatabaseUtility.getRowMap(sorgu));

    }


    @And("DB Bilgilerini dogrular")
    public void dbBilgileriniDogrular() {
        expectedData= new HashMap<>();
        expectedData.put("created_by", "hastabasak");
        expectedData.put("id", id_donustur); // scenario outline dan gelen id Map'a put edildi

        Assert.assertEquals(expectedData.get("created_by"),actualData.get("created_by"));
        Assert.assertEquals(expectedData.get("id"),actualData.get("id"));
    }
}
