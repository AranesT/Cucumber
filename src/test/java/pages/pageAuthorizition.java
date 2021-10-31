package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import test.TestBase;

import static com.codeborne.selenide.Selenide.page;

public class pageAuthorizition extends TestBase {

    @FindBy(how = How.XPATH, using = "/html/body/div/section/div/div/section/form/div[1]/div[1]/div/div[1]/input")
    private SelenideElement LoginLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-password']")
    private SelenideElement PasswordLane;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-submit']")
    private SelenideElement ButtonLogIn;

    @FindBy(how = How.XPATH, using = "//*[@id='login-form-cancel']")
    private SelenideElement ButtonCantIn;

    public  pageAuthorizition ClicButtonLogIn() {
        LoginLane.click();
        LoginLane.sendKeys(Login);
        return page(pageAuthorizition.class);
    }

    public pageAuthorizition ClicButtonPassword() {
        PasswordLane.click();
        PasswordLane.sendKeys(Password);
        return page(pageAuthorizition.class);
    }

    public pageAuthorizition ClicButtonIn() {
        ButtonLogIn.click();
        return page(pageAuthorizition.class);
    }

}
