package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserForm {

    WebDriver driver;

    @FindBy(id = "TitleId")                 private WebElement titleField;
    @FindBy(id = "FirstName")                 private WebElement fNameField;
    @FindBy(id = "MiddleName")                 private WebElement mNameField;

    public UserForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_title(String title) {
        Select titleDropdown = new Select(titleField);
        titleDropdown.selectByVisibleText(title);
    }

    public void enter_firstname(String fname) {
        fNameField.sendKeys(fname);
    }

    public void enter_middlename(String mname) {
        mNameField.sendKeys(mname);
    }

    public void she_should_be_taken_to_the_landing_page() {
        System.out.println("\nIn User form code");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Assert.assertTrue(signOutLinkDisplayed);
    }
}
