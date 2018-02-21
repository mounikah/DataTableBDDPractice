package AutomationPractice.StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.PendingException;

import java.util.List;

public class LoginSteps {
    WebDriver driver;

    @Given("^User is on the home page$")
    public void user_is_on_the_home_page()  {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Newchromedriver1.exe");
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^User selects sign in button$")
    public void user_selects_sign_in_button()  {
        driver.findElement(By.xpath("//a[@class='login']")).click();
    }
    @Then("^User should see the login page$")
    public void user_should_see_the_login_page()  {
        Assert.assertEquals("Login - My Store",driver.getTitle());
        ;
    }

    @When("^User enter valid login details$")
    public void user_enter_valid_login_details(DataTable table) {
        List<List<String>> data= table.raw();
        System.out.println(data.get(1).get(0));
        driver.findElement(By.id("email")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("passwd")).sendKeys(data.get(2).get(1));
    }
    @And("^selects submit$")
    public void selects_submit()  {
       driver.findElement(By.id("SubmitLogin")).click(); ;
    }



    @Then("^User should login successfully$")
    public void user_should_login_successfully()  {
        Assert.assertEquals("My account - My Store",driver.getTitle());
    }



}
