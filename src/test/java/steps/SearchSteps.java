package steps;

import config.Config;
import base.BaseTest;
import pages.AmazonHomePage;
import pages.SearchResultsPage;
import pages.ProductDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class SearchSteps {
    private AmazonHomePage homePage;
    private SearchResultsPage resultsPage;
    private ProductDetailsPage detailsPage;

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

    @When("I click on one of the products")
    public void i_click_on_one_of_the_products() {
        assertTrue("No search results found", resultsPage.getProductTitles().size() > 0);
        detailsPage = resultsPage.clickOnProduct(0); // Clicking on the first product
    }

    @Then("I should see the product details page")
    public void i_should_see_the_product_details_page() {
        assertTrue("Product details page did not load correctly", detailsPage.isPageLoaded());
    }

    @When("I apply the filter {string}")
    public void i_apply_the_filter(String filter) {
        resultsPage.applyFilter(filter);
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {
        assertTrue("No search results found", resultsPage.getProductTitles().size() > 0);
    }

    @When("I navigate to the next page")
    public void i_navigate_to_the_next_page() {
        assertTrue("Next page button not present", resultsPage.isNextPageButtonPresent());
        resultsPage.clickNextPage();
    }

    @Then("I should see search results on the next page")
    public void i_should_see_search_results_on_the_next_page() {
        assertTrue("No search results found on next page", resultsPage.getProductTitles().size() > 0);
    }
}
