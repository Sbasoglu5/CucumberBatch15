Feature: Employee
  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    And user clicks on add employee button
  @smoke
  Scenario: Adding a new Employee
    #When user enters valid email and valid password
    #And click on login button
    #When user clicks on PIM option
    #And user clicks on add employee button
    And user enters firstname and middlename and lastname
    #And user clicks on save button

  @testcase11
  Scenario: adding the employee from frontend and verifying it from backend
    And user enters "nesha" and "sania" and "standart"
    And user captures the employee id
    And user clicks on save button
    And query the in information in backend
    Then verify the results from frontend and backend

