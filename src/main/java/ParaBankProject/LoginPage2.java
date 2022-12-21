package ParaBankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class LoginPage2 {


    private String username="//*[@name='username']";
    private String password="//*[@name='password']";
    private String clickLogin="//*[@value='Log In']";
    private String lblError="p.error";
    //Webdriver is a datatype just like String
    private WebDriver driver;

    public LoginPage2(WebDriver driver){
        this.driver=driver;
    }
    public void enterUsername(String username){
        WebElement ele=driver.findElement(By.xpath("//*[@name='username']"));
        ele.sendKeys(username);
        Reporter.log("entering username : " +username);
    }
    public void enterPassword(String password){
        WebElement ele=driver.findElement(By.xpath("//*[@name='password']"));
        ele.sendKeys(password);
        Reporter.log("entering password : " +password);
    }
    public void clickLogin(){
        WebElement ele=driver.findElement(By.xpath("//*[@value='Log In']"));
        ele.click();
        Reporter.log("clicking login button");
    }
    public WebElement getErrorElement(){
        return driver.findElement(By.cssSelector("p.error"));
    }
}
