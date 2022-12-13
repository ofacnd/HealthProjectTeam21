@US27

Feature: US_027 Admin Portal ve Mesaj Yetkileri


  @US_027_TC001
  Scenario: TC001 Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir.
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    And items&titles bolumu acilir
    And Messages bolumune girilir
    And ID-Name-Email-Subject-Message bolumlerinin gorunebilirligi test edilir
    Then Sayfayi kapatir

  @US_027_TC002
  Scenario: Admin, mesajları oluşturabilir, güncelleyebilir, silebilir.
    Given Admin www.medunna.com adresine gider
    When Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And Admin gecerli bir Username girer
    And Admin gecerli bir password girer
    And Sign in butonuna tiklar
    And items&titles bolumu acilir
    And Messages bolumune girilir
    And Mesaj olusturma bolumune girilir
    And Name-Email-Subject-Message bolumleri doldurulur
    And Save butonu ile mesaj kaydi denenir
    Then Mesajin olusmus olmasi denenir
    Then Guncellenecek-silinecek mesajin ID'sine tiklanir
    And Edit butonu ile duzenleme menusu acilir
    And Degisiklik-duzenleme yapilir
    Then Message edit save butonuna tiklanir
    Then Mesaj duzenlemesi denenir
    Then Sayfayi kapatir























