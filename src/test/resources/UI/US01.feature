Feature: Kayıt olmak için SSN, First Name ve Last Name bilgileri girilebilmelidir.

  Background: Register sayfasina gidis
    Given "www.medunna.com" adresine gidilir
    And Account Menu butonuna tiklanir
    And Register secenegine tiklanir


  @US001Test
  Scenario:Geçerli bir SSN, 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    And  SSN kutusuna Valid SSN girildiginde Your SSN is invalid uyarisi alinmamali

  @US001Test
  Scenario:SSN boş bırakılamaz.
    And  SSN kutusu bos birakildiginda hata vermeli uyarisi alinmali

  @US001Test
  Scenario:Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır.
    And  First Name kutusu bos birakildiginda Your FirstName is required. uyarisi alinmali.

  @US001Test
  Scenario:Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır.
    And  Last Name kutusu bos birakildiginda Your LastName is required. uyarisi alinmali.