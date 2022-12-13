@US_002_API
Feature: US_002_Kayıt_olmak_icin_email_and_username_bilgileri_girilebilmelidir.

  @US002_API1
  Scenario Outline: Kullanici_adi_ve_email_api_kullanilarak_dogrulanmalidir
    Given  Kullanici "<endpoint>" icin "BaseUrl"e gider
    Then   Kullanici Status "<code>" alir
    And    Kullanici yaniti "<dogrulama>" yapar
    Examples:
      |endpoint|code|dogrulama|
      |2hasta|200|okuma|
