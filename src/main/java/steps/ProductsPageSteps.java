package steps;

import org.openqa.selenium.WebElement;
import pages.ProductsPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProductsPageSteps {

    @Step("выполнен переход на старницу Все фильтры")
    public void allFiltersClick() {
        new ProductsPage().allFiltersClick();
    }

    @Step("количество элементов на доске {0}")
    public void checkCountItemsInPage(String count) {
        String actual = String.valueOf(new ProductsPage().countItemsInPage().size());
        assertEquals(count, actual);
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
