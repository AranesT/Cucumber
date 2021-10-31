package StepDefinition;

import Hooks.WebDriverInicialization;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.pageAuthorizition;

import static com.codeborne.selenide.Selenide.page;

public class authorization {

    private WebDriver driver;
    public authorization(){
        this.driver = WebDriverInicialization.getDriver();
    }

    @Дано("Открытие страницы авторизации")
    public void открытиеСтраницыАвторизации() {
        driver.get("https://edujira.ifellow.ru/login.jsp");
    }

    @Когда("^Введен логин")
    public void введенЛогин() {
        page(pageAuthorizition.class).ClicButtonLogIn();
    }

    @И("^Введен пароль")
    public void введенПароль() {
        page(pageAuthorizition.class).ClicButtonPassword();
    }

    @И("^нажата кнопка вход")
    public void нажатаКнопка() {
        page(pageAuthorizition.class).ClicButtonIn();
    }

    @Тогда("^Переход на главную страницу")
    public void переходНаГлавнуюСтраницу() {
    }

}
