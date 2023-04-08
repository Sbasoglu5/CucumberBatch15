package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeeSearch extends CommonMethods {
    @When("user enters valid employee Id")
    public void user_enters_valid_employee_id() {
        WebElement employeeIdTextBox=driver.findElement(By.id("empsearch_id"));
        sendText(employeeIdTextBox, ConfigReader.getPropertyValue("empId"));
    }
    @When("user selects job title")
    public void user_selects_job_title() {

        WebElement jobTitleDdl=driver.findElement(By.id("empsearch_job_title"));
        selectByOptions(jobTitleDdl,"Singer");

        WebElement employeeStatusDdl=driver.findElement(By.id("empsearch_employee_status"));
        selectByOptions(employeeStatusDdl,"Active");

        WebElement includeDdl=driver.findElement(By.id("empsearch_termination"));
        selectByOptions(includeDdl,"Current and Past Employees");

        WebElement subUnitDdl=driver.findElement(By.id("empsearch_sub_unit"));
        selectByOptions(subUnitDdl,"Test");
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        WebElement searchBtn= driver.findElement(By.id("searchBtn"));
        doClick(searchBtn);

    }
    @When("user sees employee information displayed")
    public void user_sees_employee_information_displayed() {
        System.out.println("The employee is displayed");

    }

}
