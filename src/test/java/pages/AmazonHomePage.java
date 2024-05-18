package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
    private WebDriver driver;
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchTerm(String term) {
        driver.findElement(searchBox).sendKeys(term);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}
