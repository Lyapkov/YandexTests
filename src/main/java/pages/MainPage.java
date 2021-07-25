package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MainPage extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[3]/div/div[2]/nav/div/ul/li[2]/a")
    WebElement market;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void marketClick() {
        market.click();
    }

}
