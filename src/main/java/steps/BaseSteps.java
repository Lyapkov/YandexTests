package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseSteps {
    private static WebDriver driver;
    private static Wait<WebDriver> wait;
    private static JavascriptExecutor jse;
    private static Logger log = Logger.getLogger(BaseSteps.class.getName());

    @Before
    public void startScenario() {
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, 5, 1000);
        driver.get("https://yandex.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @After
    public static void afterClass() {
        driver.quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static Wait<WebDriver> getWait() {
        return wait;
    }

    public static JavascriptExecutor getJse() {
        return jse;
    }

    public static WebDriver getDriver() {
        return driver;
    }


    @Step("Переход на вкладку {0}")
    public void transitionPage(String value) throws InterruptedException {
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        int index = (Integer.parseInt(value) - 1);
        if (tabs2.size() > index) {
            log.info("Переход был выполнен");
            driver.switchTo().window(tabs2.get(index));
            log.info(driver.getCurrentUrl());
        } else log.info("Переход не был выполнен");
    }
}
