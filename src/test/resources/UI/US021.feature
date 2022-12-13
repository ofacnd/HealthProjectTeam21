

Feature: US21 Staff hastalar için randevuları görür

  @US21TC01
  Scenario: Staff sadece randevuları güncelleyebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Staff gecerli bir Username girer
    And   Staff gecerli bir password girer
    And   Sign in butonuna tiklar
    And   My Pages basligina tiklar
    And   Staff My Pages basligi altinda Search Patienta tiklar
    And   Admin sectigi kullanicinin randevularini guncelleyebilmek icin Show Appointments butonuna tiklar
    And   Edit butonuna tiklar
    And   Admin randevu bilgilerini tarih, status, doktor gunceller
    And   Save Butonuna tiklar
    And   The appointment is updated with identifier uyarisini gorur
    And   Sayfayi kapatir



  @US21TC02
  Scenario: Staff "Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)" kısımlarına data girememeli.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Staff gecerli bir Username girer
    And   Staff gecerli bir password girer
    And   Sign in butonuna tiklar
    And   My Pages basligina tiklar
    And   Staff My Pages basligi altinda Search Patienta tiklar
    And   Admin sectigi kullanicinin randevularini guncelleyebilmek icin Show Appointments butonuna tiklar
    And   Edit butonuna tiklar
    And   Staff Status'e tiklar
    And   Staff hasta statusunun unapproved secilebildigini gorur
    And   Staff hasta statusunun cancelled secilebildigini gorur
    And   Staff hasta statusunun pending secilebildigini gorur
    And   Staff hasta statusunun Completed secilemedigini gorur.
    And   Sayfayi kapatir



  @US21TC03
  Scenario: Staff "Anamnesis (Hastalık Geçmişi), Treatment ( Tedavi) veya Diagnosis(Teşhis)" kısımlarına data girememeli.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Staff gecerli bir Username girer
    And   Staff gecerli bir password girer
    And   Sign in butonuna tiklar
    And   My Pages basligina tiklar
    And   Staff My Pages basligi altinda Search Patienta tiklar
    And   Admin sectigi kullanicinin randevularini guncelleyebilmek icin Show Appointments butonuna tiklar
    And   Edit butonuna tiklar
    And   Staff Anemnesis,Treatment veya Diagnosis kisimlarina data girer
    And   Save Butonuna tiklar
    And   Staff Data girilemedigine dair yaziyi gorur
    And   Sayfayi kapatir


  @US21TC04
  Scenario: Staff sadece randevuları güncelleyebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Staff gecerli bir Username girer
    And   Staff gecerli bir password girer
    And   Sign in butonuna tiklar
    And   My Pages basligina tiklar
    And   Staff My Pages basligi altinda Search Patienta tiklar
    And   Admin sectigi kullanicinin randevularini guncelleyebilmek icin Show Appointments butonuna tiklar
    And   Edit butonuna tiklar
    And   Admin doktor bilgilerini gunceller
    And   Save Butonuna tiklar
    And   The appointment is updated with identifier uyarisini gorur
    And   Sayfayi kapatir