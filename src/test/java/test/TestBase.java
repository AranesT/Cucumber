package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeEach
    public void setDriverProps(){
        String webDriverLocation = utils.Configuration.getConfigurationValue("webdriverlocationLOCAL");
        if (webDriverLocation != null) {
            System.setProperty("webdrriver.chrome.driver", webDriverLocation);
            System.setProperty("selenide.browser", "Chrome");
            Configuration.startMaximized = true;
        }
    }

    @AfterEach
    public void end(){
        WebDriverRunner.closeWebDriver();
    }

}
