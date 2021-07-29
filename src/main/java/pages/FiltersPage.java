package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FiltersPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div[2]/div[1]/div[2]/div/div/div/div[1]/input")
    WebElement minPrice;

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div[2]/div[1]/div[7]/div")
    WebElement manufacturer;

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div[2]/div[1]/div[7]/div/div/div/button")
    WebElement showAllButton;

    @FindBy(xpath = "/html/body/div[2]/section/div[2]/div/div/div[3]/div/div/a[2]")
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
