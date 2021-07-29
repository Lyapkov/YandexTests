package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"_2cmzC cia-vs\"]")
    WebElement board;

    @FindBy(xpath = "//div[@class=\"_2cmzC cia-vs\"]//article[1]//span[@data-tid=\"ce80a508\"]")
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
