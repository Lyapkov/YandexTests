package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div")
    WebElement catalog;

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void selectCatalogItem(String item) {
        catalog.findElement(By.xpath(".//div[contains(@class,'_1YdrM')]//a[contains(text(),'"+item+"')]")).click();
    }
}
