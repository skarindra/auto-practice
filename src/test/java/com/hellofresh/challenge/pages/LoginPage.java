package com.hellofresh.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

/**
 * Created by sekarayukarindra.
 */
public class LoginPage extends PageObject {

    private BasePage basePage = new BasePage();

    private String timestamp = String.valueOf(new Date().getTime());
    private String email = "hf_challenge_" + timestamp + "@hf" + timestamp.substring(7) + ".com";
    private String existingUserEmail = "hf_challenge_123456@hf123456.com";
    private String existingUserPassword = "12345678";

    @FindBy(id = "email_create")
    private WebElementFacade emailCreateField;

    @FindBy(id = "SubmitCreate")
    private WebElementFacade createBtn;

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "passwd")
    private WebElementFacade passwdField;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade loginBtn;

    @Step
    public void fillEmailAndClickCreateBtn(){
        basePage.waitForVisibility(this.getDriver(),10, emailCreateField);
        basePage.inputValue(emailCreateField, email);
        basePage.clickElement(createBtn);
    }

    @Step
    public void login(){
        basePage.inputValue(emailField, existingUserEmail);
        basePage.inputValue(passwdField, existingUserPassword);
        basePage.clickElement(loginBtn);
    }
}
