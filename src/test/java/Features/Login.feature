Feature: Login Feature
  This feature deals with login functionality

  Scenario: Login with correct username and pwd
    Given I navigate to login page
    And Email address as : ross
    And I count digits in my salary : 10000
    And Lambda Java8
    And I enter the following for Login
      | UserName | Password      |
      | admin    | adminPassword |
      | non-admin    | non-adminPassword |
    And I click login button
    Then I should see the userform page


  Scenario Outline: Login scenario outline with correct username and pwd
    Given I navigate to login page
    And I enter <UserName> and <Password>
    And I click login button
    Then I should see the userform page
    Examples:
      | UserName | Password      |
      | joey    | jPassword |
      | chandler    | cPassword |