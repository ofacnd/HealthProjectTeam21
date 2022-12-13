@medunna009
Feature: US_009 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir.

  Scenario: TC001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
    Given  Kullanici "medunnaUrl" sayfasine gider
    Then   Kullanici oturum acma icin Sign in'e tiklar
    And    Kulanici Staff bilgileri ile giris yapar.
    And    Kullanici Sign in butonuna tiklar
    And    Kullanici  MY PAGES sekmesinde Search Patient butonuna tiklar
    And    Kullanici hasta bilgilerini gorebildigini kontrol eder(ekran resmi ile)

  Scenario: TC_002 Kullanıcı bütün hasta bilgilerini "firstname, lastname, birthdate, email, phone, gender, blood group, address, description, user, country and state/city" düzenleyebilmelidir.
    And    Kullanici Edit butonuna tiklar
    And    Kullanici butun hasta bilgilerini duzenleyebilmelidir ve degistigini kontrol eder.
    And    Kullanici Save butonuna tiklar


  Scenario: TC_003 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
    And    Kullanici  MY PAGES sekmesinde Search Patient butonuna tiklar
    And    Patients search kismina 715-15-1515 yazarak arama yapar.
    And    Arama yaptigini kontrol eder
    And    Tum kayit bilgilerinin dolduruldugunu kontrol eder.

  Scenario: TC_006  Kullanıcı herhangi bir hasta bilgisini silebilir.
    And    Kullanici  MY PAGES sekmesinde Search Patient butonuna tiklar
    And    Kullanici Delete butonunun olmadigini kontrol eder.
    And    Kullanici sayfayi kapatir