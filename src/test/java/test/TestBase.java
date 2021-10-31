package test;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;
    //String webdriverlocation = utils.Configuration.getConfigurationFile("webdriverlocationLOCAL");
    public String Login = "achirva";
    public String Password = "123qaz!@#QAZ";
    public String TaskName = "TestSelenium";
    public String CreatingTaskName = "Ошибка АТ Чирва";
    public String LabelText = "blitz_test";
    public String MyComment = "Задача выполнена!";

    @BeforeEach
    public void start(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterEach
    public void end(){
        driver.quit();
    }

}
