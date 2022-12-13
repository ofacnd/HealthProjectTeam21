Feature: US18
  @US1818
  Scenario: US18 get
    Given user sends a get request for physician data
    And   user gets the physician data and validates

  @US1818ID
  Scenario: US18 get
    Given user sends a get request for 393813 physician data
    And   user gets the physician 393813 data and validates