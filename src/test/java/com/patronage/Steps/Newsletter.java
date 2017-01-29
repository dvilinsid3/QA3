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

public class Newsletter implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public Newsletter(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user provides \"([^\"]*)\" email$", (String arg0) -> {
            ap.getNewsletterInput().sendKeys(arg0);
            ap.getSubmitNewsletterButton().click();
        });
        Then("^user should see an confirmation message box$", () -> {
            Assert.assertEquals(true, driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
        });

    }
}
