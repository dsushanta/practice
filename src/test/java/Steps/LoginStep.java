package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import com.sun.tools.javac.util.Name;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

public class LoginStep {//} extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    /*public LoginStep() {
        Given("^I navigate to login page$", () -> {
        });
        And("^I enter username as admin and password as admin$", () -> {
        });
        And("^I click login button$", () -> {
        });
        Then("^I should see the userform page$", () -> {
        });
    }

    private void Then(String s, Runnable o) {
        System.out.println("then");
    }

    private void And(String s, Runnable o) {
        System.out.println("and");
    }

    private void Given(String s, Runnable o) {
        System.out.println("given");
    }*/

    @Given("^I navigate to login page$")
    public void i_navigate_to_login_page() throws Throwable {
        System.out.println("\ngiven\n");
    }

    @And("^I click login button$")
    public void i_click_login_button() throws Throwable {
        System.out.println("\nand\n");
    }

    @Then("^I should see the userform page$")
    public void i_should_see_the_userform_page() throws Throwable {
        System.out.println("\nthen\n");
    }


    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {
        /*List<List<String>> data = table.raw();
        System.out.println("Username : "+data.get(1).get(0)+" ");
        System.out.println("Password : "+data.get(1).get(1)+" ");*/

        List<User> users = table.asList(User.class);

        for(User user : users) {
            System.out.println("Column 1 : "+user.userName);
            System.out.println("Column 2 : "+user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String pwd) {
        System.out.println("Username : "+userName);
        System.out.println("Password : "+pwd);
        System.out.println("Favorite TV series : "+base.StepInfo);
    }

    @And("^Email address as : ([^\"]*)$")
    public void emailAddressAsRoss(@Transform(EmailTransform.class) String email) {
        System.out.println("Email is : "+email+"\n");
    }

    @And("^I count digits in my salary : (\\d+)$")
    public void iCountDigitsInMySalary(@Transform(SalaryCountTransformer.class) int salary) {
        System.out.println("No of digits in my salary is : "+salary);
    }

    public class User {

        public String userName;
        public String password;

        public User(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

    }
}