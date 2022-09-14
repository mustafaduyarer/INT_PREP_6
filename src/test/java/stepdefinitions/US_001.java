package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_001 {
    @Given("user goes to page kese homepage")
    public void userGoesToPageKeseHomepage() {
       // Driver.getDriver().get("https://kese.nl/");
        Driver.getDriver().get(ConfigurationReader.getProperty("environment"));


        BrowserUtilities.waitFor(3);
        Driver.closeDriver();


      // Driver.getDriver().   driver metodlari nelerdir?

    }
}
