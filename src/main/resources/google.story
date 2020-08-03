Narrative:
Google search story

Scenario: Search on Google
Given User is on Google page
When User enters '<text>' in search field
When User click Search button
Then User clicks '<result>' link

Examples:
|text |result|
|JBehave|What is JBehave?|
|Gerkin|Gerkin|
|Webdriver|Selenium Webdriver|