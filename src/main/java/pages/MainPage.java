package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[@data-id=\"market\"]")
    WebElement market;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void marketClick() {
        market.click();
    }

}
