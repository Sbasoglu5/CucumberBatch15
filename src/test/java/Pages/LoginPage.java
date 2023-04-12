package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {

    //WebElement userNameTextBox = driver.findElement(By.xpath("//input[@type='text']"));
    @FindBy(xpath ="//input[@type='text']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id='btnLogin']")
    public WebElement loginBtn;

    @FindBy(xpath ="//a[text()='Welcome Admin']" )
    public WebElement welcomeIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLink;

    //Page Factory Model(Selenium)
}
