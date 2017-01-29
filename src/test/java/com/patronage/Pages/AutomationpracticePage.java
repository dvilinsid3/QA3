package com.patronage.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationpracticePage {

    @FindBy(how = How.NAME, using = "search_query")
    private WebElement querySearchBox;

    @FindBy(how = How.CLASS_NAME, using = "logo img-responsive")
    private WebElement shopLogo;

    @FindBy(how = How.NAME, using = "submit_search")
    private WebElement submitSearch;

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement signInLink;

    @FindBy(how = How.ID, using = "contact-link")
    private WebElement contactUsLink;

    @FindBy(how = How.NAME, using = "email")
    private WebElement emailTextBox;

    @FindBy(how = How.NAME, using = "passwd")
    private WebElement passwdTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
    private WebElement submitLoginButton;

    @FindBy(how = How.CLASS_NAME, using = "logout")
    private WebElement signOutLink;

    @FindBy(how = How.CSS, using = ".logo.img-responsive")
    private WebElement siteLogo;

    @FindBy(how = How.CSS, using = ".banner")
    private WebElement siteBanner;

    @FindBy(how = How.CSS, using = ".facebook")
    private WebElement facebookLogo;

    @FindBy(how = How.CSS, using = ".twitter")
    private WebElement twitterLogo;

    @FindBy(how = How.CSS, using = ".youtube")
    private WebElement youtubeLogo;

    @FindBy(how = How.CSS, using = ".google-plus")
    private WebElement googleLogo;

    @FindBy(how = How.LINK_TEXT, using = "WOMEN")
    private WebElement womenLink;

    @FindBy(how = How.LINK_TEXT, using = "DRESSES")
    private WebElement dressesLink;

    @FindBy(how = How.LINK_TEXT, using = "T-SHIRTS")
    private WebElement tshirtsLink;

    @FindBy(how = How.ID, using = "newsletter-input")
    private WebElement newsletterInput;

    @FindBy(how = How.NAME, using = "submitNewsletter")
    private WebElement submitNewsletterButton;

    @FindBy(how = How.ID, using = "email_create")
    private WebElement emailRegisterInput;

    @FindBy(how = How.ID, using = "SubmitCreate")
    private WebElement submitRegisterButton;

    @FindBy(how = How.ID, using = "id_gender1")
    private WebElement radioMr;

    @FindBy(how = How.ID, using = "id_gender2")
    private WebElement radioMrs;

    @FindBy(how = How.ID, using = "customer_firstname")
    private WebElement customerFirstname;

    @FindBy(how = How.ID, using = "customer_lastname")
    private WebElement customerLastname;

    @FindBy(how = How.ID, using = "passwd")
    private WebElement customerPassword;

    @FindBy(how = How.ID, using = "days")
    private WebElement days;

    @FindBy(how = How.ID, using = "months")
    private WebElement months;

    @FindBy(how = How.ID, using = "years")
    private WebElement years;

    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsletterCheckbox;

    @FindBy(how = How.ID, using = "optin")
    private WebElement optinCheckbox;

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstname;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastname;

    @FindBy(how = How.ID, using = "company")
    private WebElement company;

    @FindBy(how = How.ID, using = "address1")
    private WebElement address1;

    @FindBy(how = How.ID, using = "address2")
    private WebElement address2;

    @FindBy(how = How.ID, using = "city")
    private WebElement city;

    @FindBy(how = How.ID, using = "id_state")
    private WebElement countryState;

    @FindBy(how = How.ID, using = "postcode")
    private WebElement postcode;

    @FindBy(how = How.ID, using = "id_country")
    private WebElement countryId;

    @FindBy(how = How.ID, using = "other")
    private WebElement otherInformation;

    @FindBy(how = How.ID, using = "phone")
    private WebElement phone;

    @FindBy(how = How.ID, using = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(how = How.ID, using = "alias")
    private WebElement userAlias;

    @FindBy(how = How.ID, using = "submitAccount")
    private WebElement submitAccountButton;


    public WebElement getQuerySearchBox() {
        return querySearchBox;
    }
    public WebElement getShopLogo() {
        return shopLogo;
    }
    public WebElement getSubmitSearch() {
        return submitSearch;
    }
    public WebElement getSignInLink() {
        return signInLink;
    }
    public WebElement getEmailTextBox() {
        return emailTextBox;
    }
    public WebElement getPasswdTextBox() {
        return passwdTextBox;
    }
    public WebElement getSubmitLoginButton() {
        return submitLoginButton;
    }
    public WebElement getSignOutLink() {
        return signOutLink;
    }
    public WebElement getSiteLogo() {
        return siteLogo;
    }
    public WebElement getContactUsLink() {
        return contactUsLink;
    }
    public WebElement getSiteBanner() {
        return siteBanner;
    }
    public WebElement getGoogleLogo() {
        return googleLogo;
    }
    public WebElement getYoutubeLogo() {
        return youtubeLogo;
    }
    public WebElement getTwitterLogo() {
        return twitterLogo;
    }
    public WebElement getFacebookLogo() {
        return facebookLogo;
    }
    public WebElement getWomenLink() {
        return womenLink;
    }
    public WebElement getDressesLink() {
        return dressesLink;
    }
    public WebElement getTshirtsLink() {
        return tshirtsLink;
    }
    public WebElement getSubmitNewsletterButton() {
        return submitNewsletterButton;
    }
    public WebElement getNewsletterInput() {
        return newsletterInput;
    }
    public WebElement getEmailRegisterInput() {
        return emailRegisterInput;
    }
    public WebElement getSubmitRegisterButton() {
        return submitRegisterButton;
    }
    public WebElement getRadioMr() {
        return radioMr;
    }
    public WebElement getRadioMrs() {
        return radioMrs;
    }
    public WebElement getCustomerFirstname() {
        return customerFirstname;
    }
    public WebElement getCustomerLastname() {
        return customerLastname;
    }
    public WebElement getCustomerPassword() {
        return customerPassword;
    }
    public WebElement getDays() {
        return days;
    }
    public WebElement getMonths() {
        return months;
    }
    public WebElement getYears() {
        return years;
    }
    public WebElement getNewsletterCheckbox() {
        return newsletterCheckbox;
    }
    public WebElement getOptinCheckbox() {
        return optinCheckbox;
    }
    public WebElement getFirstname() {
        return firstname;
    }
    public WebElement getLastname() {
        return lastname;
    }
    public WebElement getCompany() {
        return company;
    }
    public WebElement getAddress1() {
        return address1;
    }
    public WebElement getAddress2() {
        return address2;
    }
    public WebElement getCity() {
        return city;
    }
    public WebElement getCountryState() {
        return countryState;
    }
    public WebElement getPostcode() {
        return postcode;
    }
    public WebElement getCountryId() {
        return countryId;
    }
    public WebElement getOtherInformation() {
        return otherInformation;
    }
    public WebElement getPhone() {
        return phone;
    }
    public WebElement getMobilePhone() {
        return mobilePhone;
    }
    public WebElement getUserAlias() {
        return userAlias;
    }
    public WebElement getSubmitAccountButton() {
        return submitAccountButton;
    }

}