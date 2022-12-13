Feature: UI_DB_API
  @DB28DBO
  Scenario Outline: Appointment bilgileri Database Testi ile dogrulandi
    Given Kullanci baglanti kurar
    And   Kullanici tum kayitli appointment bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici appointment bilgilerini Database Testi ile dogrular
    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM appointment | id       |