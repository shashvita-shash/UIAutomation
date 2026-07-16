

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Instructs JUnit to use Cucumber's engine to execute tests
@CucumberOptions(
        features = "src/test/resources/features", // Path to your .feature files
        glue = {"stepDefinitions"},              // Package name holding step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"} // Configures reporting tools
)
public class TestRunner {
    // This class body remains entirely empty.
}
