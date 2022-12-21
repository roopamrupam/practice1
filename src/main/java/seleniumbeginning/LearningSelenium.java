package seleniumbeginning;

import OrangeHRM.TestCase01_Login;
import Practice.PracticeDifferentElements;
import Utility.Browser;
import org.openqa.selenium.WebDriver;

public class LearningSelenium {
    public static void main(String[] args) {
        //System.setProperty("web driver.chrome.driver","C:\\Users\\rupam\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
        //WebDriver driver1=new FirefoxDriver();
        Browser br=new Browser("chrome");
        br.launchBrowser();
        br.maximize();
       // br.navigateUrl("https://parabank.parasoft.com/parabank/index.htm");
       //br.navigateUrl("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        br.navigateUrl("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        WebDriver driver=br.getDriver();
       // PracticeDifferentElements pdr=new PracticeDifferentElements(br.getDriver());
        //*pdr.enterFirstName("roopam");
        //pdr.enterLastName("bante");

        //TestCase002_Login.TestCase002_Login_ValidatePage(driver);
        //TestCase003_AdminPage.TestCase003_Loginpage(driver);
        //TestCase01_Login.TestCase01_Loginpage(driver);
        PracticeDifferentElements.TestCase1_ValidatePage(driver);


    }


    }

