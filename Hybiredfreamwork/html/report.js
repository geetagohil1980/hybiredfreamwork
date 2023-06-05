$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Login",
  "description": "",
  "id": "nopcommerce-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3823030700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Nopcommerce Valid Register Test",
  "description": "",
  "id": "nopcommerce-login;nopcommerce-valid-register-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User click on Register link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is on Register page and verify the register page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enter Registration detail and click on registerbutton",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is on home page and verify the home page title",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_click_on_Register_link()"
});
formatter.result({
  "duration": 905095300,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_is_on_Register_page_and_verify_the_register_page()"
});
formatter.result({
  "duration": 8725100,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_enter_FirstName_and_LastName()"
});
formatter.result({
  "duration": 1083593500,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_is_on_home_page_and_verify_the_home_page_title()"
});
formatter.result({
  "duration": 9315000,
  "status": "passed"
});
formatter.after({
  "duration": 692662400,
  "status": "passed"
});
});