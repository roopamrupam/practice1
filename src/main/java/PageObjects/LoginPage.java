package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
    @FindBy(xpath = "//*[@name='username']")
    public WebElement txtUsername;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement btnLogin;

    @FindBy(css = "p.error")
    public WebElement lblError;

    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
    }

    public void enterUsername(String username){
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(txtUsername));
        ele.sendKeys(username);
        Reporter.log("Entering username:" + username);
    }

    public void enterPassword(String password){
        txtPassword.sendKeys(password);
        Reporter.log("Entering password:" + password);
    }

    public void clickLogIn(){
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        ele.click();
        Reporter.log("Clicking login button");
    }

    public WebElement getErrorElement(){
        return lblError;
    }
}
