Feature: Admin olarak; Hasta bilgilerini dogrulama
  @DB15A
  Scenario Outline: kullanici db test
    Given Kullanci connection kuarar
    And   Kullanici hasta bilgilerini ceker "<query>" ve "<columnName>"
    Then  Kullanici hasta bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM patient|email|