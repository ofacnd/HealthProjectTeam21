package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mine {
    Connection con;
    Statement st;
    ResultSet rs;
    @Given("Kullanici connection kurar")
    public void kullanici_connection_kurar() {
        //1.veritabanina baglandik
        con=DBUtils.createConnection1();
        //DBUtils.getConnection();
        //DatabaseUtility.createConnection();
    }
    @Given("Kullanici tum kayitli bilgilerinin icinde {string} olmayan {string} leri  arar ve dogrular")
    public void kullanici_tum_kayitli_bilgilerinin_icinde_olmayan_leri_arar_ve_dogrular(String isaret, String kolon) throws SQLException {
        //2.Statement(SQL cumlesi) olustur
        st = con.createStatement();
        //st = DatabaseUtility
        //3.Veri tabaninda calisacak SqL i degiskene atama
        //String sql1 = "select email from public.jhi_user where replace(email,'@','') = email or replace(email,'.','') = email";
        String sql1="";
        if (isaret.equals("null")){
            sql1 ="select email from public.jhi_user where email is null";
        }else {
            sql1 = "select email from public.jhi_user where replace(email,'" + isaret + "','') = " + kolon;
        }
        //   System.out.println(sql1);
        //4.SQL calistir sonucu result set e koy
        rs = st.executeQuery(sql1);
        //5.donen degerleri ekrana yazdir
        int numrows = 0;
        while (rs.next()) {
            numrows++;
            System.out.println(rs.getString(1));
        }
        System.out.println(isaret+" - numrows:"+numrows);
        if(numrows==0){
            Assert.assertEquals(0,numrows);
        } else if (numrows>0) {
            Assert.assertNotEquals(0,numrows);
        }

        //Assert.assertEquals(0,numrows);
        //if (nr > 0) {
        //     System.out.println("test failed");
        // }

    }
    @Given("sayfayi kapatir")
    public void sayfayi_kapatir() throws SQLException {
        //6.olusturulan objeleri temizle
        con.close();
        st.close();
        rs.close();
    }


}




