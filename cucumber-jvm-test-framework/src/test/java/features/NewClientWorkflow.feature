Feature:
  As a user
  I want to be able to add new clients in the system
  So that i can add accounting data for that client

  Background:
    Given the user is on login page
    When He chooses to log in
    And He provides the username as friends
    And He provides the password as friends
    And He logs-in

  Scenario: Fill up the user form
    And He selects Mr.
    And He enters firstname as Ross
    And He enters middlename as Geller
    Then He should be taken to the landing page

  Scenario Outline: Fill up the user form as different users
    And He selects Title as <title>
    And He enters firstname as <fname>
    And He enters middlename as <lname>
    Then He should be taken to the landing page
    Examples:
      | title | fname | lname |
      | Mr. | Joey | Tribbiani |
      | Ms. | Phoebe | Buffay  |