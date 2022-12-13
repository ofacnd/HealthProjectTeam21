@US11
Feature: Login Giris
  @US011_TC001
  Scenario: US011 TC_001
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Doktor gecerli bir Username girer
    And   Doktor gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Doktor My Appointments butonuna tiklar
    And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
    And   Doktor “Create or Edit an Appointment” yazisinin gorunur oldugunu dogrular.

  @US011_TC002
  Scenario: US011 TC_002
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Doktor gecerli bir Username girer
    And   Doktor gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Doktor My Appointments butonuna tiklar
    And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
    And   Doktor “id, start date, end date, Status, physician” bilgilerinin gorunur oldugunu dogrular.

  @US011_TC003
  Scenario: US011 TC_003
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Doktor gecerli bir Username girer
    And   Doktor gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Doktor My Appointments butonuna tiklar
    And   Doktor Ekrana gelecek Appointments listesinden ilkindeki EDIT butonuna tiklar.
    And   Doktor,  Anamnesis, Treatment ve Diagnosis alanlarinin alt kisimlarinda “This field is required.” uyari yazisinin belirdigini ve bu nedenle bu alanlarin bos birakilamayacagini dogrular.
    And   Ayni durumda “Prescription” ve “Description” alanlarinin alt kisminda “This field is required.” uyarisinin yer almadigini ve bu nedenle bu alanlarin bos birkilabilecegini dogrular.
    And   Anamnesis, Treatment ve Diagnosis Text Box`larina gerekli verileri girer.

  @US011_TC004
  Scenario: US011 TC_004
    Given Admin www.medunna.com adresine gider
    Then  Giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Doktor gecerli bir Username girer
    And   Doktor gecerli bir password girer
    And   Sign in butonuna tiklar
    And   Doktor My Appointments butonuna tiklar
    And   Doktor Ekrana gelecek Appointments listesinden ucuncu EDIT butonuna tiklar.
    And   Doktor “Status” alanina tiklayarak "PENDING, COMPLETED veya CANCELLED" seceneklerinden birini secer.
