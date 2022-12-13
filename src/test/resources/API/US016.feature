Feature:US016 Oda Olusturma / Goruntuleme / Guncelleme /Silme (Admin)

  @US16TC01api
  Scenario:Kullanici Get Requestile goruntuleyebilir
    Given Kullanici Get ile istegi gonderir.
    And HTTP Durum kodu 200 omalidir.
    And Yanit içerik turu "application/json" olmalidir.



  @US16TC02api
  Scenario: Kullanici post ile yeni Room  olusturabilir
    Given Kullanici Url'ye POST İstegi gonderir.
    Then Kullanici dogrulama islemini yapar
    And Status kodunun 201 oldugunu kontrol eder

  @US16TC03api
  Scenario: Kullanici put ile Room bilgilerini guncelleyebilir
    Given Kullanici Url'ye Put İstegi gonderir.
    And Kullanici duzenledigi room bilgilerini dogrular

  @US16TC04api
  Scenario: Kullanici delete ile Room bilgilerini silebilir
    Given Kullanici Url'ye Delete İstegi gonderir.
    And Kullanici ilgili room bilgilerinin silindigini dogrular.

