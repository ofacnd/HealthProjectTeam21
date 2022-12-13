@US07-DB-TC01
Feature:US07

  Scenario Outline: API kullanarak randevular goruntulenebilmelidir.
    Given Kullanici "<ID>" nolu randevuya Get Request yapar
    Then Kullanici "<ID>" id nolu ve kullanici isimli randevu objesi olusturur
    And Kullanici bilgileri dogrular

    Examples:Randevu ID'leri
      | ID     |
      | 365149 |
      | 348708 |
      | 365551 |