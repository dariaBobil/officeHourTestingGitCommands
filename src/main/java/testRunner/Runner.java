package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Runner {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/main/resources/features",
            glue = "src/main/java/automationUtility/stepDefinitions",
            dryRun = false
    )

    public class Run {



    }
}
