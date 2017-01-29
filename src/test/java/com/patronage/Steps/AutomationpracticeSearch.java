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

public class AutomationpracticeSearch implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);
    
    public AutomationpracticeSearch(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user provide \"([^\"]*)\" search phase$", (String arg0) -> {
            ap.getQuerySearchBox().sendKeys(arg0);
        });
        And("^user clicks on Search button$", () -> {
            ap.getSubmitSearch().click();
        });
        Then("^warning message appears$", () -> {
            Assert.assertEquals(true, driver.findElement(By.className("alert-warning")).getText().
                    contains("No results were found for your search"));
        });
        When("^user provide an example search phase$", (DataTable arg1) -> {
            List data = arg1.raw();
            ap.getQuerySearchBox().sendKeys(data.get(1).toString().substring(1, data.get(1).toString().length()-1));
        });
        Then("^page contating search results should appear$", (DataTable arg1) -> {
            List data = arg1.raw();
            Assert.assertEquals(false, driver.findElements(By.className("product-container")).isEmpty());
        });
    }
}
