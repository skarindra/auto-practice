package com.hellofresh.challenge.stepdefinitions;

import com.hellofresh.challenge.pages.LoginPage;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

/**
 * Created by sekarayukarindra.
 */
public class LoginStepDefinitions {

    @Steps
    private LoginPage loginPage;

    @And("^user create account$")
    public void userCreateAccount() {
        loginPage.fillEmailAndClickCreateBtn();
    }

    @And("^user do login$")
    public void userDoLogin() {
        loginPage.login();
    }
}
