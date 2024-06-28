Feature: Orange
  Scenario: Login into Orange Hrm Webpage
    Given User launch the browser
 And User enter the username "<Admin>" and password "<admin1234>"
When Click on the login button
    Then It will display the title as "<OrangeHRM>"
    Then Clickon logout button