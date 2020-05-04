Feature: OGILA Sign-UP with Facebook

Scenario Outline: sign-UP with Facebook
Given : User is on OGILA Home page
When : Click on Continue with Facebook
Then : Facebook login page will display and click on create account
Then : Fill the "<firstName>","<surname>","<Email>"and"<newPassword>"
And : fill Date of birth , "<Gender>" and click on SignUP
And : Enter OTP manuvally

Examples:
|firstName|surname|Email|newPassword|Gender|
|power|ttest|autotest8686@gmail.com|9652106733|male|