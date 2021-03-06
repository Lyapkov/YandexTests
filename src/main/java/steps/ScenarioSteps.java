package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();
    ProductsPageSteps productsPageSteps = new ProductsPageSteps();
    FiltersPageSteps filtersPageSteps = new FiltersPageSteps();

    @When("^нажата кнопка Маркет$")
    public void marketClick() {
        mainPageSteps.marketClick();
    }

    @When("^переход на вкладку \"(.+)\"$")
    public void transitionPage(String value) throws InterruptedException {
        new BaseSteps().transitionPage(value);
    }

    @When("^выбран раздел на главной странице \"(.+)\"$")
    public void electronicsClick(String item) {
        marketPageSteps.electronicsClick(item);
    }

    @When("^выбран раздел \"(.+)\"$")
    public void selectCatalogItem(String item) {
        electronicsPageSteps.selectCatalogItem(item);
    }

    @When("^нажата кнопка Все фильтры$")
    public void allFiltersClick() {
        productsPageSteps.allFiltersClick();
    }

    @When("^указана минимальная цена \"(.+)\"$")
    public void setMinPrice(String value) {
        filtersPageSteps.setMinPrice(value);
    }

    @When("^выбран производитель \"(.+)\"$")
    public void selectManufactureItem(String value) {
        filtersPageSteps.selectManufactureItem(value);
    }

    @When("^нажата кнопка Показать еще в разделе Производитель$")
    public void showAllButtonClick() {
        filtersPageSteps.showAllButtonClick();
    }

    @When("^нажата кнопка Показать предложения$")
    public void buttonShowClick() {
        filtersPageSteps.buttonShowClick();
    }

    @Then("^количество элементов на доске \"(.+)\"$")
    public void checkCountItemsInPage(String value) {
        productsPageSteps.checkCountItemsInPage(value);
    }

    @Then("^первый элемент совпадает с поиском$")
    public void searchCheck() {
        String text = productsPageSteps.getTextFirstElement();
        productsPageSteps.fillSearch(text);
        assertEquals(productsPageSteps.getTextFirstElement(), text);
    }
}
