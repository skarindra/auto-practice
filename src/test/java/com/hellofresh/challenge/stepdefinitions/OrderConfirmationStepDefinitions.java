package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.pages.OrderConfirmationPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sekarayukarindra.
 */
public class OrderConfirmationStepDefinitions {

    @Steps
    private OrderConfirmationPage orderConfirmationPage;

    @Then("^order confirmation is created$")
    public void orderConfirmationIsCreated() {
        orderConfirmationPage.orderConfirmationCreated();
    }
}
