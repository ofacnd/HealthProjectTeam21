
Feature: US016 Oda Oluşturma / Görüntüleme / Güncelleme /Silme (Admin)



  @US16TC01-02
  Scenario: TC_0001 &TC_0002  Admin, yatan hastalar için yeni oda oluşturabilir.   Oda oluşturulurken "Room Number" mutlaka olmalı,
  "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmalı
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Create a new room butonuna tiklar
    And Acilan sayfada gerekli bilgileri doldudurur
    And Create a Room sayfasindaki Save butonuna tiklar
    And islemin gerceklestigine dair cıkan A new room is created with identifier yazisini gorur

  @US16TC03
  Scenario: TC_0003  Oda için "Status" ayarlanabilir olmalı
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Create a new room butonuna tiklar
    And Yonetici Status butonunun tiklanabilir oldugunu gorur.

  @US16TC04
  Scenario: TC_0004  Fiyat eklenebilir olmalı ve boş bırakılamamalı.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Create a new room butonuna tiklar
    And admin price box'i tiklar ve price girisi yapilabilir oldugunu gorur.

  @US16TC05
  Scenario: TC_0005  "Description" isteğe bağlı olarak doldurulmalı.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Create a new room butonuna tiklar
    And Acilan sayfada gerekli bilgileri doldudurur
    And Create a Room sayfasindaki Save butonuna tiklar
    And Description bolumune veri girilmeden kayit yapilabildigini dogrular



  @US16TC06
  Scenario: TC_0006  "Created Date" Gün/Ay/Yıl şeklinde olmalı ve geçmiş tarih seçilememeli
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Create a new room butonuna tiklar
    And Acilan sayfada gerekli bilgileri doldudurur
    And tarih datasi girilir
    And Create a Room sayfasindaki Save butonuna tiklar
    And Tarihin degismedigi dogrulanir


  @US16TC07
  Scenario: TC_0007  Admin aynı tür odaları görebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Room type tiklar
    And Room type lerinin ayni oldugunu gorur.

  @US16TC08
  Scenario: TC_0008  Admin mevcut odaları düzenleyebilir ve güncelleyebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Room sayfasindaki edit Butonunu tiklar

    And Room kutusuna tiklar ve oda degisikli yapar
    And  Create or edit sayfasindaki Save butonuna tiklar
    And Oda turunun degistigine dair cikan yesil uyariyi gorur.

  @US16TC09
  Scenario: TC_0009  Odalar Admin tarafından silinebilir.
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Admin gecerli bir Username girer
    And   Admin gecerli bir password girer
    And   Sign in butonuna tiklar
    Then items&titles select bolumu tiklar
    And Admin room butonuna tiklar
    And Admin son sayfaya gider
    And admin ilgili odanin delete butonunu tklari
    And admin confirm delete operation box'ta delete tiklar
    And Admin delete isleminin gerceklestigine dair A room is deleted with identifier yazisinin ciktigini gorur.
