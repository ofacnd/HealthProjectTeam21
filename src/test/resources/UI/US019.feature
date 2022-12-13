

Feature: US19 Admin olarak Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme

  @US19TC01
  Scenario:Admin SSN kullanarak; kayıtlı kişiler arasında Staff arayabilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Item&title basligina tiklar
    And   Item&title basligidan staff secer
    And   Create a new Staff butonuna tiklar
    And   Use Search kutucugunu secili hale getirir
    And   SSN kutucuguna gecerli SSN yazar
    And   Islemin basarilgi olduguna dair User found with search SSN yazisini gorur
    And   Sayfayi kapatir


  @US19TC02
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
    And   First name girer
    And   Last name girer
    And   Birthdate girer
    And   Phone number girer
    And   Gender girer
    And   Blood group girer
    And   Adress girer
    And   Description girer
    And   Created Date girer
    And   Username girer
    And   State girer
    And   Country girer
    And   Admin save butonuna tiklar
    And   Sayfayi kapatir


  @US19TC03
  Scenario:Admin kayıtlı kişilerden bir Staff seçebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Item&title basligina tiklar
    And   Item&title basligidan staff secer
    And   Admin idye tiklayarak kayitli kisilerden kullanici secer
    And   Admin kayitli kisilerden kullanici sectigini dogrular
    And   Sayfayi kapatir

  @US19TC04
  Scenario:Admin kullanıcı bilgilerini düzenleyebilir.
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



  @US19TC05
  Scenario:Admin, personeli silebilmeli.
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

