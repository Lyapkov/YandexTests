package steps;

import pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicsPageSteps {

    @Step("выбран раздел {0}")
    public void selectCatalogItem(String item) {
        new ElectronicPage().selectCatalogItem(item);
    }
}
