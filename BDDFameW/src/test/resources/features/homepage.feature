Feature: user can see the home page after login

Scenario: facebook homepage scenario

Given User is on homepage
When title of login page is facebook
Then user enters username and password
Then user click on login button
And user is on home page



 
