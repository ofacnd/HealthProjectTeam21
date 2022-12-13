Feature: US006
@US006_TC01
Scenario: Kullanıcı bilgileri "firstname, lastname, email" girerken
doldurulan kullanıcı bilgileri olmalıdır

Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Hasta gecerli bir Username girer
And   Hasta gecerli bir password girer
And   Sign in butonuna tiklar
And   Kullanici Medunna sayfasina basarili giris yaptigini dogrular
And   Kullanici Username yazili sekmeye tiklar
And   Kullanici Settings butonuna tiklar
And   Kullanici first name dogrular
And   Kullanici last name dogrular
And   Kullanici email dogrular

@US006_TC02
Scenario: "Firstname"güncelleme seçeneği olmalıdır.
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Hasta gecerli bir Username girer
And   Hasta gecerli bir password girer
And   Sign in butonuna tiklar
And   Kullanici Medunna sayfasina basarili giris yaptigini dogrular
And   Kullanici Username yazili sekmeye tiklar
And   Kullanici Settings butonuna tiklar
And   Kullanici firstname gunceller
And   Kullanici save butonuna tiklar
And   Kullanici Settings saved! yazisin dogrular

@US006_TC03
Scenario: "Lastname"güncelleme seçeneği olmalıdır.
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Hasta gecerli bir Username girer
And   Hasta gecerli bir password girer
And   Sign in butonuna tiklar
And   Kullanici Medunna sayfasina basarili giris yaptigini dogrular
And   Kullanici Username yazili sekmeye tiklar
And   Kullanici Settings butonuna tiklar
And   Kullanici lastname gunceller
And   Kullanici save butonuna tiklar
And   Kullanici Settings saved! yazisin dogrular

@US006_TC04
Scenario: "Email"güncelleme seçeneği olmalıdır.
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Hasta gecerli bir Username girer
And   Hasta gecerli bir password girer
And   Sign in butonuna tiklar
And   Kullanici Medunna sayfasina basarili giris yaptigini dogrular
And   Kullanici Username yazili sekmeye tiklar
And   Kullanici Settings butonuna tiklar
And   Kullanici Email gunceller
And   Kullanici save butonuna tiklar
And   Kullanici Settings saved! yazisin dogrular
