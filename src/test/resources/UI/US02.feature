Feature: Kayıt olmak için email and username bilgileri girilebilmelidir.

  Background: Register sayfasina gidis
    Given "www.medunna.com" adresine gidilir
    And Account Menu butonuna tiklanir
    And Register secenegine tiklanir

  @US002Test
  Scenario: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir Username olmalıdır.
    And Username kutusu bos birakildiginda Your username is required. uyarisi alinmali

  @US002Test
  Scenario: Email adresi "@" ve "." karakterleri olmadan doldurulmamalıdır.
    And  Email kutusuna @ ve . olmadan Email bilgisi yazildiginda This field is invalid uyarisi alinmali

  @US002Test
  Scenario: e-mail boş bırakılamaz.
    And Email kutusu bos birakildiginda This field is invalid uyarisi alinmali