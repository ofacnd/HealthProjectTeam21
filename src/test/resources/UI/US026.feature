Feature: US_026 Iletisim Mesaji

  Background: Ortak adimlar
    Given Admin www.medunna.com adresine gider

  Scenario: TC_001
    Then Kullanici Concact butonunun tiklanabildigini kontrol eder

  Scenario: TC_002
    When Kullanici Concact butonuna tiklar
    Then Contact name'ini girer
    And Contact email'ini girer
    And Contact subject'ini girer
    And Contact mesaj'ini girer
    Then Mesajin gonderildigini dogrular

