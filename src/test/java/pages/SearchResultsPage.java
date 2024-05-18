package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    private By nextPageButton = By.cssSelector(".s-pagination-next");
    private By filterOption = By.cssSelector("span.a-list-item > a > span"); // Adjust the selector based on the filter
    private By productTitles = By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNextPage() {
        driver.findElement(nextPageButton).click();
    }

    public void applyFilter(String filter) {
        driver.findElement(By.xpath("//span[text()='" + filter + "']")).click();
    }

    public List<WebElement> getProductTitles() {
        return driver.findElements(productTitles);
    }

    public boolean isNextPageButtonPresent() {
        return driver.findElements(nextPageButton).size() > 0;
    }
}
