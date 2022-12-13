@US17
Feature: US17 Test items(oge) Olustur / Guncelle / Sil

  @US17TC01
  Scenario: Admin yeni test ogeleri olusturabilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Test Item secenegine tiklar
    And   Create a new Test Item butonuna tiklar
    And   Istenilen bilgileri doldurur ve Save butonuna tiklar
    And   Kaydedildi yazisinin gorunurlugunu kontrol eder
    And   Sayfayi kapatir

  @US17TC02
  Scenario: Admin, "test items; Name, Description, price Default min value, Default max value ve
  created date (Gün/Ay/Yıl) güncelleyebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Test Item secenegine tiklar
    And   Urunun bulundugu sayfaya gider
    And   Urundeki edit butonuna tiklar
    And   Belirtilen degerlerde guncelleme yapar ve Save butonuna tiklar
    And   Kaydedildi yazisinin gorunurlugunu kontrol eder
    And   Sayfayi kapatir

  @US17TC03
  Scenario: Admin test ogelerini goruntuleyebilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Test Item secenegine tiklar
    And   Urunun bulundugu sayfaya gider
    And   Urundeki view butonuna tiklar
    And   Acilan sayfada urunun isminin goruldugunu dogrular
    And   Sayfayi kapatir

  @US17TC04
  Scenario: Admin test ogelerini silebilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Test Item secenegine tiklar
    And   Urunun bulundugu sayfaya gider
    And   Urundeki delete butonuna tiklar
    And   Acilan pencerede tekrar delete butonuna tiklar
    And   Silindi yazisinin gorunurlugunu kontrol eder
    And   Sayfayi kapatir
