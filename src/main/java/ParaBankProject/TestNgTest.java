package ParaBankProject;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTest {

    Browser br;
    LoginPage2 login;
    WebDriver driver;


    @BeforeSuite
    public void beforesuite(){
        br=new Browser(TestData.browser);
    }

    @BeforeTest
    public void beforeTest(){
        br.launchBrowser();
        br.maximize();
        driver=br.getDriver();
        login=new LoginPage2(br.getDriver());
    }

    @Test
    public void loginToParaBank(){
        br.navigateUrl(TestData.url);
        login.enterUsername(TestData.username);
        login.enterPassword(TestData.password);
        login.clickLogin();
        Assert.assertEquals(login.getErrorElement().getText(),TestData.errormsg);
        System.out.println("Login Attempted");
    }

    @Test
    public void Test2(){
        Reporter.log("something");
        System.out.println("test2");
    }

    @AfterTest
    public void AfterTest(){
        br.closeBrowser();
    }


}
