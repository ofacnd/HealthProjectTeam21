Feature: Dta base ile dogrulama
  @db16
  Scenario Outline: Yeni room kuruldugu Database Testi ile dogrulandi
    Given Kullanci connection baglantisi kurar
    And   Kullanici tum room kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici room bilgilerini Database Testi dogrular

    Examples: test verileri
      | query                 | columnName |
      | SELECT * FROM room | room_number       |

