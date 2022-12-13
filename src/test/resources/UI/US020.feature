

Feature: US20  Admin; "User management" menüsünden, kullanıcı Active eder ve gerekli rolleri oluşturur.

  @US20TC01
  Scenario:Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Administration basligina tiklar
    And   Admin User Managementa tiklar
    And   Admin View kutucuguna tiklar
    And   Admin kayitli kisilerin first name, Last name, email gibi bilgilerini gorur
    And   Sayfayi kapatir



  @US20TC02
  Scenario:Admin kullanıcılıar aktive edebilir ve rollerini "ADMIN, USER, PATIENT, STAFF ve PHYSICIAN" olarak atayabilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Administration basligina tiklar
    And   Admin User Managementa tiklar
    And   Admin Edite tiklar
    And   Activated kutusunu isaretler
    And   Admin Edit kısmından Admin, User, Patient, Staff ve Physician rollerinden birini atayabilir.
    And   Save butonuna tiklar
    And   A user is updated with identifier staff yazisini gorur.
    And   Sayfayi kapatir


  @US20TC03
  Scenario:Admin kullanicilari silebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Administration basligina tiklar
    And   Admin User Managementa tiklar
    And   Admin sectigi kullaniciyi silebilmek icin DELETE butonuna tiklar
    And   A user is deleted with identifier yazisini gorur.
    And   Sayfayi kapatir