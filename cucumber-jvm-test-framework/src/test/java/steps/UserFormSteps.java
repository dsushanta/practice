package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UserForm;

public class UserFormSteps extends DriverFactory {

    @Then("^He should be taken to the landing page$")
    public void He_should_be_taken_to_the_landing_page() {
        new UserForm(driver).she_should_be_taken_to_the_landing_page();
    }

    @And("^He selects ([^\"]*)$")
    public void heSelectsMr(String title) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new UserForm(driver).enter_title(title);
    }

    @And("^He enters firstname as ([^\"]*)$")
    public void heEntersFirstnameAsRoss(String fName) {
        new UserForm(driver).enter_firstname(fName);
    }

    @And("^He enters middlename as ([^\"]*)$")
    public void heEntersMiddlenameAsGeller(String mName) {
        new UserForm(driver).enter_middlename(mName);
    }
}
