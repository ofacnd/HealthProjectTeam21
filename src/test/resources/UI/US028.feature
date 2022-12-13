@US28

Feature: US_28 Ulke Olusturma ve Silme

  @US_028_TC001
  Scenario: Kullanici ulke olusturma
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    And items&titles bolumu acilir
    When 1 saniye bekleme
    And Country secenegine tiklar
    When 1 saniye bekleme
    And Create a new Country butonuna tiklar
    When 1 saniye bekleme
    Then Name kismina ulke adini girer
    When 1 saniye bekleme
    And Country-save butonuna  tiklar
    When 1 saniye bekleme
    And Ulke kaydinin basarili sekilde yapildigini dogrular
    When 1 saniye bekleme
    Then Sayfayi kapatir

  @US_028_TC002
  Scenario: Kullanici ulke silme
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    When 1 saniye bekleme
    And items&titles bolumu acilir
    When 1 saniye bekleme
    And Country secenegine tiklar
    When 1 saniye bekleme
    Then Silmek istedigi ulkenin Delete butonuna tiklar
    When 1 saniye bekleme
    And Delete butonuna basma istegini confirm eder
    When 1 saniye bekleme
    Then ulkenin basariyla silindigini dogrular
    When 1 saniye bekleme
    Then Sayfayi kapatir





