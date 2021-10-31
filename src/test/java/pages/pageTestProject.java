package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.TestBase;

import static com.codeborne.selenide.Selenide.page;

public class pageTestProject extends TestBase {

    @FindBy(how = How.XPATH, using = "//*[@id='quickSearchInput']")
    private SelenideElement FinderWindow;

    @FindBy(how = How.XPATH, using = "//*[@id='quicksearch']/div[1]/div[1]/ul/li[1]/a")
    private SelenideElement CurrentTaskName;

    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/span")
    private SelenideElement amountOfProjects;
    //Не обнаруживает элемент при использовании коротого xPass

    @FindBy(how = How.XPATH, using = "//*[@id='create_link']")
    private SelenideElement createNewTask;

    @FindBy(how = How.XPATH, using = "//*[@id='summary']")
    private SelenideElement creatingTaskName;

    @FindBy(how = How.XPATH, using = "//*[@id='labels-textarea']")
    private SelenideElement label;

    @FindBy(how = How.XPATH, using = "//*[@id='assign-to-me-trigger']")
    private SelenideElement itisme;

    @FindBy(how = How.XPATH, using = "//*[@id='create-issue-submit']")
    private SelenideElement buttonCreateTask;

    @FindBy(how = How.XPATH, using = "//*[@id='quickSearchInput']")
    private SelenideElement quicSearch;

    @FindBy(how = How.XPATH, using = "//*[text()='Ошибка АТ Чирва']")
    private SelenideElement choiseMyTask;

    @FindBy(how = How.XPATH, using = "//*[@id='action_id_21']")
    private SelenideElement changeTaskStatus1;
    //Не обнаруживает элемент при использовании коротого xPass

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/div[1]/div[2]/ul/li[2]/div/span[1]/span")
    private SelenideElement checkTaskStatus;
    //Не обнаруживает элемент при использовании коротого xPass

    @FindBy(how = How.XPATH, using = "//*[@id='opsbar-transitions_more']/span" )
    private SelenideElement businessProcess;

    @FindBy(how = How.XPATH, using = "//*[@id='action_id_31']/span" )
    private SelenideElement completeTask;

    @FindBy(how = How.XPATH, using = "//*[@id='footer-comment-button']/span[2]" )
    private SelenideElement openComments;

    @FindBy(how = How.XPATH, using = "//*[@id='tinymce']/p" )
    private SelenideElement commentWriter;

    @FindBy(how = How.XPATH, using = "//*[@id='issue-comment-add-submit']")
    private SelenideElement addComment;

    public pageTestProject AmountOfProjects() {
        System.out.println("Количество проектов: " + amountOfProjects.getText().toString());
        return page(pageTestProject.class);
    }

    public pageTestProject TaskFinder() {
        FinderWindow.click();
        FinderWindow.sendKeys(TaskName);
        return page(pageTestProject.class);
    }

    public pageTestProject CurrentTaskChoiser() {
        CurrentTaskName.click();
        return page(pageTestProject.class);
    }

    public pageTestProject NewTask() {
        createNewTask.click();
        return page(pageTestProject.class);
    }

    public pageTestProject CreatingTaskName() {
        creatingTaskName.click();
        creatingTaskName.sendKeys(CreatingTaskName);
        return page(pageTestProject.class);
    }

    public pageTestProject Label() {
        label.click();
        label.sendKeys(LabelText);
        return page(pageTestProject.class);
    }

    public pageTestProject Maker() {
        itisme.click();
        return page(pageTestProject.class);
    }

    public pageTestProject FinalTaskCreate() {
        buttonCreateTask.click();
        return page(pageTestProject.class);
    }

    public pageTestProject QuicSearchh() {
        quicSearch.click();
        quicSearch.sendKeys(CreatingTaskName);
        choiseMyTask.click();
        return page(pageTestProject.class);
    }

    public pageTestProject ChangeTaskStatus1() {
        changeTaskStatus1.click();
        return page(pageTestProject.class);
    }

    public pageTestProject CheckTaskStatus() {
        System.out.println("Текущий статус моей задачи: " + checkTaskStatus.getText().toString());
        return page(pageTestProject.class);
    }

    public pageTestProject BusinessProcess() {
        businessProcess.click();
        return page(pageTestProject.class);
    }

    public pageTestProject CompleteTask() {
        completeTask.click();
        return page(pageTestProject.class);
    }

    public pageTestProject OpenComments() {
        openComments.click();
        return page(pageTestProject.class);
    }

    public pageTestProject CommentWriter() {
        Selenide.switchTo().frame("mce_0_ifr");
        commentWriter.sendKeys(MyComment);
        Selenide.switchTo().defaultContent();
        return page(pageTestProject.class);
    }

    public pageTestProject AddComment() {
        addComment.click();
        return page(pageTestProject.class);
    }
}
