package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class pageMain {

    @FindBy(how = How.XPATH, using = "//*[@id='browse_link']")
    private SelenideElement Projects;

    @FindBy(how = How.XPATH, using = "//*[@id='admin_main_proj_link_lnk']")
    private SelenideElement ProjectTest;

    public pageMain ClicButtonProjects() {
        Projects.click();
        return page(pageMain.class);
    }

    public pageMain ChooseTest() {
        ProjectTest.click();
        return page(pageMain.class);

    }
}
