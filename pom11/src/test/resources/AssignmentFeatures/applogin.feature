Feature: I want to login to elearningm1
This Feature include following feature
1.Signup
2.login
3.ValidateMail

Background:
Given Elearing Application is launched

@Signup
Scenario Outline: Signup
When I click on Signup button
And I enter the First name as "<fname>"
And I enter the Last name as "<lname>"
And I enter the e-mail as "<email>"
And I enter the Username as "<user>"
And I enter the Pass as "<pwd>"
And I enter the confirm password as "<cpwd>"
And I click on register button
Then I should see the confirmationmessage "Your personal settings have been registered"

Examples:
|fname|lname|email|user|pwd|cpwd|
|Priya|Ganga|pgangakh@in.ibm.com|priya|priya|priya|

@login
Scenario: login
When I enter the username as "<user>"
And I enter the Password as "<pwd>"
Then I should click on login button

Examples:
|user|pwd|
|aaaaa|aaa|

@validateMail
Scenario: ValidateMail
When I enter the username as "<user>"
And I enter the Password as "<pwd>"
Then I should click on login button

When I click on Compose message button
And I enter the Text on message section
And I click on Send message button
Then I should see acknowledgement

Examples:
|user|pwd|
|aaaaa|aaa|




