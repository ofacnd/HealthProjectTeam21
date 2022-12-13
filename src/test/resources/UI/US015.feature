Feature: US15  Admin tarafindan hasta olusturma ve duzenleme/ Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)


  @US15TC01
  Scenario: Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    Then  Admin patient butonuna tiklar
    Then Create a new patient butonuna tiklar
    And First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state  City gibi hasta bilgilerini doldurur
    Then Patient sayfasindaki Save butonuna tiklar
    Then A new patient is created with identifier yazisinin ciktigini gorur

  @US15TC02
  Scenario: TC_0002 Yönetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address,
  Description, Created Date, User, Country and state / City" gibi hasta bilgilerini görebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    Then  Admin patient butonuna tiklar
    And  Admin ilgili hastanin view butonuna tiklar
    And SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group,Address, Description, Created Date,
    And User, Country and state  City gibi hasta bilgilerini gordugunu dogrular.


  @US15TC03
  Scenario: TC_0003 Hasta oluşturulduğunda veya güncellendiğinde yukarıdaki öğelere data girişi yapılabilmeli
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    Then  Admin patient butonuna tiklar
    And   Admin ilgili hastanin Edit butonuna tiklar
    And   Admin ilgili alanları gunceller
    And  Admin patient sayfasindaki Save butonuna tiklar
    And Admin guncellendigine dair patient is updated with identifier yazisinin cittigini gorur.


  @US15TC04
  Scenario: TC_0004  Hastaya doktoru sadece Admin atayabilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin appointmeni  butonuna tiklar
    And Admin appointment sayfasindaki edit butonuna tiklar
    And physician boxe tan doktor secer
    And Patient sayfasindaki Save butonuna tiklar
    And  Admin guncellendigine dair The appointment is updated with identifier yazisini gorur.

  @US15TC05
  Scenario: TC_0005  "Country", "US state" olmalı ve boş bırakılmamalı
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    Then  Admin patient butonuna tiklar
    Then Create a new patient butonuna tiklar
    And Country and state  City gibi hasta bilgileri girilmesi zorunludur

  @US15TC06
  Scenario:   TC_0006  Yönetici herhangi bir hastayı silebilir
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    And Administration select bolumu tiklar
    And Admin User management butonuna tiklar
    And herhangi bir hastanin delete butonuna tiklar
    And acilan boxta Delete butonuna tiklar
    And A patient is deleted with idenfier yazisinin ciktigini dogrular.
