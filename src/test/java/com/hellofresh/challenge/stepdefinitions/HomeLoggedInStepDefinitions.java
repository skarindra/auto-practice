package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.pages.HomeLoggedInPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sekarayukarindra.
 */
public class HomeLoggedInStepDefinitions {

    @Steps
    private HomeLoggedInPage homeLoggedInPage;

    @Then("^user is created$")
    public void userIsCreated() {
        homeLoggedInPage.verifyAccountCreated();
    }

    @Then("^user is logged in$")
    public void userIsLoggedIn() {
        homeLoggedInPage.verifyUserIsLoggedIn();
    }

    @Then("^user do checkout process$")
    public void userDoCheckoutProcess() {
        homeLoggedInPage.checkoutProcess();
    }


}
