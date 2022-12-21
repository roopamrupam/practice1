package TestDataWithTestCase;

import ParaBankProject.Browser;
import ParaBankProject.LoginPage2;
import Utility.TestDataReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestNgTestData {

    Browser br;
    LoginPage2 login; 
    WebDriver driver;
    Properties browser;
    Properties testCase;

    @BeforeMethod
    public void readTestData() {
        browser = TestDataReader.readProperties("Browser.properties");
        br = new Browser(browser.getProperty("browser"));
        br.launchBrowser();
        br.maximize();
        driver = br.getDriver();
        login = new LoginPage2(br.getDriver());
    }

    @Test
    public void TC_001() {
        testCase = TestDataReader.readProperties("TestCases_001.properties");
        br.navigateUrl(browser.getProperty("url"));
        login.enterUsername(testCase.getProperty("username"));
        login.enterPassword(testCase.getProperty("password"));
        login.clickLogin();
        Assert.assertEquals(login.getErrorElement().getText(), testCase.getProperty("errorMsg"));
    }
}

