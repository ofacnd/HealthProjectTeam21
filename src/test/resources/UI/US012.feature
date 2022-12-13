Feature: US012_TC01_TC02
@US012_TC001_TC002
Scenario: US012_TC001_TC002
Given Admin www.medunna.com adresine gider
Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
And   Doktor gecerli bir Username girer
And   Doktor gecerli bir password girer
And   Sign in butonuna tiklar
And   Doktor My Appointments butonuna tiklar
And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
And   Doktor Request A Test Butonuna tiklar.
And   Acilan ekranda "Glucose,Urea,Creatinine,Sodium,Potassium,Total protein,Albumin,Hemoglobin" Seceneklerini bulup sag kisimlarinda yer alan kutucuklari isaretler.
And   Sayfayi kapatir