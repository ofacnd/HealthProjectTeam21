Feature: US001DBTest

  @DB001Test
  Scenario: DB ile SSN kimliklerini doğrulayın.
    Given : Kullanici API yardimi ile kayitli kisiler olusturur
    And : API ile olusturulan kisilerin ssn bilgilerinin DB ile dogrular