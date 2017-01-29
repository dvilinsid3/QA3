package com.patronage.Steps;

import com.patronage.Pages.AutomationpracticePage;
import cucumber.api.PendingException;
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

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class AutomationpracticeLogin implements En{
    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);


    public AutomationpracticeLogin(){

        Before(Scenario -> {
        });
        After(Scenario -> {
            driver.quit();
        });
        Given("^user is on main page$", () -> {
            driver.get("http://" + baseUrl);
            Assert.assertEquals(true, driver.getTitle().equals("My Store"));
        });
        When("^user clicks on Sign In link$", () -> {
            ap.getSignInLink().click();
        });
        Then("^user should see authentication page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("SubmitLogin")));
        });
        When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$", (String arg0, String arg1) -> {
            ap.getEmailTextBox().sendKeys(arg0);
            ap.getPasswdTextBox().sendKeys(arg1);
        });
        And("^user clicks on Sign In button$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("SubmitLogin")));

            ap.getSubmitLoginButton().sendKeys(Keys.ENTER);
        });
        Then("^user should see an \"([^\"]*)\" message box$", (arg0) -> {
            driver.findElement(By.className("alert-danger")).getText().contains("Authentication failed");
        });
        Then("^user should see My Account web page$", () -> {
            driver.findElement(By.className("info-account")).getText().contains("Welcome to your account.");
        });
        When("^user clicks on Sign Out link$", () -> {
            ap.getSignOutLink().click();
        });

    }
    }
