package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step("выбран раздел Электроника")
    public void electronicsClick() {
        new MarketPage().electronicsClick();
    }
}
