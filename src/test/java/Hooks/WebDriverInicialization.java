package Hooks;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.pageAuthorizition;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.page;

public class WebDriverInicialization {
    private static WebDriver driver;

    @Before
    public void open(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/WebDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void end(){
        driver.quit();
    }

    @Before("@all")
    public void authorize(){
        driver.get("https://edujira.ifellow.ru/login.jsp");
        page(pageAuthorizition.class).ClicButtonLogIn();
        page(pageAuthorizition.class).ClicButtonPassword();
        page(pageAuthorizition.class).ClicButtonIn();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
