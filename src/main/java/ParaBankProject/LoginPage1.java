package ParaBankProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class LoginPage1 {




        private String txtThreshold = "//*[@id='loanProcessorThreshold']";
        private String labelError = "p.error";

        private WebDriver driver;


        public LoginPage1(WebDriver driver) {
            this.driver = driver;
        }

        public void enterUsername(String username) {
            WebElement e = driver.findElement(By.xpath("//*[@name='username']"));
            e.sendKeys(username);
            Reporter.log("Entering username:" + username);

        }

        public void enterPassword(String password) {
            WebElement e = driver.findElement(By.xpath("//*[@name='password']"));
            e.sendKeys(password);
            Reporter.log("Entering password:" + password);
        }

        public void loginButton() {
            driver.findElement(By.xpath("//*[@value='Log In']")).click();
            Reporter.log("Clicking login button");
        }




        public void adminPageButton() {
            driver.findElement(By.linkText("Admin Page")).click();
        }



        public void ddLoanProvider() {
            driver.findElement(By.id("loanProvider")).click();
        }


        public void ddLoanProviderLocal() {
            driver.findElement(By.xpath("//*[@value='local']")).click();
        }



        public void ddLoanProcessorMethod() {

            WebElement ele = driver.findElement(By.cssSelector("select#loanProcessor"));
            Select ddLoanProcessor = new Select(ele);

            ddLoanProcessor.selectByValue("combined");// which ultimately will select - Available// Funds

        }


        public void enterThreshold(String percentage) {

            driver.findElement(By.xpath("//*[@id='loanProcessorThreshold']")).clear();


            WebElement e = driver.findElement(By.xpath("//*[@id='loanProcessorThreshold']"));
            e.sendKeys(percentage);

        }

        public WebElement getErrorElement() {
            return driver.findElement(By.cssSelector(labelError));
        }

    }


