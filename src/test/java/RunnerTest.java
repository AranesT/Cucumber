import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition","Hooks"},
        plugin = "pretty",
        tags = "@auth or @check or @path or @creating"
)

public class RunnerTest {

}

