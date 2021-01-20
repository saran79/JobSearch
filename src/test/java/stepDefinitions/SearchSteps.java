package stepDefinitions;

import PageObjects.SearchPage;
import functionsLibrarry.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSteps extends CommonFunctions {

     SearchPage searchPage = new SearchPage(driver);
    @Given("^I navigate to the provided URL$")
    public void i_navigate_to_the_provided_URL()  {
        driver.get("https://www.cwjobs.co.uk/");
        
    }

    @When("^I am on  the Home page$")
    public void i_am_on_the_Home_page()  {
        Assert.assertTrue(searchPage.validateHomePage());
    }

    @When("^I enter the Search item as \"([^\"]*)\"$")
    public void i_enter_the_Search_item_as(String searchText)  {
        searchPage.setSearchText(searchText);
    }

    @When("^I Hit the Search Icon$")
    public void i_Hit_the_Search_Icon()  {
        searchPage.clickSearchIcon();
    }
    @Then("^I should be able to view the List of Relevant Search Items as \"([^\"]*)\"$")
    public void i_should_be_able_to_view_the_List_of_Relevant_Search_Items_as(String expectedResult)  {
        wait(5);
        Assert.assertEquals(expectedResult,searchPage.getJobsListTitle());

    }


}
