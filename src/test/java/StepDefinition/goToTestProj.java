package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import pages.pageAuthorizition;
import pages.pageMain;
import pages.pageTestProject;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class goToTestProj {

    @Дано("Выполнена авторизация под логином {string} и паролем {string} для перехода к проекту")
    public void Authorize(String login, String password){
        open(utils.Configuration.getConfigurationValue("pageOfauthorize"));
        page(pageAuthorizition.class).ClicButtonLogIn(login);
        page(pageAuthorizition.class).ClicButtonPassword(password);
        page(pageAuthorizition.class).ClicButtonIn();
    }

    @Дано("Открытие main страницы сайта с авторизованными данными")
    public void openMainPage() {
        open(utils.Configuration.getConfigurationValue("mainPageUrl"));
    }

    @Тогда("Переход на страницу проекта")
    public void goToProjectPage() {
        page(pageMain.class).ClicButtonProjects()
                .ChooseTest();
    }

    @И("Поверка количества заведенных заданий")
    public void amountOfTasksCheck() {
        page(pageTestProject.class).AmountOfProjects();
    }

}
