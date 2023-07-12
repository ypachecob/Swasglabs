Feature: Login

@loginsuccessful
  Scenario: Login Successful
    Given  a user wants to enter the SWAGLABS website
    When you enter the information requested on the page
    |username|password|
    |standard_user|secret_sauce|
    Then authentically successfully

@loginerror
 Scenario: Login Error
    Given  a user wants to enter the SWAGLABS website
    When you enter the information requested on the page
    |username|password|
    |yenipabe.1993@gmail.com|1234567|
    Then He could see error

@loginsininfo
Scenario: Login no information
    Given  a user wants to enter the SWAGLABS website
    When you don't enter information
    |username|password|
    |||
    Then He could see error