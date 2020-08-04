Future: Google search

Scenario Outline: Search on Google
    Given User is on Google page
    When User enters <text> in search field
    And User click Search button
    Then User clicks <result> link

Examples:
    |text       |result              |
    |"Cucumber" |"Cucumber           |
    |"Gerkin"   |"Gerkin"            |
    |"Webdriver"|"Selenium Webdriver"|