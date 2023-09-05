$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Feature/search.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the login fn",
  "description": "",
  "id": "validate-the-login-fn",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "",
  "description": "Validate the login with valid details",
  "id": "validate-the-login-fn;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I give the valid username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should able to see the dashbaord",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});