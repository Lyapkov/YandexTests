package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePage {

    @FindBy(xpath = "/html/body/div[4]/div[4]/noindex/div/div/div/div/div[1]/div[3]/div/a")
    WebElement electronics;

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void electronicsClick() {
        electronics.click();
    }

}
