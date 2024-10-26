package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.ObjectInputFilter;
import java.time.Duration;

import static utils.PageInitializer.loginPage;

public class LoginSteps extends CommonMethods {
    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        sendText(ConfigReader.read("admin"), (WebElement) loginPage.usernameField);
        sendText(ConfigReader.read("Humam"),loginPage.passwordField);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        click(loginPage.loginButton);
    }
    @Then("user can see error message")
    public void user_can_see_error_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user enters admin username and admin password")
    public void user_enters_admin_username_and_admin_password() {
        // Write code here that turns the phrase above into concrete actions
        sendText(ConfigReader.read("userName"), loginPage.usernameField);
        sendText(ConfigReader.read("passwor"), loginPage.passwordField);
    }
    @Then("user is navigated to dashboard")
    public void user_is_navigated_to_dashboard() {
        // Write code here that turns the phrase above into concrete actions
       Assert.assertTrue(DashboardPage.welcomeText.isDisplayed());
        System.out.println("Test Passed");
    }

}
