Feature: Searching the employee

  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
  @smoke
  Scenario: Search Employee by Id
    #Given open the browser and launch HRMS application
    #When user enters valid email and valid password
    #And click on login button
    #When user clicks on PIM option
    When user enters valid employee Id
    And clicks on search button
    And user sees employee information displayed
    #And close the browser

  @smoke
  Scenario: Search Employee by Job Title
    #Given open the browser and launch HRMS application
    #When user enters valid email and valid password
    #And click on login button
    #When user clicks on PIM option
    When user selects job title
    And clicks on search button
    And user sees employee information displayed
    #And close the browser

