@US18
Feature: US18 Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  @US18TC01
  Scenario: Admin, doktorlarin bilgilerini gorebilmelidir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Doktoru goruntule butonuna tiklar
    And   Goruntulendigini dogrular
    And   Sayfayi kapatir

  @US18TC02
  Scenario: Admin, SSN kimliğine göre kayıtlı bir kişiyi seçebilir/arayabilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Create a new Physician butonuna tiklar
    And   Aramak istedigi Doktorun SSN numarasini girer
    And   Doktor bilgilerinin kayitli oldugunu dogrular
    And   Sayfayi kapatir

  @US18TC03
  Scenario: Admin, Doktorların bilgilerini "Edit Butonu" üzerinden düzenleyebilmeli ve
  Firstname, lastname birth date .." bilgileri doldurulabilmeli
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Duzenleme seceneginin aktif oldugunu dogrular
    And   Firstname LastName ve diger bilgileri doldurur
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

  @US18TC04
  Scenario: Admin Doktor için bir uzmanlık alanı seçebilmeli
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Doktoru goruntule butonuna tiklar
    And   Uzmanlik alani secer
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

  @US18TC05
  Scenario: Admin, doktorun profil resmini sağlayabilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Doktoru goruntule butonuna tiklar
    And   Profil resmi atamasi yapar
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

  @US18TC06
  Scenario: Admin, doktorun Muayene ücretini girebilmelidir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Doktoru goruntule butonuna tiklar
    And   Muayene ucretini girer
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

  @US18TC07
  Scenario: Admin mevcut kullanıcılar arasından doktoru seçmelidir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Administration menusunden User management secenegine tiklar
    And   islem yapmak istedigi kullanicida edit butonuna tiklar
    And   Profiles menusunden Doktor secenegine tiklar
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

  @US18TC08
  Scenario: Admin mevcut doktorları silebilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Items&Title menusunden Physician secenegine tiklar
    And   Silmek istedigi doktor icin delete butonuna tiklar
    And   Islemi onaylamak icin acilan pencerede tekrar delete butonuna tiklar
    And   Islemin gerceklestigini dogrular
    And   Sayfayi kapatir

