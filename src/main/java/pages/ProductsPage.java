package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/div[5]/div/div[2]/div/div/div")
    WebElement board;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/div[5]/div/div[2]/div/div/div/div/div/div/article[1]/div[4]/div[1]/h3/a/span")
    WebElement firstElement;

    @FindBy(xpath = "//*[@id=\"header-search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"search-prepack\"]/div/div/div/div/div[3]/div/div/a")
    WebElement allFilters;


    public ProductsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void allFiltersClick() {
        allFilters.click();
    }

    public List<WebElement> countItemsInPage() {
        return board.findElements(By.xpath("//article[@data-autotest-id=\"product-snippet\"]"));
    }

    public String getTextFirstElement() {
        return firstElement.getText();
    }

    public void fillSearch(String value) {
        fillField(search, value);
        search.sendKeys(Keys.ENTER);
    }
}
