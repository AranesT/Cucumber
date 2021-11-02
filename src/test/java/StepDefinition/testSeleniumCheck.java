package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import pages.pageAuthorizition;
import pages.pageTestSelenium;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class testSeleniumCheck {

    @Дано("Выполнена авторизация под логином {string} и паролем {string} для проверки статуса задачи TestSelenium")
    public void Authorize(String login, String password){
        open(utils.Configuration.getConfigurationValue("pageOfauthorize"));
        page(pageAuthorizition.class).ClicButtonLogIn(login);
        page(pageAuthorizition.class).ClicButtonPassword(password);
        page(pageAuthorizition.class).ClicButtonIn();
    }

    @Дано("Октрытие страницы задачи")
    public void openTaskPage() {
        open(utils.Configuration.getConfigurationValue("testSeleniumUrl"));
    }

    @Тогда("Проверка статуса")
    public void statusCheck() {
        page(pageTestSelenium.class).ShowStatus();
    }

    @И("Проверка версии")
    public void versionCheck() {
        page(pageTestSelenium.class).ShowVersion();
    }
}
