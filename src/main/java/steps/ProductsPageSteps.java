package steps;

import pages.ProductsPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;

public class ProductsPageSteps {

    @Step("установлена минимальная цена {0}")
    public void setMinPrice(String value) {
        new ProductsPage().setMinPrice(value);
    }

    @Step("выбран производитель {0}")
    public void selectManufactureItem(String value) {
        new ProductsPage().selectManufactureItem(value);
    }

    @Step("количество элементов на доске {0}")
    public void checkCountItemsInPage(String count) {
        String actual = new ProductsPage().countItemsInPage();
        assertEquals(actual, count);
    }

    @Step("получаем название первого товара")
    public String getTextFirstElement() {
        return new ProductsPage().getTextFirstElement();
    }

    @Step("вставляем {0} в строку поиска и осществляем поиск")
    public void fillSearch(String value) {
        new ProductsPage().fillSearch(value);
    }
}
