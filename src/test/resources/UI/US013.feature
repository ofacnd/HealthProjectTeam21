Feature: US_13_TC01_TC02
@US013_TC001
Scenario: US013 TC001
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Staff gecerli bir Username girer
And   Staff gecerli bir password girer
And   Sign in butonuna tiklar
And   Staff “My Pages” butonuna ve ardindan “Search Patient” butonuna tiklar
And   Search Patient Kismindan SSN numarasini aratarak ilgili hastaya ulasir.
And   Show Appointments`a tiklar, ardindan Show Test ve View Results `a tiklayip Test Listesine Ulasir.
And   Her bir test icin Edit butonlarina tiklar.
And   Result ve Description alanlarini doldurup SAVE e tiklar.
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Doktor gecerli bir Username girer
And   Doktor gecerli bir password girer
And   Sign in butonuna tiklar
And   Doktor My Appointments butonuna tiklar
And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
And   Doktor acilan ekranda Show Test Results  butonuna tiklar.
And   Acilan ekranda “View Results” Butonuna tklar.
And   Doktor “default max  value, default min value,  test, description and the date” Bilgilerinin goruntulendigini dogrular.



@US013_TC002
Scenario: Doktor girisi
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Doktor gecerli bir Username girer
And   Doktor gecerli bir password girer
And   Sign in butonuna tiklar
And   Doktor My Appointments butonuna tiklar
And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
And   Acilan ekranda “Request Impatient” Butonuna tklar.
And   Islemin onaylandigina dair Yesil Onay Kutusunun goruntulendigini dogrular..