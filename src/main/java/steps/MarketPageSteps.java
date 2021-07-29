package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketPageSteps {

    @Step("выбран раздел {0}")
    public void electronicsClick(String item) {
        new MarketPage().selectChapterItem(item);
    }
}
