package com.patronage.Steps;

import com.patronage.Pages.AutomationpracticePage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import mx4j.tools.config.DefaultConfigurationBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class SiteNavigation implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public SiteNavigation(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user clicks on site logo$", () -> {
            ap.getSiteLogo().click();
        });
        Then("^user is redirected to homepage$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("My Store"));
        });
        When("^user clicks on Contact Us link$", () -> {
            ap.getContactUsLink().click();
        });
        Then("^user is redirected to Contact Us page$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Contact us - My Store"));
        });
        When("^user clicks on Login link$", () -> {
            ap.getSignInLink().click();
        });
        Then("^user is redirected to Login page$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Login - My Store"));
        });
        When("^user clicks on site banner$", () -> {
            ap.getSiteBanner().click();
        });
        When("^user clicks on Women category$", () -> {
            ap.getWomenLink().click();
        });
        Then("^user is redirected to Women category page$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Women - My Store"));
        });
        When("^user clicks on Dresses category$", () -> {
            ap.getDressesLink().click();
        });
        Then("^user is redirected to Dresses category page$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Dresses - My Store"));
        });
        When("^user clicks on TShirts category$", () -> {
            ap.getTshirtsLink().click();
        });
        Then("^user is redirected to TShirts category page$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("T-Shirts - My Store"));
        });
    }
}
