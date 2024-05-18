package steps;

import config.Config;
import base.BaseTest;
import pages.AmazonHomePage;
import pages.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private AmazonHomePage homePage;
    private SearchResultsPage resultsPage;

    @Given("I am on the Amazon home page")
    public void i_am_on_the_amazon_home_page() {
        BaseTest.getDriver().get(Config.BASE_URL);
        homePage = new AmazonHomePage(BaseTest.getDriver());
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        homePage.enterSearchTerm(searchTerm);
        homePage.clickSearchButton();
        resultsPage = new SearchResultsPage(BaseTest.getDriver());
    }

    @When("I apply the filter {string}")
    public void i_apply_the_filter(String filter) {
        resultsPage.applyFilter(filter);
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        assertTrue(resultsPage.getProductTitles().size() > 0);
    }

    @Then("I should be able to navigate to the next page")
    public void i_should_be_able_to_navigate_to_the_next_page() {
        assertTrue(resultsPage.isNextPageButtonPresent());
        resultsPage.clickNextPage();
        assertTrue(resultsPage.getProductTitles().size() > 0);
    }
}
