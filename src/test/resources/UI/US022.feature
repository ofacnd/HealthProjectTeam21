Feature:Hasta test sonuclari Staff
  @SSNBOX
  Scenario:SSN ile arama yapabilir
    Given Kullanici Staff www.medunna.com adresine gider
    Then  Kullanici staff giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanici Staff gecerli bir Username girer
    And   Kulanici Staff gecerli bir password girer
    And   Kullanici Staff Sign in butonuna tiklar
    And   Kullanici Staff MyPages butonuna tiklar
    And   Kullanici Staff Search Patient a tiklar Patients sayfasina gelir
    And   Kullanici Staff Patient SSN id numarasi ile arama yapabildigini dogrular
    And   Sayfasini kapatir

  @testsnc
  Scenario: Test sonuclarini gorebilmelidir
    Given Kullanici Staff www.medunna.com adresine gider
    Then  Kullanici staff giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanici Staff gecerli bir Username girer
    And   Kulanici Staff gecerli bir password girer
    And   Kullanici Staff Sign in butonuna tiklar
    And   Kullanici Staff MyPages butonuna tiklar
    And   Kullanici Staff Search Patient a tiklar Patients sayfasina gelir
    And   Kullanici Staff Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer
    And   Kullanici Staff ShowAppointments butonuna tiklar
    And   Kullanici Staff acilan sayfada Show Test butonuna tiklar
    And   Kullanici Staff acilan sayfada Test Result basliginin gorunulurlugunu dogrular
  @fat
  Scenario: Fatura odemesi staff
    Given Kullanici Staff www.medunna.com adresine gider
    Then  Kullanici staff giris yap simgesine ve acilan menude Sign-in secenegine tiklar
    And   Kullanici Staff gecerli bir Username girer
    And   Kulanici Staff gecerli bir password girer
    And   Kullanici Staff Sign in butonuna tiklar
    And   Kullanici Staff MyPages butonuna tiklar
    And   Kullanici Staff Search Patient a tiklar Patients sayfasina gelir
    And   Kullanici Staff Patients sayfasinda test sonucunu gormek istedigi hastanin SSN id sini girer
    And   Kullanici Staff ShowAppointments butonuna tiklar
    And   Kullanici Staff Appointments sayfasinda"" nolu hastanin show test butonuna tiklar
    And   Kullanici Staff acilan Tests sayfasinda nolu id li testin View Results secenegine tiklar
    And   Kullanici Staff acilan Test Result sayfasinda sonuc bilgilerinin"id,date,result,description" gorunulurulugunu dogrular
    And   Staff Test result sayfasindagelen test sonuclarinin edit butonuna tiklar save butona tiklar
    And   Staff  Staff A Patient is updated with identifier yazisinin gorunulurlugunu dogrular ve ekran goruntusunu alir