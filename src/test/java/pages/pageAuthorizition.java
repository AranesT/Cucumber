package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class pageAuthorizition {

    @FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/section/form/div[1]/div[1]/div/div[1]/input")
    private SelenideElement LoginLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-password']")
    private SelenideElement PasswordLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-submit']")
    private SelenideElement ButtonLogIn;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-cancel']")
    private SelenideElement ButtonCantIn;

    public  pageAuthorizition ClicButtonLogIn(String login) {
        LoginLane.click();
        LoginLane.sendKeys(login);
        return page(pageAuthorizition.class);
    }

    public pageAuthorizition ClicButtonPassword(String password) {
        PasswordLane.click();
        PasswordLane.sendKeys(password);
        return page(pageAuthorizition.class);
    }

    public pageAuthorizition ClicButtonIn() {
        ButtonLogIn.click();
        return page(pageAuthorizition.class);
    }

}
