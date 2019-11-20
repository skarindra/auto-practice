package com.hellofresh.challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sekarayukarindra.
 */
public class RegisterPage extends PageObject {

    private BasePage basePage = new BasePage();
    protected String name = "Firstname";
    protected String surname = "Lastname";
    private String pass = "Qwerty";
    private String daySelect = "1";
    private String monthSelect = "1";
    private String yearSelect = "2000";
    private String companyName = "Company";
    private String add1 = "Qwerty, 123";
    private String add2 = "zxcvb";
    private String cityName = "Qwerty";
    private String stateName = "Colorado";
    private String postCd = "12345";
    private String otherInput = "Qwerty";
    private String phoneNo = "12345123123";
    private String mobileNo = "12345123123";
    private String aliasName = "hf";

    @FindBy(id = "id_gender2")
    private WebElementFacade gender2;

    @FindBy(id = "customer_firstname")
    private WebElementFacade firstName;

    @FindBy(id = "customer_lastname")
    private WebElementFacade lastName;

    @FindBy(id = "passwd")
    private WebElementFacade password;

    @FindBy(id = "days")
    private WebElementFacade day;

    @FindBy(id = "months")
    private WebElementFacade month;

    @FindBy(id = "years")
    private WebElementFacade year;

    @FindBy(id = "company")
    private WebElementFacade company;

    @FindBy(id = "address1")
    private WebElementFacade address1;

    @FindBy(id = "address2")
    private WebElementFacade address2;

    @FindBy(id = "city")
    private WebElementFacade city;

    @FindBy(id = "id_state")
    private WebElementFacade state;

    @FindBy(id = "postcode")
    private WebElementFacade postcode;

    @FindBy(id = "other")
    private WebElementFacade other;

    @FindBy(id = "phone")
    private WebElementFacade phone;

    @FindBy(id = "phone_mobile")
    private WebElementFacade mobilePhone;

    @FindBy(id = "alias")
    private WebElementFacade alias;

    @FindBy(id = "submitAccount")
    private WebElementFacade submitAccBtn;

    @Step
    public void register(){
        basePage.waitForVisibility(this.getDriver(),5, gender2);
        basePage.clickElement(gender2);
        basePage.inputValue(firstName, name);
        basePage.inputValue(lastName, surname);
        basePage.inputValue(password, pass);
        basePage.selectbyvalue(day, daySelect);
        basePage.selectbyvalue(month, monthSelect);
        basePage.selectbyvalue(year, yearSelect);
        basePage.inputValue(company, companyName);
        basePage.inputValue(address1, add1);
        basePage.inputValue(address2, add2);
        basePage.inputValue(city, cityName);
        basePage.selectbyvisibletext(state, stateName);
        basePage.inputValue(postcode, postCd);
        basePage.inputValue(other, otherInput);
        basePage.inputValue(phone, phoneNo);
        basePage.inputValue(mobilePhone, mobileNo);
        basePage.inputValue(alias, aliasName);
        basePage.clickElement(submitAccBtn);
    }
}
