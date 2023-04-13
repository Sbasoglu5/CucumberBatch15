package StepDefinitions;

import Pages.EmployeeSearchPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeeSearch extends CommonMethods {
    @When("user enters valid employee Id")
    public void user_enters_valid_employee_id() {
        sendText(employeeSearchPage.employeeIdTextBox, ConfigReader.getPropertyValue("empId"));
    }
    @When("user selects job title")
    public void user_selects_job_title() {
        selectByOptions(employeeSearchPage.jobTitleDdl, "Singer");
        selectByOptions(employeeSearchPage.employeeStatusDdl,"Active");
        selectByOptions(employeeSearchPage.includeDdl,"Current and Past Employees");
        selectByOptions(employeeSearchPage.subUnitDdl,"Test");
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        doClick(employeeSearchPage.searchBtn);

    }
    @When("user sees employee information displayed")
    public void user_sees_employee_information_displayed() {
        System.out.println("The employee is displayed");

    }

}
