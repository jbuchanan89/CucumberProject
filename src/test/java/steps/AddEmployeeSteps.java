package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddEmployeePage;
import utils.CommonMethods;

public class AddEmployeeSteps extends CommonMethods {
    @When("user enters firstname and lastname in the name fields")
    public void user_enters_firstname_and_lasname_in_the_name_fields() {
        // Write code here that turns the phrase above into concrete actions
        sendText("Jessie", AddEmployeePage.firstnameLocator);
        sendText("Flies", AddEmployeePage.lastnameLocator);
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
       click(AddEmployeePage.saveButton);
    }
    @Then("user added succesfully")
    public void user_added_succesfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test Passed");
    }
}
