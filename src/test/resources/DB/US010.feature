Feature: Appointment DB testi
  @DB010
  Scenario Outline: Appointment db test
    Given Kullanci connection kuarar
    And   Kullanici appointment bilgilerini ceker "<query>" ve "<columnName>"
    Then  Kullanici appointment bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM appointment|id|