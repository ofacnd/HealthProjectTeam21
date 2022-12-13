Feature: Registration sayfasında güçlü şifre girilmeli ve"Password strength" seviyeleri görülebilmelidir.

  Background: Register sayfasina gidis
    Given "www.medunna.com" adresine gidilir
    And Account Menu butonuna tiklanir
    And Register secenegine tiklanir

  @US003Test
  Scenario: Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength" seviyesinin değiştiği görülebilmelidir.
    And New password kutusuna en az bir kucuk harf iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir

  @US003Test
  Scenario:Şifre en az 1 büyük harf içermeli ve "Password strength" seviyesinin değiştiği görülebilmelidir.
    And New password kutusuna en az bir buyuk harf iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir

  @US003Test
  Scenario: Şifre en az 1 rakam içermeli ve "Password strength" seviyesinin değiştiği görülebilmelidir.
    And New password kutusuna en az bir rakam iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir

  @US003Test
  Scenario: Şifre en az 1 özel karakter içermeli ve"Password strength" seviyesinin değiştiği görülebilmelidir.
    And New password kutusuna en az bir ozel karakter iceren password yazildiginda Password strength seviyesinin arttigi dogrulanir

  @US003Test
  Scenario: Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır.
    And New password kutusuna yedi karakterden kisa giris yapilamadigi dogrulanir

