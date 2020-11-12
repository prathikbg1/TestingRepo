$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/prathik.g/eclipse-workspace/BDDFramework/src/main/java/com/qa/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Test",
  "description": "",
  "id": "free-crm-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "CRM Login flow check",
  "description": "",
  "id": "free-crm-test;crm-login-flow-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open the browser and User will be in CRM home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on LOGIN option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters useremail and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "verify the login",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefination.user_open_the_browser_and_user_will_be_in_crm_home_page()"
});
formatter.result({
  "duration": 59301865753,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_clicks_on_login_option()"
});
formatter.result({
  "duration": 7996022720,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_enters_useremail_and_password()"
});
formatter.result({
  "duration": 27618778604,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.verify_the_login()"
});
formatter.result({
  "duration": 337201266,
  "status": "passed"
});
});