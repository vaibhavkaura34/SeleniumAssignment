Feature: The user wants to login

  @Smoke
  Scenario Outline: logging in with valid credentials
    Given The user is at home page
    When he clicks on login button
    And enters the credentials '<email>' and '<password>'
    Then the user gets logged in

    Examples: 
      | email             | password |
      | kaura@gmail.com   | abcdef   |
      | stephen@gmail.com | abcd     |
