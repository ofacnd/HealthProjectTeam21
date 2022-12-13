Feature:

  @API17GET
  Scenario: Test item bilgileri Api Testi ile dogrulandi
    Given Kullanci test item bilgilerini alir
    Then  Kullanici test item bilgilerinin alindigini Api Testi ile dogrular

  @API17Post
  Scenario: Test item bilgileri Api Testi ile dogrulandi
    Given Kullanci post ile test item olusturur
    Then  Kullanici post islemini test item icin Api Testi ile dogrular

  @API17Put
  Scenario: Yeni ulkenin guncellendigini Api Testi ile dogruladi
    Given Kullanci put ile test item guncellenir
    Then  Kullanici put islemini test item icin Api Testi ile dogrular

  @API17Delete
  Scenario: Test itemin silindigini Api Testi ile dogrulandi
    Given Kullanci delete islemi ile ilgili 367621 numarali test itemi siler ve Api ile dogrular


  @Api_Get_Post_Put_Delete_US17
  Scenario: Kullanici post,put,get ve delete islemlerinin yapıldigini dogruladi
    Given   Kullanici Test Item Uzerinde Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular




##     >>>>>>>>>     US_009      <<<<<<<<<<

  @API09_GET
  Scenario: Staff hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.
    Given Kullanici hasta bilgilerini alir
    Then  Kullanici hasta bilgilerinin alindigini Api Testi ile dogrular

  @Api_Get_Post_Put_Delete_US09
  Scenario: Kullanici post,put,get ve delete islemlerinin yapıldigini dogruladi
    Given   Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular