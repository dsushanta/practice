package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(name = "UserName")          private WebElement userNameField;
    @FindBy(name = "Password")          private WebElement passwordField;
    @FindBy(xpath = "//input[@name='Login']")             private WebElement loginButtonField;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void she_chooses_to_log_in() {
        System.out.println("\nShe wants to login");
    }
    
    public void she_provides_the_user_name_as(String userName) {
        userNameField.sendKeys(userName);
    }

    public void she_provides_the_password_as(String password) {
        passwordField.sendKeys(password);
    }

    public void she_logs_in() {
        loginButtonField.click();
    }

}
