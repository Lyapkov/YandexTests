package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FiltersPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"_1SfMJ l1f-a\"]/div[1]/input")
    WebElement minPrice;

    @FindBy(xpath = "//div[@data-filter-id=\"7893318\"]/div[@class=\"_3918R _2GwyK\"]")
    WebElement manufacturer;

    @FindBy(xpath = "//button[@class=\"zsSJk dOdmr _1QJa9\"]")
    WebElement showAllButton;

    @FindBy(xpath = "//a[@class=\"_2qvOO _3qN-v _1Rc6L\"]")
    WebElement buttonShow;

    public FiltersPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void setMinPrice(String value) {
        fillField(minPrice, value);
    }

    public void showAllButtonClick() {
        scroll(showAllButton);
        showAllButton.click();
    }

    public void selectManufactureItem(String itemName) {
        scroll(manufacturer.findElement(By.xpath(".//div[contains(@class,'_307sS _2k6P8')]//input[contains(@value,'" + itemName + "')]")));
        manufacturer.findElement(By.xpath(".//div[contains(@class,'_307sS _2k6P8')]//*[contains(text(),'" + itemName + "')]")).click();
    }

    public void buttonShowClick() {
        buttonShow.click();
    }
}
