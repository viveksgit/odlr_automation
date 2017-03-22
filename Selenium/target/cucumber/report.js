$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Softools",
  "description": "",
  "id": "login-to-softools",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3688364128,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "login with softools account",
  "description": "",
  "id": "login-to-softools;login-with-softools-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch given url \"https://prerelease.on.softools.net/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I provide userid \"testing\\tester\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I provide password \"SofTest93\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click login button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://prerelease.on.softools.net/",
      "offset": 20
    }
  ],
  "location": "loginPageDefinition.i_launch_given_url(String)"
});
formatter.result({
  "duration": 11811450933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing\\tester",
      "offset": 18
    }
  ],
  "location": "loginPageDefinition.i_provide_userid(String)"
});
formatter.result({
  "duration": 422599566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SofTest93",
      "offset": 20
    }
  ],
  "location": "loginPageDefinition.i_provide_password(String)"
});
formatter.result({
  "duration": 208411214,
  "status": "passed"
});
formatter.match({
  "location": "loginPageDefinition.i_click_login_button()"
});
formatter.result({
  "duration": 7727318267,
  "status": "passed"
});
formatter.after({
  "duration": 1280728279,
  "status": "passed"
});
});