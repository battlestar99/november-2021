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
  "duration": 1731052400,
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
  "duration": 310224100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_username(String)"
});
formatter.result({
  "duration": 118903200,
  "status": "passed"
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
  "duration": 92938700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 108222900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_login()"
});
formatter.result({
  "duration": 26900,
  "status": "passed"
});
formatter.after({
  "duration": 831435400,
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
  "duration": 1085208700,
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
  "duration": 223435600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_username(String)"
});
formatter.result({
  "duration": 97515100,
  "status": "passed"
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
  "duration": 101503400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 130219000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_login()"
});
formatter.result({
  "duration": 15200,
  "status": "passed"
});
formatter.after({
  "duration": 826807800,
  "status": "passed"
});
});