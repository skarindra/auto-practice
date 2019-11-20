package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sekarayukarindra.
 */
public class HomeStepDefinitions {

    @Steps
    private HomePage homePage;

    @Given("^user wants to open page$")
    public void userWantsToOpenPage() {
        homePage.openPage();
    }

    @When("^user clicks on login menu$")
    public void userClickOnLogin() {
        homePage.clickLogin();
    }
}
