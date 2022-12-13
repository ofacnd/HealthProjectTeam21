Feature: Admin olarak; Yeni Staff (Personel) Oluşturma / Güncelleme / Görüntüleme ve Silme
  @DB19A
  Scenario Outline: kullanici db test
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|first_name|


  @DB19B
  Scenario Outline: Admin kullanıcı bilgilerinin guncellendigini dogrular.
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerinin guncellendigini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|first_name|


  @DBTest19C
  Scenario Outline: Admin kullanıcı bilgilerinin silindigini dogrular
    Given Kullanci connection kurar
    And   Kullanici tum yeni staff kayitli bilgileri ceker "<query>" ve "<columnName>"
    Then  Kullanici staff bilgilerinin silindigini dogrular

    Examples: test verileri
      |query    |columnName|
      |SELECT * FROM staff|first_name|
