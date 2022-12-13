@UI_DB_API
Feature: UI_DB_API Deneme Testi
  Scenario: Yeni ulke kuruldugu UI Testi ile dogrulandi
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    And items&titles bolumu acilir
    And Country secenegine tiklar
    And Create a new Country butonuna tiklar
    Then Name kismina ulke adini girer
    And Country-save butonuna  tiklar
    And Kullanici ulke bilgilerini UI Testi dogrular
    And Sayfayi kapatir

  Scenario Outline: Yeni ulke kuruldugu Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici yeni ulke bilgilerini Database Testi ile dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM country | name       |

  Scenario: Ulkenin silindigi UI Testi ile dogrulandi
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    And items&titles bolumu acilir
    And Country secenegine tiklar
    Then Silmek istedigi ulkenin Delete butonuna tiklar
    And Delete butonuna basma istegini confirm eder
    Then Ulkenin basariyla silindigini dogrular
    Then Sayfayi kapatir

  Scenario Outline: Ulkenin silindigi Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici silinen ulke bilgisini Database Testi ile dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM country | name       |

  Scenario: Kullanici get,post,put ve delete islemlerinin yapıldigi dogruladi
    Given   Kullanici Get,post,put ve delete islemlerinin yapildigini Api Testi ile dogrular