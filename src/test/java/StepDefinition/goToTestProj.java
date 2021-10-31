package StepDefinition;

import Hooks.WebDriverInicialization;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.pageMain;
import pages.pageTestProject;

import static com.codeborne.selenide.Selenide.page;

public class goToTestProj {

    private WebDriver driver;
    public goToTestProj(){
        this.driver = WebDriverInicialization.getDriver();
    }

    @Дано("Открытие main страницы сайта с авторизованными данными")
    public void ОткрытиеMainСтраницыСайтаСАвторизованнымиДанными() {
        driver.get("https://edujira.ifellow.ru/secure/Dashboard.jspa");
    }

    @Тогда("Переход на страницу проекта")
    public void переходНаСтраницуПроекта() {
        page(pageMain.class).ClicButtonProjects()
                .ChooseTest();
    }

    @И("Поверка количества заведенных заданий")
    public void поверкаКоличестваЗаведенныхЗаданий() {
        page(pageTestProject.class).AmountOfProjects();
    }
}
