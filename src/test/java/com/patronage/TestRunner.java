package com.patronage;

import com.patronage.Pages.AutomationpracticePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/src/test/java/com/patronage", format = "json:target/cucumber.json", glue = "com.patronage")
public class TestRunner{
}
