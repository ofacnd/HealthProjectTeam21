Feature: Appointment dogrulama

  @API010
  Scenario: Appointment bilgileri Api Testi ile dogrulandi
    Given Admin Appointment bilgilerini alir
    Then  Admin Appointment bilgilerini Api Testi ile dogrular

  @API010ID
  Scenario: Appointment bilgileri Api Testi ile dogrulandi
    Given Admin Appointment ID bilgilerini alir
    Then  Admin Appointment ID bilgilerini Api Testi ile dogrular