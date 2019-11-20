package com.hellofresh.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sekarayukarindra.
 */
public class OrderConfirmationPage extends PageObject {

    private BasePage basePage = new BasePage();
    private String ocHeadingText = "ORDER CONFIRMATION";
    private String msgCompleteText = "Your order on My Store is complete.";
    private String ocCurrentUrl = "controller=order-confirmation";

    @FindBy(css = "h1")
    private WebElementFacade heading;

    @FindBy(xpath = "//li[@class='step_done step_done_last four']")
    private WebElementFacade orderDone;

    @FindBy(xpath = "//li[@id='step_end' and @class='step_current last']")
    private WebElementFacade lastStep;

    @FindBy(xpath = "//*[@class='cheque-indent']/strong")
    private WebElementFacade messageComplete;

    private void verifyOCHeading(){
        basePage.waitForVisibility(getDriver(),5, heading);
        Assert.assertEquals(ocHeadingText, heading.getText());
    }

    private void verifyStepDone(){
        Assert.assertTrue(orderDone.isDisplayed());
    }

    private void verifyLastStep(){
        Assert.assertTrue(lastStep.isDisplayed());
    }

    private void verifyMsgComplete(){
        Assert.assertTrue(messageComplete.getText().contains(msgCompleteText));
    }

    private void verifyOCcurrentUrl(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains(ocCurrentUrl));
    }

    @Step
    public void orderConfirmationCreated(){
        verifyOCHeading();
        verifyStepDone();
        verifyLastStep();
        verifyMsgComplete();
        verifyOCcurrentUrl();
    }
}
