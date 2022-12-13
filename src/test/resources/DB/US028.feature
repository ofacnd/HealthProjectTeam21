Feature: UI_DB_API

  @DB28DBO
  Scenario Outline: Yeni ulke kuruldugu Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici yeni ulke bilgilerini Database Testi ile dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM country | name       |


  @DB28DBS
  Scenario Outline: Ulkenin silindigi Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum yeni kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici silinen ulke bilgisini Database Testi ile dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM country | name       |


  @DB17
  Scenario Outline: Test Item Database Testi ile dogrulandi
    Given Kullanci connection kurar
    And   Kullanici tum kayitli test bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici test_item bilgisini Database Testi ile dogrular


    Examples: test verileri
      | query               | columnName |
      | SELECT * FROM staff | first_name |