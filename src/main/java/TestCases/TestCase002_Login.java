package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase002_Login {
    public static void TestCase002_Login_ValidatePage(WebDriver driver) {
        boolean found = driver.getTitle().contains("ParaBank");
        if (!found) {
            System.out.println("test case is failed parabank");
        }

        WebElement eleLabelCustomerLogin = driver.findElement(By.tagName("h2"));
        String title = eleLabelCustomerLogin.getText();
        if (!title.equals("Customer Login")) {
            System.out.println("test case is failed customer login");
        }

        WebElement eleLabelUserName = driver.findElement(By.tagName("b"));
        String title1 = eleLabelUserName.getText();
        if (!title1.equals("Username")) {
            System.out.println("test case is failed username");
        }


        WebElement eleUserName = driver.findElement(By.name("username"));
        eleUserName.sendKeys("roopam");


        WebElement eleLabelPassword = driver.findElement(By.tagName("b"));
        String title2 = eleLabelPassword.getText();
        if (!title2.equals("Password")) {
            System.out.println("test case is failed password");
        }

        WebElement elePassword = driver.findElement(By.name("password"));
        elePassword.sendKeys("admin123");


        WebElement eleLoginButton = driver.findElement(By.id("loginPanel")).findElement(By.className("button"));
        eleLoginButton.click();


        //WebElement ValidateError = driver.findElement(By.id("rightPanel")).findElement(By.className("error"));
        //ValidateError.isDisplayed();



        }
    }

