package ebay.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebay.homefactory.HomeClass;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;


public class StepDefinition {
    HomeClass Home = new HomeClass();

    @Given("^user IS ON Ebay Homepage$")
    public void user_IS_ON_Ebay_Homepage() {
        // Write code here that turns the phrase above into concrete actions
        //Home.pageURL();
    }

    @When("^user can search product \"([^\"]*)\"$")
    public void user_can_search_product(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete action
        Home.searchbox("nike");
    }


    @When("^user click on searchbox$")
    public void user_click_on_searchbox() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Home.clickonsearch();
    }

    @When("^user can select the price list \"([^\"]*)\"$")
    public void user_can_select_the_price_list(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        // Home.lowtohigh();
        Home.selectproduct();

    }

    @When("^user can print all the pricelist from \"([^\"]*)\"$")
    public void user_can_print_all_the_pricelist_from(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Home.selectsize();
    }

    @Then("^user can see the respective results$")
    public void user_can_see_the_respective_results() throws Throwable {
        //Write code here that turns the phrase above into concrete actions
        Home.addtocart();
    }

}

