Feature: Search - functionality

Scenario Outline: Verify the Job Search Functionality
  Given I navigate to the provided URL
  When  I am on  the Home page
  And   I enter the Search item as "<Roles>"
  And   I Hit the Search Icon
  Then  I should be able to view the List of Relevant Search Items as "<Job Titles>"

Examples:
|Roles|Job Titles|
|Junior QA Engineer|Junior QA Engineer jobs|
|QA Analyst        |QA Analyst jobs        |
|Test Analyst      |Test Analyst jobs      |
|Test Automation Engineer|Test Automation Engineer jobs|
|Manual Tester           |Manual Tester jobs           |
|QA Engineer             |QA Engineer jobs             |

