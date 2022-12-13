Feature:  US_14_TC01_TC02_TC03
  @US014_TC001
Scenario: US014_TC001
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Doktor gecerli bir Username girer
And   Doktor gecerli bir password girer
And   Sign in butonuna tiklar
And   Doktor “My Pages” butonuna ve ardindan “My Inpatients” butonuna tiklar
And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
And   Doctor ID, start and end dates, description, created date, appointment id, status, room ve patient bilgilerini goruntuler.




@US014_TC002_TC003
Scenario: US014_TC002_TC003
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Doktor gecerli bir Username girer
And   Doktor gecerli bir password girer
And   Sign in butonuna tiklar
And   Doktor “My Pages” butonuna ve ardindan “My Inpatients” butonuna tiklar
And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
And   Doktor Acilan sayfada Status kisminda yer alan (UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED) Seceneklerin aktif ve degistirilebilir oldugunu dogrular.
And   Doktor SAVE BUTONUnun tiklanabilir aktif oldugunu dogrular.