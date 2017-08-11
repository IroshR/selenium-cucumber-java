Feature: Wikipedia Main page
  Navigate to Wikipedia Main page

  Scenario: Wikipedia Main page Search
    Given I navigate to "http://the-internet.herokuapp.com/login"
    When Enter the text to "Software"
    And I click the Search Button
    Then I get result page