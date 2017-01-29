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
import java.util.Map;

import cucumber.api.Scenario;
import cucumber.api.java8.En;

public class ShoppingCart implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    AutomationpracticePage ap = PageFactory.initElements(driver, AutomationpracticePage.class);

    public ShoppingCart(){
        After(Scenario -> {
            driver.quit();
        });
        When("^user adds \"([^\"]*)\" item to shopping cart$", (String arg0) -> {
            driver.findElement(By.linkText(arg0)).click();
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add_to_cart")));
            driver.findElement(By.id("add_to_cart")).findElement(By.tagName("button")).click();
        });
        And("^user select proceed to checkout$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Proceed to checkout")));
            driver.findElement(By.partialLinkText("Proceed to checkout")).click();
        });
        And("^user agrees with terms and conditions$", () -> {
            driver.findElement(By.id("cgv")).click();
        });
        And("^user selects proceed to checkout$", () -> {
            driver.findElement(By.cssSelector(".cart_navigation.clearfix")).
                    findElement(By.tagName("button")).click();
        });
        And("^user selects payment option \"([^\"]*)\"$", (Integer arg0, DataTable arg1) -> {
            List<Map<String, String>> data = arg1.asMaps(String.class, String.class);
            driver.findElement(By.partialLinkText(data.get(arg0).get("Option"))).click();
        });
        And("^user confirms his order$", () -> {
            driver.findElement(By.cssSelector(".cart_navigation.clearfix")).
            findElement(By.tagName("button")).click();
        });
        Then("^order confirmation page is shown$", () -> {
            Assert.assertEquals(true, driver.getTitle().equals("Order confirmation - My Store"));
        });
    }
}
