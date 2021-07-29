package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"_3mU1o\"]")
    WebElement header;

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectChapterItem(String itemName) {
        header.findElement(By.xpath(".//div[contains(@class,'_35SYu _1vnug')]//*[contains(text(),'" + itemName + "')]")).click();
    }
}
