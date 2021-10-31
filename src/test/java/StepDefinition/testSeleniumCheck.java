package StepDefinition;

import Hooks.WebDriverInicialization;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.pageMain;
import pages.pageTestSelenium;

import static com.codeborne.selenide.Selenide.page;

public class testSeleniumCheck {

    private WebDriver driver;
    public testSeleniumCheck(){
        this.driver = WebDriverInicialization.getDriver();
    }

    @Дано("Октрытие страницы задачи")
    public void октрытиеСтраницыЗадачи() {
        driver.get("https://edujira.ifellow.ru/browse/TEST-374?jql=text%20~%20%22TestSelenium%22");
    }

    @Тогда("Проверка статуса")
    public void проверкаСтатуса() {
        page(pageTestSelenium.class).ShowStatus();
    }

    @И("Проверка версии")
    public void проверкаВерсии() {
        page(pageTestSelenium.class).ShowVersion();
    }
}
