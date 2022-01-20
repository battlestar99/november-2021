$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignIn2.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author - Zakir"
    },
    {
      "line": 2,
      "value": "#Date - 01/11/2022"
    }
  ],
  "line": 3,
  "name": "Signin feature",
  "description": "",
  "id": "signin-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Positive testing",
  "description": "",
  "id": "signin-feature;positive-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@pos"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is in sign page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user isert valid username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user insert valid password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_sign_page()"
});
formatter.result({
  "duration": 2189995800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_isert_valid_username()"
});
formatter.result({
  "duration": 117180300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 70857200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "duration": 75516800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 18820000,
  "error_message": "java.lang.AssertionError: expected [https://www.saucedemo.com/] but found [https://www.saucedemo.com/inventory.html]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertEquals(Assert.java:125)\r\n\tat org.testng.Assert.assertEquals(Assert.java:178)\r\n\tat org.testng.Assert.assertEquals(Assert.java:188)\r\n\tat stepDef.StepDefinition.user_should_be_able_to_login(StepDefinition.java:51)\r\n\tat ✽.Then user should be able to login(SignIn2.feature:11)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "Negetive testing",
  "description": "",
  "id": "signin-feature;negetive-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@neg"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user is in sign page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user isert valid username",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user insert valid password",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_sign_page()"
});
formatter.result({
  "duration": 1391324401,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_isert_valid_username()"
});
formatter.result({
  "duration": 135266200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 78047500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_signin_button()"
});
formatter.result({
  "duration": 98534700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 16841200,
  "error_message": "java.lang.AssertionError: expected [https://www.saucedemo.com/] but found [https://www.saucedemo.com/inventory.html]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:496)\r\n\tat org.testng.Assert.assertEquals(Assert.java:125)\r\n\tat org.testng.Assert.assertEquals(Assert.java:178)\r\n\tat org.testng.Assert.assertEquals(Assert.java:188)\r\n\tat stepDef.StepDefinition.user_should_be_able_to_login(StepDefinition.java:51)\r\n\tat ✽.Then user should be able to login(SignIn2.feature:19)\r\n",
  "status": "failed"
});
});