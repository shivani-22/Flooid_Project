package Step_Definitions;

import helpers.helperMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class flooidProjectSteps
{
    WebDriver driver;
    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("I open a google search page")
    public void i_open_a_google_search_page() {

        driver.get("https://bing.com/");

    }

    @When("I search for Flooid")
    public void i_search_for_flooid() {

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("Flooid coventry Phone Number");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();

    }

    @Then("it should return results")
    public void it_should_return_results() {
        if
        (driver.findElements(By.id("b_results")).size() != 0) {
            System.out.println("I can see the returned search results");
        } else {
            System.out.println("I can not see the returned search results");
        }


    }

    @Given("I consider the top five websites")
    public void i_consider_the_top_five_websites() {
        driver.get("https://www.bing.com/search?q=Flooid+coventry+Phone+Number&search=&form=QBLH");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement results = driver.findElement(By.id("b_results"));
        wait.until(ExpectedConditions.visibilityOf(results));

    }


    @When("I visit on them one by one")
    public void i_visit_on_them_one_by_one() {

        for (int i = 0; i <= 5; i++) {
            List<WebElement> alllinks = driver.findElements(By.cssSelector("li h2 a"));
            System.out.println("The value of iteration is" + i);
            alllinks.get(i).click();

            System.out.println("Yes! I can I click the next link from the list");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            if (driver.getPageSource().replaceAll("\\s", "").contains("2476694455")) {
                System.out.println("Match is found");
            } else {
                System.out.println("Match not found");
            }


            String currentUrlIs = driver.getCurrentUrl();
            System.out.println("The current url is" + currentUrlIs);

            driver.navigate().back();
            System.out.println("I went back to the search results");
            WebDriverWait wait = new WebDriverWait(driver, 10);

            wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("b_results"))));
            System.out.println("I can see the search results again");
            driver.navigate().refresh();
            System.out.println("I have refreshed the search results");


            List<WebElement> linkElements = driver.findElements(By.cssSelector("li h2 a"));
            WebDriverWait wait1 = new WebDriverWait(driver, 20);
            wait1.until(ExpectedConditions.visibilityOfAllElements(linkElements));
            System.out.println("I can see all the listed search results again after refreshing the page");

        }


    }

    @When("Check for the presence of Flooid Coventry phone number")
    public void check_for_the_presence_of_flooid_coventry_phone_number() {
        System.out.println("Achieved above! We checked for the presence of Flooid Coventry Phone Number");

    }

    @Then("The websites that displays the number on their prime page are a pass")
    public void the_websites_that_displays_the_number_on_their_prime_page_are_a_pass() {
        System.out.println("Achieved above! We have matched the phone number against all the search results " +
                "and have printed out the matched cases");

    }

    @When("The websites doesnt have phone number displayed on their prime page")
    public void the_websites_doesnt_have_phone_number_displayed_on_their_prime_page() {
        System.out.println("Achieved above! We have run a fair iteration on each of the search results " +
                "and have carefully flagged the websites that did not mention Flooid phone number ");

    }

    @Then("Its a fail case")
    public void its_a_fail_case()
    {
        System.out.println("Achieved above! When our search runs and fails to find out Flooid phone number " +
                "on a certain website we explicitly flag it as a Match Not Found case which prints out on the console");
        driver.quit();
    }

}


