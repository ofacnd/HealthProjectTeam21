Feature: US007
  @US007_TC01
  Scenario: Hastalar randevu tarihi oluşturabilmelidir.
    Given  Admin www.medunna.com adresine gider
    Then   Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And    Hasta gecerli bir Username girer
    And    Hasta gecerli bir password girer
    And    Sign in butonuna tiklar
    And    Kullanici  MY PAGES(PATIENT) butonuna tiklar
    And    Kullanici  MY PAGES Make an Appointment butonuna tiklar
    And    Kullanici tarih secer
    And    Kullanici Send an Appointment Request butonuna tiklar.
    And    Kullanici sol ustte Appointment registration saved! yazisini gorur
