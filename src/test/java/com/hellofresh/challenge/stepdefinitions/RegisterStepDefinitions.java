package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.pages.RegisterPage;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sekarayukarindra.
 */
public class RegisterStepDefinitions {

    @Steps
    private RegisterPage registerPage;

    @And("^user do registration$")
    public void userDoRegistration() {
        registerPage.register();
    }
}
