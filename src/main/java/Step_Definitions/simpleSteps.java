package Step_Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleSteps {
WebDriver drive;

    @Given("I open a google search page")
    public void i_open_a_google_search_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
    }

    @When("I search for Flooid")
    public void i_search_for_flooid() {


        WebElement search_bar = drive.findElement(By.cssSelector("form.sb_form.hassbi.hasmic"));
        search_bar.click();
        search_bar.sendKeys("Flooid coventry phone number");

    }

    @Then("it should return results")
    public void it_should_return_results() {

    }
}
