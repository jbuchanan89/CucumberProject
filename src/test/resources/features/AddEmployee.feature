Feature: Add Employee to HRMS

  Scenario: Add Employee
    When user enters firstname and lasname in the name fields
    And user clicks on save button
    Then user added succesfully

  Scenario: Add Employee with employee id
    When user enters firstname and lasname in the name fields
    Then user enters employee id in the id field
    And user clicks on save button
    Then user added succesfully
