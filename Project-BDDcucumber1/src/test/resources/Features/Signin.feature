Feature: Store Signin
 #https://www.rediff.com/

  Background:
    Given I navigate to the login page
    When I clicked signin link

  @SC1
  Scenario Outline: Login with correct username and correct password
    And I entered "<userName>" and "<password>"
    Then I clicked signin button

    Examples:
      | userName | password |
      | user     | pass   |

  @SC2
  Scenario Outline: Login fails with invalid username
    But User enters invalid "<userName>" and correct "<password>"
    Then I clicked signin button

    Examples:
      | userName | password |
      | $$12      | pass12   |

  @SC3
  Scenario Outline: Login fails with invalid password
    But User enters correct "<userName>" and invalid "<password>"
    Then I clicked signin button

    Examples:
      | userName | password |
      | user1     | $$12     |
