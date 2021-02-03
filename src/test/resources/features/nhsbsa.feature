Feature: Eligibility Checker
  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Scenario Outline: Wales Eligibility Checker
    Given I am a person from "<location>"
    When enter date <date>
    When enter month <month>
    When enter year <year>
    When I put my circumstances into the Checker tool with partner "<value>"
    Then I should get a  result of whether I will get help or not

    Examples:
      |location|value|date|month|year|
      |wales|true|31|1|1985|
      |wales|false|21|2|1980|



