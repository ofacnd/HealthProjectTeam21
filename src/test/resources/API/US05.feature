Feature: Appointment bilgilrini API ile dogrulama
  @USER05API
  Scenario: test Appointment api
    Given user sends a get request for appointment data
    And   user gets the appointment data and validates

  @USER05API2
  Scenario: hasta Kemal Appointment  api
    Given user sends a get request id for appointment data
    And   user gets the appointment data and first name,last name,email validates