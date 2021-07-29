package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage extends BasePage {

    @FindBy(xpath = "//div[@data-tid=\"cb168a42\"]")
    WebElement catalog;

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void selectCatalogItem(String item) {
        catalog.findElement(By.xpath(".//div[contains(@class,'_1YdrM')]//a[contains(text(),'"+item+"')]")).click();
    }
}
