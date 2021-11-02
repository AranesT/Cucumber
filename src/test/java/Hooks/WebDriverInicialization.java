package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverInicialization {

    @Before
    public void setDriverProps(){
        String webDriverLocation = utils.Configuration.getConfigurationValue("webdriverlocationLOCAL");

        if (webDriverLocation != null) {
            System.setProperty("webdrriver.chrome.driver", webDriverLocation);
            System.setProperty("selenide.browser", "Chrome");
            Configuration.startMaximized = true;
        }
    }

    @After
    public void end(){
        WebDriverRunner.closeWebDriver();
    }

}
