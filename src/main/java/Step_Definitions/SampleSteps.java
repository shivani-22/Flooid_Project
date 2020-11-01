package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleSteps {

    @Given("Its covid time")
    public void its_covid_time() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bbc.co.uk/news");
        System.out.println("Step 1 is passed");

    }

    @When("we go out")
    public void we_go_out() {
        System.out.println("Lets see");

    }

    @When("it is inside a closed space")
    public void it_is_inside_a_closed_space() {
        System.out.println("abc");

    }

    @Then("we must wear our face mask")
    public void we_must_wear_our_face_mask() {
        System.out.println("Bye");

    }
}
