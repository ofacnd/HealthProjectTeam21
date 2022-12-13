Feature: Data testi
@DB
Scenario Outline: Dogru Email kullanimi
Given Kullanici connection kurar
  And Kullanici tum kayitli bilgilerinin icinde "<isareti>" olmayan "<columnName>" leri  arar ve dogrular
  And sayfayi kapatir

  Examples: Email verileri
  |isareti         |columnName|
  |@               |Email    |
  | .              |Email    |
  |null            |Email    |