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

import java.util.ArrayList;
import java.util.List;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class SocialMedia implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public SocialMedia(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user clicks on Facebook icon$", () -> {
            ap.getFacebookLogo().click();
        });
        Then("^user is redirected to selenium framework facebook profile$", () -> {
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.titleContains("Selenium Framework"));
            Assert.assertEquals(true, driver.getCurrentUrl().contains("facebook"));
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        });
        When("^user clicks on Twitter icon$", () -> {
            ap.getTwitterLogo().click();
        });
        Then("^user is redirected to selenium framework Twitter profile$", () -> {
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.titleContains("Selenium Framework"));
            Assert.assertEquals(true, driver.getCurrentUrl().contains("twitter"));
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        });
        When("^user clicks on Youtube icon$", () -> {
            ap.getYoutubeLogo().click();
        });
        Then("^user is redirected to selenium framework YouTube profile$", () -> {
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.titleContains("Selenium Framework"));
            Assert.assertEquals(true, driver.getCurrentUrl().contains("youtube"));
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        });
        When("^user clicks on googleplus icon$", () -> {
            ap.getGoogleLogo().click();
        });
        Then("^user is redirected to selenium framework googleplus profile$", () -> {
            ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.titleContains("Selenium"));
            Assert.assertEquals(true, driver.getCurrentUrl().contains("google"));
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        });
    }
}
