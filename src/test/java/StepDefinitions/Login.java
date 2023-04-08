package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class Login extends CommonMethods {

    /*@Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        openBrowserAndLaunchApplication();
    }*/
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigReader.getPropertyValue("userName"));
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[@type='text']"));
        sendText(userNameTextBox,ConfigReader.getPropertyValue("username"));

        //driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigReader.getPropertyValue("password"));
        WebElement passwordTextBox=driver.findElement(By.xpath("//input[@type='password']"));
        sendText(passwordTextBox,ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
       WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
       doClick(loginBtn);
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userLoggedIn = driver.findElement(By.xpath("//a[text()='Welcome Admin']")).isDisplayed();
        if (userLoggedIn) {
            System.out.println("user is successfully logged in!");

        }
    }
   /* @Then("close the browser")
    public void close_the_browser() {
        closeBrowser();
    }*/
}
