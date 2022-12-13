Feature: UI_18

  @DB18
  Scenario Outline: Doktor bilgileri Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici doktor bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici doktor bilgilerini Database Testi ile dogrular

    Examples: test verileri
      | query                         | columnName |
      | SELECT * FROM physician where | id=393813  |