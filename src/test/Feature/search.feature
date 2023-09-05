Feature:
  Validate the login functionality

  Scenario Outline: Validate the login functionality with all possible values
    Given I am home page
    When I Enter the "<username>" and "<password>"
    Then I should able to login the dashbaord
    Examples:
      | username | password |
      | abc@gmail.com | secret |
      | wel@gmail.com | admin  |

