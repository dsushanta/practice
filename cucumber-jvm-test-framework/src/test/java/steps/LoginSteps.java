package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps extends DriverFactory {

    @When("^He chooses to log in$")
    public void she_chooses_to_log_in() {
        new LoginPage(driver).she_chooses_to_log_in();
    }


    @And("^He provides the username as ([^\"]*)$")
    public void she_provides_the_user_name_as(String userName) {
        new LoginPage(driver).she_provides_the_user_name_as(userName);
    }

    @And("^He provides the password as ([^\"]*)$")
    public void she_provides_the_password_as(String password) {
        new LoginPage(driver).she_provides_the_password_as(password);
    }

    @And("^He logs-in$")
    public void she_logs_in() {
        new LoginPage(driver).she_logs_in();
    }
}
