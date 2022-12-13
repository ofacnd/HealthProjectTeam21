Feature: UI_DB_API

  @DB27DBO
  Scenario Outline: Mesajlar DB testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum mesaj bilgilerini ceker "<query>" ve "<columnName>"
    Then  Kullanici mesaj bilgilerini Database Testi ile dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM cmessage | email       |