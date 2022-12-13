Feature: Staff API Test

  @API19
  Scenario: Staff bilgileri Api Testi ile dogrulandi
    Given Admin staff bilgilerini alir
    Then  Admin staff bilgilerini Api Testi ile dogrular

  @API19ID
  Scenario: Staff bilgileri Api Testi ile dogrulandi
    Given Admin staff ID bilgilerini alir
    Then  Admin staff ID bilgilerini Api Testi ile dogrular