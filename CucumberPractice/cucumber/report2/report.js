$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("new.feature");
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
      "name": "@tests"
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
  "name": "user insert valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user insert valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should login",
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
  "duration": 1843975800,
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
      "name": "@tests"
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
  "name": "user insert valid username \"standard_user\"",
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
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_signin_page()"
});
formatter.result({
  "duration": 302685300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition2.user_insert_valid_username(String)"
});
formatter.result({
  "duration": 7924500,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.StepDefinition2.user_insert_valid_username(StepDefinition2.java:14)\r\n\tat ✽.When user insert valid username \"standard_user\"(new.feature:8)\r\n",
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
  "duration": 893024300,
  "status": "passed"
});
formatter.uri("signin.feature");
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
  "line": 17,
  "name": "positive testing",
  "description": "",
  "id": "signin-to-the-application;positive-testing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@tests"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is in signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user insert valid username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user insert valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should login",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "signin-to-the-application;positive-testing;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 25,
      "id": "signin-to-the-application;positive-testing;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 26,
      "id": "signin-to-the-application;positive-testing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1095175800,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "positive testing",
  "description": "",
  "id": "signin-to-the-application;positive-testing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@tests"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user is in signin page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user insert valid username \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_signin_page()"
});
formatter.result({
  "duration": 245796200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition2.user_insert_valid_username(String)"
});
formatter.result({
  "duration": 283100,
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.StepDefinition2.user_insert_valid_username(StepDefinition2.java:14)\r\n\tat ✽.When user insert valid username \"standard_user\"(signin.feature:19)\r\n",
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
  "duration": 755909700,
  "status": "passed"
});
});