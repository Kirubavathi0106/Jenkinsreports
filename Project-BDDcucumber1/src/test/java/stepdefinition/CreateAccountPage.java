package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Utility.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.CreatePage1;

public class CreateAccountPage extends Base {
    public static Base base;
    CreatePage1 page = new CreatePage1();

    @Given("I navigate to website page")
    public void i_navigate_to_website_page() {
    	base.driver = new ChromeDriver();
        base.driver.get("https://www.rediff.com/");
        System.out.println("Opened Rediff homepage successfully");
    }

    @When("I clicked sign in link")
    public void i_clicked_sign_in_link() {
        page.signIn();
        System.out.println("Sign-in button clicked");
    }

    @When("I clicked create account link")
    public void i_clicked_create_account_link() {
        page.accountCreation();
        System.out.println("Navigated to account creation page");
    }

    @When("I entered the details")
    public void i_entered_the_details() {
        page.enterformDetails();
        System.out.println("All required details filled in the form");
    }

    @Then("I clicked the create account button")
    public void i_clicked_the_create_account_button() {
       //Assert.assertEquals(10, 20);
        page.createAccount();
        System.out.println("Create account button clicked, account creation in progress");
    }
}
