package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.TestBase;

import static com.codeborne.selenide.Selenide.page;

public class pageTestSelenium extends TestBase {

    @FindBy(how = How.XPATH, using = "//*[@id='status-val']/span")
    private SelenideElement taskStatus;

    @FindBy(how = How.XPATH, using = "//*[@id='versions-field']/span")
    private SelenideElement currentVersion;

    public pageTestSelenium ShowStatus() {
        System.out.println("Статус задачи " + TaskName + ": "+ taskStatus.getText().toString());
        return page(pageTestSelenium.class);
    }

    public pageTestSelenium ShowVersion() {
        System.out.println("Текущая версия: " + currentVersion.getText().toString());
        return page(pageTestSelenium.class);
    }
}
