package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//amit9//IdeaProjects//Maven_Test1//Feature_File",
        glue = {"Step_Definitions", "hooks"},
        //tags = {"@test"},
        plugin = {"pretty"}
)



public class TestRunner {
}
