package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import test_data.UserTestData;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.Map;


public class Mustafa {

    @Given(": API ile olusturulan kisilerin ssn bilgilerinin DB ile dogrular")
    public void api_ile_olusturulan_kisilerin_ssn_bilgilerinin_db_ile_dogrular() throws SQLException {

        Map<String, Object> userExpectedDataForDatabase = UserTestData.expectedDataforDB;

        String ssn = (String) userExpectedDataForDatabase.get("ssn");


        String query = "select * from public.jhi_user where ssn='" + ssn + "'";

        DBUtils.createConnection();

        Map<String, Object> actuelData = DBUtils.getQueryResultMap(query).get(0);

        Assert.assertEquals(userExpectedDataForDatabase.get("ssn"), actuelData.get("ssn"));
        Assert.assertEquals(userExpectedDataForDatabase.get("firstName"), actuelData.get("first_name"));
        Assert.assertEquals(userExpectedDataForDatabase.get("lastName"), actuelData.get("last_name"));
        Assert.assertEquals(userExpectedDataForDatabase.get("email"), actuelData.get("email"));

        System.out.println("All Actuel Data For User: " + actuelData);

        DBUtils.closeConnection();
    }


}
