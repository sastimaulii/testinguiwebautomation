package testinguiwebautomation.stepDefinitions;

import testinguiwebautomation.hooks.Hooks;
import testinguiwebautomation.pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("saya berada di halaman login")
    public void goToLogin() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("saya memasukkan username {string} dan password {string}")
    public void inputCredentials(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
    }

    @And("saya klik tombol login")
    public void clickSubmit() {
        loginPage.clickLogin();
    }

    @Then("saya harus dialihkan ke halaman inventory")
    public void verifyDashboard() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
    }

    @Then("muncul pesan error yang mengandung {string}")
    public void verifyError(String expectedMsg) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(expectedMsg));
    }
}