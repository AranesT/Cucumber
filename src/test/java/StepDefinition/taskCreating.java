package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import pages.pageAuthorizition;
import pages.pageTestProject;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class taskCreating {

    @Дано("Выполнена авторизация под логином {string} и паролем {string} для создания задачи")
    public void Authorize(String login, String password){
        open(utils.Configuration.getConfigurationValue("pageOfauthorize"));
        page(pageAuthorizition.class).ClicButtonLogIn(login);
        page(pageAuthorizition.class).ClicButtonPassword(password);
        page(pageAuthorizition.class).ClicButtonIn();
    }

    @Дано("Открыта страница проекта test")
    public void openProjectTestPage() {
        open(utils.Configuration.getConfigurationValue("testProjUrl"));
    }

    @Когда("Нажата кнопка создать")
    public void enterButtonCreate() {
        page(pageTestProject.class).NewTask();
    }

    @И("Введено имя {string} задачи")
    public void enterTaskName(String name) {
        page(pageTestProject.class).CreatingTaskName(name);
    }

    @И("Указана метка задачи {string}")
    public void enterLabel(String label) {
        page(pageTestProject.class).Label(label);
    }

    @И("Указан маркер задачи")
    public void enterMark() {
        page(pageTestProject.class).Maker();
    }

    @Тогда("Задача создана")
    public void enterTaskCreated() {
        page(pageTestProject.class).FinalTaskCreate();
    }

    @Дано("Создана новая задача под именем {string}, открыта ее страница")
    public void openTaskPage1(String name) {
        page(pageTestProject.class).QuicSearchh(name);
    }

    @Когда("Изменен статус задачи на В работе")
    public void changeTaskStatusInWork() {
        page(pageTestProject.class).ChangeTaskStatus1();
    }

    @Тогда("Вывод текущего статуса")
    public void printCurrentStatus() {
        page(pageTestProject.class).CheckTaskStatus();
    }

    @Дано("Создана новая задача под именем {string}, открыта страница")
    public void openTaskPage2(String name) {
        page(pageTestProject.class).QuicSearchh(name);
    }

    @Когда("Изменен статус задачи на Завершено")
    public void changeTaskStatusFinish(){
        page(pageTestProject.class).BusinessProcess()
                .CompleteTask();
    }

    @И("Открыто окно комментария")
    public void openComments() {
        page(pageTestProject.class).OpenComments();
    }

    @Тогда("Написать новый комментарий {string}")
    public void enterComment(String comment) {
        page(pageTestProject.class).CommentWriter(comment)
                .AddComment();
    }
}
