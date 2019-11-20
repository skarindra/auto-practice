package com.hellofresh.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sekarayukarindra.
 */
public class HomePage extends PageObject {
    private BasePage basePage = new BasePage();
    private String URL = "http://automationpractice.com/index.php";

    @FindBy(className = "login")
    private WebElementFacade login;

    @Step
    public void openPage(){
        this.getDriver().get(URL);
    }

    @Step
    public void clickLogin(){
        basePage.clickElement(login);
    }
}
