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
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import com.patronage.Pages.AutomationpracticePage.*;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class Register implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public Register(){
        After(Scenario -> {
            driver.quit();
        });
        And("^user provides \"([^\"]*)\" email for registration$", (String arg0) -> {
            ap.getEmailRegisterInput().sendKeys(arg0);
        });
        And("^user clicks on submit button$", () -> {
            ap.getSubmitRegisterButton().click();
        });
        And("^user provides required data$", (DataTable arg1) -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
            List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
            if (data.get(0).get("Title") == "Mrs")
            {
                ap.getRadioMrs().click();
            }
            else
            {
                ap.getRadioMr().click();
            }

            ap.getCustomerFirstname().sendKeys(data.get(0).get("FirstName"));
            ap.getCustomerLastname().sendKeys(data.get(0).get("LastName"));
            ap.getCustomerPassword().sendKeys(data.get(0).get("Passwd"));
            Select days = new Select(driver.findElement(By.id("days")));
            days.selectByValue(data.get(0).get("Day"));
            Select months = new Select(driver.findElement(By.id("months")));
            months.selectByValue(data.get(0).get("Month"));
            Select years = new Select(driver.findElement(By.id("years")));
            years.selectByValue(data.get(0).get("Year"));
            if (data.get(0).get("Newsletter") == "1")
            {
                ap.getNewsletterCheckbox().click();
            }
            if (data.get(0).get("Offers") == "1")
            {
                ap.getOptinCheckbox().click();
            }
            ap.getFirstname().sendKeys(data.get(0).get("FirstName2"));
            ap.getLastname().sendKeys(data.get(0).get("LastName2"));
            ap.getCompany().sendKeys(data.get(0).get("Company"));
            ap.getAddress1().sendKeys(data.get(0).get("Address"));
            ap.getAddress2().sendKeys(data.get(0).get("Address2"));
            ap.getCity().sendKeys(data.get(0).get("City"));
            Select cityState = new Select(driver.findElement(By.id("id_state")));
            cityState.selectByValue(data.get(0).get("State"));
            ap.getPostcode().sendKeys(data.get(0).get("Zip"));
            ap.getOtherInformation().sendKeys(data.get(0).get("AdditionalInfo"));
            ap.getPhone().sendKeys(data.get(0).get("HomePhone"));
            ap.getMobilePhone().sendKeys(data.get(0).get("MobilePhone"));
            ap.getUserAlias().sendKeys(data.get(0).get("AddressAlias"));
        });
        And("^user clicks on register submit button$", () -> {
            ap.getSubmitAccountButton().click();
        });
        Then("^account is created and user is on My account page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header_logo")));
            Assert.assertEquals(true, driver.getTitle().equals("My account - My Store"));
        });
    }
}
