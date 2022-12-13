Feature: Api Test

  @API28Get
  Scenario: Yeni ulkelerin kuruldugu Api Testi ile dogrulandi
    Given Kullanci "countries" bilgilerini alir
    Then  Kullanici ulke bilgilerinin alindigini Api Testi ile dogrular

  @API28Post
  Scenario: Yeni ulke kuruldugu Api Testi ile dogrulandi
    Given Kullanci post ile "countries" olusturur
    Then  Kullanici post islemini Api Testi ile dogrular

  @API28Put
  Scenario: Yeni ulkenin guncellendigini Api Testi ile dogruladi
    Given Kullanci put ile "countries" guncellenir
    Then  Kullanici put islemini Api Testi ile dogrular

  @API28Delete
  Scenario: Ulkenin silindigi Api Testi ile dogrulandi
    Given Kullanci delete islemi ile ilgili 367591 numarali countryi siler ve Api ile dogrular


  @Api_Get_Post_Put_Delete
  Scenario: Kullanici get,post,put ve delete islemlerinin yapıldigi dogruladi
    Given   Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular


  @Api_Test
  Scenario: Kullanici get,post,put ve delete islemlerinin yapıldigi dogruladi
    Given   Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular clean code