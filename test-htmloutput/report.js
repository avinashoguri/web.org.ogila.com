$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/SignUP.feature");
formatter.feature({
  "line": 1,
  "name": "OGILA Sign-UP with Facebook",
  "description": "",
  "id": "ogila-sign-up-with-facebook",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "sign-UP with Facebook",
  "description": "",
  "id": "ogila-sign-up-with-facebook;sign-up-with-facebook",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": ": User is on OGILA Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": Click on Continue with Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": Facebook login page will display and click on create account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": ": Fill the \"\u003cfirstName\u003e\",\"\u003csurname\u003e\",\"\u003cEmail\u003e\"and\"\u003cnewPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": fill Date of birth , \"\u003cGender\u003e\" and click on SignUP",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "ogila-sign-up-with-facebook;sign-up-with-facebook;",
  "rows": [
    {
      "cells": [
        "firstName",
        "surname",
        "Email",
        "newPassword",
        "Gender"
      ],
      "line": 11,
      "id": "ogila-sign-up-with-facebook;sign-up-with-facebook;;1"
    },
    {
      "cells": [
        "power",
        "ttest",
        "autotest8686@gmail.com",
        "9652106733",
        "male"
      ],
      "line": 12,
      "id": "ogila-sign-up-with-facebook;sign-up-with-facebook;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "sign-UP with Facebook",
  "description": "",
  "id": "ogila-sign-up-with-facebook;sign-up-with-facebook;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": ": User is on OGILA Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": Click on Continue with Facebook",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": Facebook login page will display and click on create account",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": ": Fill the \"power\",\"ttest\",\"autotest8686@gmail.com\"and\"9652106733\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": fill Date of birth , \"male\" and click on SignUP",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUp_StepDefenation._user_is_on_ogila_home_page()"
});
formatter.result({
  "duration": 12129158300,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_StepDefenation._click_on_continue_with_facebook()"
});
formatter.result({
  "duration": 3957192000,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_StepDefenation._facebook_login_page_will_display_and_click_on_create_account()"
});
formatter.result({
  "duration": 3522002500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "power",
      "offset": 12
    },
    {
      "val": "ttest",
      "offset": 20
    },
    {
      "val": "autotest8686@gmail.com",
      "offset": 28
    },
    {
      "val": "9652106733",
      "offset": 55
    }
  ],
  "location": "SignUp_StepDefenation._fill_the_somethingsomethingsomethingandsomething(String,String,String,String)"
});
formatter.result({
  "duration": 2193088700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "male",
      "offset": 24
    }
  ],
  "location": "SignUp_StepDefenation._fill_date_of_birth_something_and_click_on_signup(String)"
});
formatter.result({
  "duration": 1048411000,
  "status": "passed"
});
});