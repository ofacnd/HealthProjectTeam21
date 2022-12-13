Feature:US005-US006_US007
  @US005_TC01
  Scenario: Kullanıcının herhangi bir karakter içeren "First Name" ,
  "Last Name" , telefon numarasını ve SSN numarasıni  (kayıtlı SSN) ,
  "E mail" yazması gerekir ve boş bırakılamaz.
    Given Admin www.medunna.com adresine gider
    Then Kullanici Make an Appointment butonuna tiklar.
    And Kullanici 2 saniye bekler
    And Kullanici First Name girer.
    And Kullanici Last Name girer.
    And Kullanici SSN girer.
    And Kullanici Email adresi girer.
    And Kullanici Phone number girer.
    And Kullanici Send an Appointment Request butonuna tiklar.
    Then Kullanici sol ustte Appointment registration saaved! yazisini gorur


  @US005_TC02
  Scenario:Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir
  ve uygulamada oturum açabilir.

    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Hasta gecerli bir Username girer
    And   Hasta gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Kullanici sol ust tarafta MY PAGES(PATIENT) profilini gorur.
    And   Sayfayi kapatir
