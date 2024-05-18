package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    private WebDriver driver;

    // Locators for elements on the product details page
    private By productTitle = By.id("productTitle");
    private By productDescription = By.id("productDescription");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to check if the product title is displayed
    public boolean isProductTitleDisplayed() {
        return driver.findElements(productTitle).size() > 0;
    }

    // Method to check if the product description is displayed
    public boolean isProductDescriptionDisplayed() {
        return driver.findElements(productDescription).size() > 0;
    }

    // Method to check if the product details page is loaded correctly
    public boolean isPageLoaded() {
        return isProductTitleDisplayed() && isProductDescriptionDisplayed();
    }
}
