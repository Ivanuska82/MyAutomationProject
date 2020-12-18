package com.myapp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("user is on login page");

    }

    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("user enter credentials");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("user click on login button");
    }

    @Then("user supposed to see welcome message")
    public void user_supposed_to_see_welcome_message() {
        System.out.println("use get welcome message");
    }


}
