Feature: Searching the employee

  @smoke
  Scenario: Search Employee by Id
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    When user enters valid employee Id
    And clicks on search button
    And user sees employee information displayed

  @smoke
  Scenario: Search Employee by Job Title
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    When user selects job title
    And clicks on search button
    And user sees employee information displayed

