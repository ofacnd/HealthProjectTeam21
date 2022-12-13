Feature: Hasta hesabi
  @pati
  Scenario: Test Result basliklari
    Given  Kullanici Patient Medunna Url'sine gider
    And   Kullanici Patient oturum açma icin Sign in'e tiklar
    And   Kulanici Patient Username ve password girer
    And   Kullanici Patient Sign in butonuna tiklar
    And   Kullanici Patient MyPages Patient butonuna tiklar
    And   Kullanici Patient My Appoinments butonuna tiklar
    And   Kullanici Patient acilan sayfada Show Test butonuna tiklar
    And   Kullanici Patient acilan safyada iew esult utonuna tiklar
    And   Kullanici Patient sayfada Test Result basligi altina id,name,default max,min value,test date,descriptio gorunulurlugunu dogrular
    And   Kullanici sayfayi kapatir

  @invoice
  Scenario: Hasta faturayi gorur

    Given Kullanici Patient Medunna Url'sine gider
    And   Kullanici Patient oturum açma icin Sign in'e tiklar
    And   Kulanici Patient Username ve password girer
    And   Kullanici Patient Sign in butonuna tiklar
    And   Kullanici Patient MyPages Patient butonuna tiklar
    And   Kullanici Patient My Appoinments butonuna tiklar
    And   Kullanici Patient acilan sayfada Showinvoice butonuna tiklar
    And   Kullanici Patient acilan safyada Invoice basliginin gorunulurlugunu dogrular ekran goruntusunu alir