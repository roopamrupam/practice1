package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase003_AdminPage {
    public static void TestCase003_Loginpage(WebDriver driver) {
        boolean found = driver.getTitle().contains("OrangeHRM");
        if (!found) {
            System.out.println("test case is failed");
        }

        WebElement eleUserName = driver.findElement(By.name("username"));
        eleUserName.sendKeys("Admin");

        WebElement elePassword = driver.findElement(By.name("password"));
        elePassword.sendKeys("admin123");




        }
    }

