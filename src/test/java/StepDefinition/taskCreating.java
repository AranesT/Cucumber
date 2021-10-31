package StepDefinition;

import Hooks.WebDriverInicialization;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pages.pageMain;
import pages.pageTestProject;

import static com.codeborne.selenide.Selenide.page;

public class taskCreating {

    private WebDriver driver;
    public taskCreating(){
        this.driver = WebDriverInicialization.getDriver();
    }

    @Дано("Открыта страница проекта test")
    public void открытаСтраницаПроектаTest() {
        driver.get("https://edujira.ifellow.ru/projects/TEST/issues/TEST-301?filter=allopenissues");
    }

    @Когда("Нажата кнопка создать")
    public void нажатаКнопкаСоздать() {
        page(pageTestProject.class).NewTask();
    }

    @И("Введено имя задачи")
    public void введеноИмяЗадачи() {
        page(pageTestProject.class).CreatingTaskName();
    }

    @И("Указана метка задачи")
    public void указанаМеткаЗадачи() {
        page(pageTestProject.class).Label();
    }

    @И("Указан маркер задачи")
    public void указанМаркерЗадачи() {
        page(pageTestProject.class).Maker();
    }

    @Тогда("Задача создана")
    public void задачаСоздана() {
        page(pageTestProject.class).FinalTaskCreate();
    }

    @Дано("Создана новая задача, открыта ее страница")
    public void созданаНоваяЗадачаОткрытаЕеСтраница() {
        page(pageTestProject.class).QuicSearchh();
    }

    @Когда("Изменен статус задачи на В работе")
    public void измененСтатусЗадачи() {
        page(pageTestProject.class).ChangeTaskStatus1();
    }

    @Тогда("Вывод текущего статуса")
    public void выводТекущегоСтатуса() {
        page(pageTestProject.class).CheckTaskStatus();
    }

    @Дано("Создана новая задача, открыта страница")
    public void созданаНоваяЗадачаОткрытаСтраница() {
        page(pageTestProject.class).QuicSearchh();
    }

    @Когда("Изменен статус задачи на Завершено")
    public void ИзмененСтатусЗадачиНаЗавершено(){
        page(pageTestProject.class).BusinessProcess()
                .CompleteTask();
    }

    @И("Открыто окно комментария")
    public void открытоОкноКомментария() {
        page(pageTestProject.class).OpenComments();
    }

    @Тогда("Написать новый комментарий")
    public void написатьНовыйКомментарий() {
        page(pageTestProject.class).CommentWriter()
                .AddComment();
    }
}
