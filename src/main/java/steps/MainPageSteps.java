package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps {

    @Step("Нажата кнопка Маркет")
    public void marketClick() {
        new MainPage().marketClick();
    }
}
