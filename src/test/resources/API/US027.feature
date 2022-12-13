Feature: Api Test

  @API27Get
  Scenario: Yeni mesaj Api Testi ile dogrulandi
    Given Kullanci mesaj bilgilerini alir
    Then  Kullanici mesaj bilgilerinin alindigini Api Testi ile dogrular

  @API27Post
  Scenario: Yeni mesaj Api Testi ile dogrulandi
    Given Kullanci post ile mesaj olusturur
    Then  Kullanici post islemi ile Api Testini dogrular

  @API27Put
  Scenario: Yeni mesajin guncellendigini Api Testi ile dogruladi
    Given Kullanci put ile mesaj guncellenir
    Then  Kullanici put islemi ile Api Testini dogrular

  @API27Delete
  Scenario: Mesajin silindigi Api Testi ile dogrulandi
    Given Kullanci delete islemi mesaji siler ve Api ile dogrular

