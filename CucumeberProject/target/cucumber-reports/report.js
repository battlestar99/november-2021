$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("swagLabData.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# author:"
    },
    {
      "line": 2,
      "value": "# date:"
    }
  ],
  "line": 3,
  "name": "SwagLab login",
  "description": "",
  "id": "swaglab-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"\u003cusername\u003e\" in app",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"\u003cpassword\u003e\" in app",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"\u003cexpectedUrl\u003e\" in app",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "expectedUrl"
      ],
      "line": 13,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 14,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;2"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 15,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;3"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 16,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;4"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 17,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;5"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 18,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;6"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 19,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;7"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 20,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;8"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 21,
      "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;9"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 67600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"standard_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 2061021300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 101785100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 84537600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 107998900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 92136600,
  "status": "passed"
});
formatter.after({
  "duration": 847178900,
  "status": "passed"
});
formatter.before({
  "duration": 14200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"locked_out_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1350555600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 108804800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 79773500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 63630700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 9495200,
  "status": "passed"
});
formatter.after({
  "duration": 754768400,
  "status": "passed"
});
formatter.before({
  "duration": 17400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"problem_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1334390600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 112633800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 79313200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 106397800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 6631500,
  "status": "passed"
});
formatter.after({
  "duration": 767495500,
  "status": "passed"
});
formatter.before({
  "duration": 13800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"performance_glitch_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1317429900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 123157000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 79095600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5140951400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 19041600,
  "status": "passed"
});
formatter.after({
  "duration": 787824300,
  "status": "passed"
});
formatter.before({
  "duration": 25000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"standard_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1305270300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 100133000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 80788000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 121371900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 86321700,
  "status": "passed"
});
formatter.after({
  "duration": 770801100,
  "status": "passed"
});
formatter.before({
  "duration": 16500,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"locked_out_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1320887600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 91658800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 86786100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 70391400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 12121600,
  "status": "passed"
});
formatter.after({
  "duration": 777253200,
  "status": "passed"
});
formatter.before({
  "duration": 23500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"problem_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1338504000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 104449100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 95317200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 125202500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 13470800,
  "status": "passed"
});
formatter.after({
  "duration": 758921300,
  "status": "passed"
});
formatter.before({
  "duration": 14600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validating multiple set of test data for login",
  "description": "",
  "id": "swaglab-login;validating-multiple-set-of-test-data-for-login;;9",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"performance_glitch_user\" in app",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters passsword \"secret_sauce\" in app",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should be be able to login based on \"https://www.saucedemo.com/inventory.html\" in app",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1319783400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_app(String)"
});
formatter.result({
  "duration": 107248500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 23
    }
  ],
  "location": "stepDef.user_enters_passsword_in_app(String)"
});
formatter.result({
  "duration": 84178300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5110736000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 42
    }
  ],
  "location": "stepDef.user_should_be_be_able_to_login_based_on_in_app(String)"
});
formatter.result({
  "duration": 13738300,
  "status": "passed"
});
formatter.after({
  "duration": 755507000,
  "status": "passed"
});
formatter.uri("urlValidation.feature");
formatter.feature({
  "line": 3,
  "name": "Home page links",
  "description": "",
  "id": "home-page-links",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validating multiple links in the home page",
  "description": "",
  "id": "home-page-links;validating-multiple-links-in-the-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke12"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is in the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the special link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user should be on the special page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the new products link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should be on the new product page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on the best sellers link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user should be on the best sellers page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user clicks on the our stores link",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user should be on the our stores page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_in_the_home_page()"
});
formatter.result({
  "duration": 2072905300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_special_link()"
});
formatter.result({
  "duration": 741369300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_special_page()"
});
formatter.result({
  "duration": 4394900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_new_products_link()"
});
formatter.result({
  "duration": 645603300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_new_product_page()"
});
formatter.result({
  "duration": 27284800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_best_sellers_link()"
});
formatter.result({
  "duration": 738599900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_best_sellers_page()"
});
formatter.result({
  "duration": 23544700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_our_stores_link()"
});
formatter.result({
  "duration": 786446300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_on_the_our_stores_page()"
});
formatter.result({
  "duration": 16520400,
  "status": "passed"
});
formatter.after({
  "duration": 771582300,
  "status": "passed"
});
});