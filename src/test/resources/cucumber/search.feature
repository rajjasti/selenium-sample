Feature: Search Feature File
  @1
  Scenario: Search Google for selenium testing

    Given navigate to google home page
    When user searched for "selenium testing"
    Then search results should be displayed

  @2
  Scenario: Search Google for cucumber testing

    Given navigate to google home page
    When user searched for "cucumber testing"
    Then search results should be displayed


