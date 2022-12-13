@UIDBAPI
Feature: UI_DB_API Dogrulama testleri

  Scenario:Admin Tüm bilgileri doldurulmalıdır.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Item&title basligina tiklar
    And   Item&title basligidan staff secer
    And   Create a new Staff butonuna tiklar
    And   SSN kutucuguna gecerli SSN yazar
    And   Use Search kutucugunu secili hale getirir
    And   Gerekli bilgileri doldurur
    And   Save butonuna tiklar
    And   Sayfayi kapatir

  Scenario Outline: kullanici db test
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|first_name|

  Scenario: Staff bilgileri Api Testi ile dogrulandi
    Given Admin staff bilgilerini alir
    Then  Admin staff bilgilerini Api Testi ile dogrular

  Scenario:Admin Tüm bilgileri doldurulmalıdır.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Item&title basligina tiklar
    And   Item&title basligidan staff secer
    And   acilan sayfadan ilgili kullanici icin Edite tiklar
    And   kullanici bilgilerini duzenler
    And   Admin save butonuna tiklar
    And   Admin A Staff is updated with identifier yazisini gorur
    And   Sayfayi kapatir

  Scenario Outline: Admin kullanıcı bilgilerinin guncellendigini dogrular.
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerinin guncellendigini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|first_name|

  Scenario:Admin Tüm bilgileri doldurulmalıdır.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Item&title basligina tiklar
    And   Item&title basligidan staff secer
    And   Admin acilan sayfada Delete butonuna tiklar
    And   Admin Confirm delete operation kutusundan delete butonuna tiklar
    And   A staff is deleted with identifier yazisini gorur
    And   Sayfayi kapatir


  Scenario Outline: Admin kullanıcı bilgilerinin silindigini dogrular
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerinin silindigini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|id|