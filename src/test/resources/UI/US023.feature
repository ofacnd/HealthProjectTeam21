Feature: Fatura odemesi
  @odeme
  Scenario: Fatura odemesi staff
    Given Kullanicim Staffi www.medunna.com adresine gider
    Then  Kullanicim staffi giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanicim Staffi gecerli bir Username girer
    And   Kulanicim Staffi gecerli bir password girer
    And   Kullanicim Staffi Sign in butonuna tiklar
    And   Kullanicim Staffi MyPages butonuna tiklar
    And   Kullanicim Staffi Search Patient a tiklar Patients sayfasina gelir
    And   Kullanicim Staffi Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer
    And   Kullanicim Staffi ShowAppointments butonuna tiklar
    And   Kullanicim Staffi Appointments sayfasinda nolu hastanin payment invoice butonuna tiklar
    And   Kullanicim staff acilan sayfada Payment Detail basliginin gorunulurlugunu dogrular
    And   Kullanicim staffi Show invoice butonuna tiklayip faturayi olusturur


  @comple
  Scenario: Completed oldugunu dogrula
    Given Kullanicim Staffi www.medunna.com adresine gider
    Then  Kullanicim staffi giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanicim Staffi gecerli bir Username girer
    And   Kulanicim Staffi gecerli bir password girer
    And   Kullanicim Staffi Sign in butonuna tiklar
    And   Kullanicim Staffi MyPages butonuna tiklar
    And   Kullanicim Staffi Search Patient a tiklar Patients sayfasina gelir
    And   Kullanicim Staffi Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer
    And   Kullanicim Staffi ShowAppointments butonuna tiklar
    And   Kullanici staff status durumunun Completed oldugunu dogrular


  @stafim
  Scenario:
    Given Kullanicim Staffi www.medunna.com adresine gider
    Then  Kullanicim staffi giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanicim Staffi gecerli bir Username girer
    And   Kulanicim Staffi gecerli bir password girer
    And   Kullanicim Staffi Sign in butonuna tiklar
    And   Kullanicim Staffi MyPages butonuna tiklar
    And   Kullanicim Staffi Search Patient a tiklar Patients sayfasina gelir
    And   Kullanicim Staffi Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer
    And   Kullanicim Staffi ShowAppointments butonuna tiklar
    And   Kullanicim Staffi Appointments sayfasinda nolu hastanin payment invoice butonuna tiklar
    And   Kullanici Staff Payment Detail sayfasindaki muayene, test urun ucretlerinin sayfada gorundugunu dogrular
    And   Kullanici staff sayfa sonundaki show invoice yazisina tiklar
    And   Kullanici Invoice basligini dogrular