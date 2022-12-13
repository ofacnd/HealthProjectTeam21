Feature: US_025 Hata Portalini Kullanarak Yeni Randevu Alabilir

  Background: Ortak adimlar
    Given Admin www.medunna.com adresine gider
    And  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Hasta gecerli bir Username girer
    And   Hasta gecerli bir password girer
    And   Sign in butonuna tiklar
    And  My Pages butonuna tiklar

  Scenario: TC_001, TC_002, TC_003, TC_004

    When  Make An Appointment'e tiklar
    Then  Hasta Firstname yazar bos birakilamadigini dogrular
    And  Hasta Lastname yazar bos birakilamadigini dogrular
    And  Hasta SSN yazar bos birakilamadigini dogrular
    And  Hasta Email yazar bos birakilamadigini dogrular
    And Sayfayi kapatir

  Scenario: TC_005
    When  Make An Appointment'e tiklar
    Then  Hasta Phone yazar bos birakilamadigini dogrular telefon numarasi ucuncu ve altinci rakamdan sonra - icermeli
    And Sayfayi kapatir


  Scenario: TC_006
    # Kullanıcı randevu alıp kaydolduğunda profillerini görebilir ve uygulamada oturum açabilir
    When My Appointments'e tiklar
    Then Hasta randevularinin kaydedildigini dogrular
    And Sayfayi kapatir


  Scenario: TC_007
    When  Make An Appointment'e tiklar
    Then Yazili olan tarihin gun-ay-yil seklinde oldugunu dogrular

  Scenario: TC_008
    When  Make An Appointment'e tiklar
    Then Hasta phone yazar
    And Gecerli tarih girilmesi gerektigini dogrular

  Scenario: TC_009 (Negatif Test)
    When  Make An Appointment'e tiklar
    Then Gecmis tarih girilemedigini dogrular




