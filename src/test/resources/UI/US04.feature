Feature: Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Background: Sing-in sayfasina gidis
    Given "www.medunna.com" adresine gidilir
    And Account Menu butonuna tiklanir
    And Sing-in secenegine tiklanir

  @US004Test
  Scenario: Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır.
    And Username kutusuna "username" girilir
    And Password kutusuna "password" girilir
    And Sign-in butonuna basilir
    And Basarili sekilde giris yapilabildigi dogrulanir

  @US004Test
  Scenario: Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği, "Remember me" seçeneği olmalıdır
    And Acilan pencerede Remember me secenegi oldugu dogrulanir

  @US004Test
  Scenario: Eğer şifre unutulursa diye "Did you forget your password?" seçeneği olmalıdır.
    And Acilan pencerede Did you forget your password? secenegi oldugu dogrulanir

  @US004Test
  Scenario: "You don't have an account yet? Register a new account" seçeneği olmalıdır.
    And Acilan pencerede You don't have an account yet? Register a new account secenegi oldugu dogrulanir

  @US004Test
  Scenario: "Cancel" seçeneği olmalıdır.
    And Acilan pencerede Cancel butonu oldugu dogrulanir

