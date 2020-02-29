package step_defination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SearchSteps  {
static WebDriver driver;


    @Given("^I am homepage$")
    public void i_am_homepage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String baseURL = "https://en-gb.facebook.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);

    }
            @When("^I enter email and password$")
    public void i_enter_email_and_password() throws InterruptedException {
        WebElement Emaillink=driver.findElement(By.id("email"));Emaillink.sendKeys("bhupendra2010@hotmail.com");
        WebElement Passlink=driver.findElement(By.id("pass"));Passlink.sendKeys("Bhupe1979");
        WebElement Login=driver.findElement(By.cssSelector("input[value='Log In']"));Login.click();
    sleep(3000);

    }

    @Then("^I should be able to login\\.$")
    public void i_should_be_able_to_login() {
        System.out.println("login Successful");

    }

}
