package steps;

import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FiltersPageSteps {

    @Step("выбран производитель {0}")
    public void selectManufactureItem(String value) {
        new FiltersPage().selectManufactureItem(value);
    }

    @Step("установлена минимальная цена {0}")
    public void setMinPrice(String value) {
        new FiltersPage().setMinPrice(value);
    }

    @Step("нажата кнопка Показать предложения")
    public void buttonShowClick() {
        new FiltersPage().buttonShowClick();
    }

    @Step("нажата кнопка Показать еще")
    public void showAllButtonClick() {
        new FiltersPage().showAllButtonClick();
    }
}
