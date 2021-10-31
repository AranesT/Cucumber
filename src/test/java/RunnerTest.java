import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import test.TestBase;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition","Hooks"},
        plugin = "pretty",
        tags = "@auth or @all"
)

public class RunnerTest extends TestBase{

}

