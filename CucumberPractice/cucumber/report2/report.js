$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author - Zakir"
    },
    {
      "line": 2,
      "value": "#Date - 01/12/2022"
    }
  ],
  "line": 3,
  "name": "Signin to the application",
  "description": "",
  "id": "signin-to-the-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "positive testing",
  "description": "",
  "id": "signin-to-the-application;positive-testing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is in signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user insert a valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user insert valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on a login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "signin-to-the-application;positive-testing;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "signin-to-the-application;positive-testing;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 15,
      "id": "signin-to-the-application;positive-testing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1699198300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "positive testing",
  "description": "",
  "id": "signin-to-the-application;positive-testing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is in signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user insert a valid username \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on a login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_signin_page()"
});
formatter.result({
  "duration": 252967900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 30
    }
  ],
  "location": "StepDefinition2.user_insert_valid_username(String)"
});
formatter.result({
  "duration": 4178600,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.StepDefinition2.user_insert_valid_username(StepDefinition2.java:14)\r\n\tat ✽.When user insert a valid username \"standard_user\"(signin.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition2.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_should_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 756288500,
  "status": "passed"
});
});