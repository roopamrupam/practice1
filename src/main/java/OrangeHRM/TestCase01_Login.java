package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase01_Login {
    public static void TestCase01_Loginpage(WebDriver driver) {
        boolean found = driver.getTitle().contains("OrangeHRM");
        if (!found) {
            System.out.println("test case is failed");
        }

        //WebElement eleUserName=driver.findElement(By.xpath("//*input[@name='username']"));
        //eleUserName.click();

       // WebElement LoginButton = driver.findElement(By.xpath("button[@type='submit']"));
        //LoginButton.click();


       // WebElement eleUserValue = driver.findElement(By.xpath("//input[@id=’app’]"));
        //eleUserValue.sendKeys("Admin");

       // WebElement elePassword = driver.findElement(By.name("password"));
       // elePassword.sendKeys("admin123");


        WebElement eleUserName = driver.findElement(By.xpath("//*[@id='txtUsername']"));
        eleUserName.sendKeys("Admin");

        WebElement elePassword = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        elePassword.sendKeys("admin123");

        WebElement eleLoginButton = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        eleLoginButton.click();


    }
}
