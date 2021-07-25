package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    MarketPageSteps marketPageSteps = new MarketPageSteps();
    ElectronicsPageSteps electronicsPageSteps = new ElectronicsPageSteps();
    ProductsPageSteps tvsPageSteps = new ProductsPageSteps();

    @When("^нажата кнопка Маркет$")
    public void marketClick() {
        mainPageSteps.marketClick();
    }

    @When("^переход на вкладку \"(.+)\"$")
    public void transitionPage(String value) throws InterruptedException {
        new BaseSteps().transitionPage(value);
    }

    @When("^выбран раздел Электроника$")
    public void electronicsClick() {
        marketPageSteps.electronicsClick();
    }

    @When("^выбран раздел \"(.+)\"$")
    public void selectCatalogItem(String item) {
        electronicsPageSteps.selectCatalogItem(item);
    }

    @When("^указана минимальная цена \"(.+)\"$")
    public void setMinPrice(String value) {
        tvsPageSteps.setMinPrice(value);
    }

    @When("^выбран производитель \"(.+)\"$")
    public void selectManufactureItem(String value) {
        tvsPageSteps.selectManufactureItem(value);
    }

    @Then("^количество элементов на доске \"(.+)\"$")
    public void checkCountItemsInPage(String value) {
        tvsPageSteps.selectManufactureItem(value);
    }

    @Then("^первый элемент совпадает с поиском$")
    public void searchCheck() {
        String text = tvsPageSteps.getTextFirstElement();
        tvsPageSteps.fillSearch(text);
        assertEquals(tvsPageSteps.getTextFirstElement(), text);
    }
}
