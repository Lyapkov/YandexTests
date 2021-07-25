package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"glpricefrom\"]")
    WebElement minPrice;

    @FindBy(xpath = "//*[@id=\"search-prepack\"]/div/div/div/div/div[2]/div[4]/div/div/fieldset/ul")
    WebElement manufacturer;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/div[5]/div/div[2]/div/div/div/div/div/div")
    WebElement board;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div[3]/div[5]/div/div[2]/div/div/div/div/div/div/article[1]/div[4]/div[1]/h3/a/span")
    WebElement firstElement;

    @FindBy(xpath = "//*[@id=\"header-search\"]")
    WebElement search;

    public ProductsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setMinPrice(String value) {
        fillField(minPrice, value);
    }

    public void selectManufactureItem(String itemName) {
        manufacturer.findElement(By.xpath(".//li[contains(@class,'_1-l0XiE_ze')]/*[contains(text(),'"+itemName+"')]")).click();
    }

    public String countItemsInPage() {
        return board.getSize().toString();
    }

    public String getTextFirstElement() {
        return firstElement.getText();
    }

    public void fillSearch(String value) {
        fillField(search, value);
        search.sendKeys(Keys.ENTER);
    }
}
