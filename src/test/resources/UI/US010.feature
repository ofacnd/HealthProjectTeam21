@medunna010
Feature: US_010 Doktor(Doktor) Randevularım Randevuları API ve DB ile doğrulayın

  Scenario: TC001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given  Kullanici "medunnaUrl" sayfasine gider
    Then   Kullanici oturum acma icin Sign in'e tiklar
    And    Kullanici Doktor bilgileri ile giris yapar
    And    Kullanici Sign in butonuna tiklar
    And    Kullanici  MY PAGES sekmesinde My Appointments butonuna tiklar
    And    Kullanici Appointments sayfasina girdigini kontrol eder

    And    Kullanici Randevu listesini gorebilmelidir
    And    Kullanici zaman dilimlerini gorebilmelidir
    And    Kullanici sayfayi kapatir