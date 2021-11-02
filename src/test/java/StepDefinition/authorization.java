package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import pages.pageAuthorizition;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class authorization {

    @Дано("Открытие страницы авторизации")
    public void openAuhorizePage() {
        open(utils.Configuration.getConfigurationValue("pageOfauthorize"));
    }

    @Когда("Введен логин {string}")
    public void enterLogin(String login) {
        page(pageAuthorizition.class).ClicButtonLogIn(login);
    }

    @И("Введен пароль {string}")
    public void enterPassword(String password) {
        page(pageAuthorizition.class).ClicButtonPassword(password);
    }

    @И("^нажата кнопка вход")
    public void enterButton() {
        page(pageAuthorizition.class).ClicButtonIn();
    }

    @Тогда("^Переход на главную страницу")
    public void goToMain() {
    }

}
