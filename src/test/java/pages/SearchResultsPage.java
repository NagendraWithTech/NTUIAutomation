package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    private By productTitles = By.cssSelector(".s-title");
    private By nextPageButton = By.cssSelector(".s-pagination-next");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getProductTitles() {
        return driver.findElements(productTitles);
    }

    public void applyFilter(String filter) {
        // Implement filter application logic here
        //Requirements are not clear as of now
    }

    public ProductDetailsPage clickOnProduct(int index) {
        List<WebElement> products = getProductTitles();
        if (index < products.size()) {
            products.get(index).click();
            return new ProductDetailsPage(driver);
        } else {
            throw new IllegalArgumentException("Index out of bounds for product list");
        }
    }

    public boolean isNextPageButtonPresent() {
        return !driver.findElements(nextPageButton).isEmpty();
    }

    public void clickNextPage() {
        driver.findElement(nextPageButton).click();
    }
}
