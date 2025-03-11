//package stepdefinition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.But;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageClasses.logpage1;
//import Utility.Base;
//
//public class LoginPage extends Base {
//   public static Base base;
//    logpage1 page = new logpage1();
//
//    @Given("I navigate to the login page")
//    public void i_navigate_to_the_login_page() {
//    	base.driver.get("https://www.rediff.com/");
//    	driver.get("https://www.rediff.com/");
//        System.out.println("Navigated to the website page");
//    }
//    
//    @When("I clicked signin link")
//    public void i_clicked_signin_link() {
//    	 page.signinLink();
//         System.out.println("Clicked the signin link");
//    }
//
//
//    @And("I entered {string} and {string}")
//    public void i_entered_and(String username, String password) {
//        page.getLogin(username, password);
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//    }
//
//    @But("User enters invalid {string} and correct {string}")
//    public void user_enters_invalid_and_correct(String username, String password) {
//        page.getLogin(username, password);
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//    }
//
//    @But("User enters correct {string} and invalid {string}")
//    public void user_enters_correct_and_invalid(String username, String password) {
//        page.getLogin(username, password);
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//    }
//
//    @Then("I clicked signin button")
//    public void i_clicked_signin_button() {
//        page.SignIn();
//        System.out.println("Signed In");
//    }
//    
//
//    
//    
//
//   
//
//}
