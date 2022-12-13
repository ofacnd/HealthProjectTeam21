@medunna008
Feature: US_010 Doktor(Doktor) Randevularım Randevuları API ve DB ile doğrulayın

  Scenario: TC001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given  Kullanici "medunnaUrl" sayfasine gider
    Then   Kullanici oturum acma icin Sign in'e tiklar
    And    Kulanici Username ve pasword girer
    And    Kullanici Sign in butonuna tiklar
    And    Kullanici giris yaptigini dogrular
    And    Kullanici isminin ustune tiklar ve Pasword sekmesine gider
    And    Kullanici Current Pasword'u girer
    And    Kullanici New pasword 'u girer
    And    Kullanici New pasword Confirmation'u girer

  Scenario: TC002 Daha güçlü şifre için en az 1 küçük harf olmalı ve Password strength: seviyesinin değiştiği görülebilmelidir.
    And    TC_002 Kullanici password icinde en az bir kucuk harf oldugunu dogrular
    And    TC_002 Kullanici password strength: seviyesinin degistigini gormelidir

  Scenario: TC003 Şifre en az 1 büyük harf içermeli ve Password strength: seviyesinin değiştiği görülebilmelidir.
    And    TC_003 Kullanici password icinde en az bir buyuk harf oldugunu dogrular
    And    TC_003 Kullanici password strength: seviyesinin degistigini gormelidir

  Scenario: TC004 Şifre en az 1 rakam içermeli ve Password strength: seviyesinin değiştiği görülebilmelidir.
    And    TC_004 Kullanici password icinde en az bir rakam oldugunu dogrular
    And    TC_004 Kullanici Password strength: seviyesinin degistigini gormelidir

  Scenario: TC005 Şifre en az 1 özel karakter içermeli ve Password strength: seviyesinin değiştiği görülebilmelidir.
    And    TC_005 Kullanici password icinde en az bir ozel karakter oldugunu dogrular
    And    TC_005 Kullanici password strength: seviyesinin degistigini gormelidir

  Scenario: TC006 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır
    And    TC_006 Kullanici password en az yedi karakter oldugunu dogrular
    And    TC_006 Kullanici Save butonuna basarak kaydeder

  Scenario: TC007 Eski şifre kullanılmamalıdır.
    And    TC_007 Kullanici isminin ustune tiklar ve sign out sekmesine gider
    And    TC_007 Kullanici SIGN IN AGAIN butonuna tiklar
    And    TC_007 Kullanici username ve eski paswordu girer
    And    TC_007 Kullanici eski sifre ile giris yapilamadigini test eder
    And    Kullanici sayfayi kapatir