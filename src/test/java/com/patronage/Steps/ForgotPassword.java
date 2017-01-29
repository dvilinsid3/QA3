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

public class ForgotPassword implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public ForgotPassword(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user clicks on Forgot your password link$", () -> {
            driver.findElement(By.partialLinkText("Forgot your password?")).click();
        });
        And("^user clicks on Retrieve Password button$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Forgot your password - My Store"));
            driver.findElement(By.id("form_forgotpassword")).findElement(By.cssSelector(".btn.btn-default.button.button-medium")).click();
        });
        And("^user enters \"([^\"]*)\" as email$", (String arg0) -> {
            driver.findElement(By.id("email")).sendKeys(arg0);
        });
        Then("^user should confirmation message box$", () -> {
            Assert.assertEquals(true, driver.findElement(By.cssSelector(".alert.alert-success")).
            getText().contains("A confirmation email has been sent to your address"));
        });
    }
}
