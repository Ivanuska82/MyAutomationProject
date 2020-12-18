Feature:  Login feature.
  As user I want to login because otherwise how do I use this aoo

  Scenario: Basic login
    Given user is on the landing page
    When  user enters credentials
    And user clicks login button
    Then user supposed to see welcome message