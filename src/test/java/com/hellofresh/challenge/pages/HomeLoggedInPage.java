package com.hellofresh.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sekarayukarindra.
 */
public class HomeLoggedInPage extends PageObject {
    
    private BasePage basePage = new BasePage();
    private RegisterPage registerPage;
    private String currentUrl = "controller=my-account";
    private String infoAccText = "Welcome to your account.";
    private String existingfullName = "Joe Black";
    private String myaccheadingtxt = "MY ACCOUNT";

    @FindBy(css = "h1")
    private WebElementFacade heading;

    @FindBy(className = "account")
    private WebElementFacade accName;

    @FindBy(className = "info-account")
    private WebElementFacade infoAcc;

    @FindBy(className = "logout")
    private WebElementFacade logout;

    @FindBy(linkText = "Women")
    private WebElementFacade womenCategory;

    @FindBy(xpath = "//a[@title='Faded Short Sleeve T-shirts']/ancestor::li")
    private WebElementFacade tshirtItem;

    @FindBy(name = "Submit")
    private WebElementFacade submitOrderBtn;

    @FindBy(xpath = "//*[@id='layer_cart']//a[@class and @title='Proceed to checkout']")
    private WebElementFacade proceedCheckout;

    @FindBy(xpath = "//*[contains(@class,'cart_navigation')]/a[@title='Proceed to checkout']")
    private WebElementFacade confirmCheckout;

    @FindBy(name = "processAddress")
    private WebElementFacade processAddress;

    @FindBy(id = "uniform-cgv")
    private WebElementFacade cgv;

    @FindBy(name = "processCarrier")
    private WebElementFacade processCarrier;

    @FindBy(className = "bankwire")
    private WebElementFacade bankwire;

    @FindBy(xpath = "//*[@id='cart_navigation']/button")
    private WebElementFacade cartNavBtn;

    private void verifyHeading(){
        basePage.waitForVisibility(this.getDriver(),5, heading);
        Assert.assertEquals(myaccheadingtxt, heading.getText());
    }

    private void verifyAccountName(String expected){
        Assert.assertEquals(expected, accName.getText());
    }


    private void verifyInfoAccount(){
        Assert.assertTrue(infoAcc.getText().contains(infoAccText));
    }

    private void verifyLogoutBtn(){
        Assert.assertTrue(logout.isDisplayed());
    }

    private void verifyAccountCurrentUrl(){
        Assert.assertTrue(this.getDriver().getCurrentUrl().contains(currentUrl));
    }

    @Step
    public void verifyAccountCreated(){
        verifyHeading();
        verifyAccountName(registerPage.name +" "+ registerPage.surname);
        verifyInfoAccount();
        verifyLogoutBtn();
        verifyAccountCurrentUrl();
    }

    @Step
    public void verifyUserIsLoggedIn(){
        verifyHeading();
        verifyAccountName(existingfullName);
        verifyInfoAccount();
        verifyLogoutBtn();
        verifyAccountCurrentUrl();
    }

    @Step
    public void checkoutProcess(){
        basePage.clickElement(womenCategory);
        basePage.clickElement(tshirtItem);
        basePage.clickElement(tshirtItem);
        basePage.clickElement(submitOrderBtn);
        basePage.clickElement(proceedCheckout);
        basePage.clickElement(confirmCheckout);
        basePage.clickElement(processAddress);
        basePage.clickElement(cgv);
        basePage.clickElement(processCarrier);
        basePage.clickElement(bankwire);
        basePage.clickElement(cartNavBtn);
    }
}
