package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase001_Login {
    public static void TestCase001_Login_ValidatePage(WebDriver driver){
        boolean found=driver.getTitle().contains("ParaBank");
        if (!found){
            System.out.println("test case is failed");
        }

        // by .tagName

        WebElement eleLableCustomerLogin = driver.findElement(By.tagName("h2"));
        String title = eleLableCustomerLogin.getText();
        if(!title.equals("Customer Login")){
            System.out.println("test case is failed");
        }

        // by .name

      WebElement eleUserName=driver.findElement(By.name("username"));
       eleUserName.sendKeys("roopam");

        WebElement elePassword=driver.findElement(By.name("password"));
        elePassword.sendKeys("admin123");

        //by .linkTest

        WebElement eleForgotyourpassword=driver.findElement(By.linkText("forgot login info?"));
        eleForgotyourpassword.click();

        WebElement eleLoginButton = driver.findElement(By.id("loginPanel")).findElement(By.className("button"));
        eleLoginButton.click();

        //by .partialLinkTest

        WebElement eleRegister=driver.findElement(By.partialLinkText("Regis"));
        eleRegister.click();



        //by .classname

        WebElement eleSolutions=driver.findElement(By.className("Solutions"));
        String text=eleSolutions.getText();
        if (!text.equals("Solutions")){
            System.out.println("test case is faild");
        }else{
            System.out.println();
        }

        //by .id

        WebElement eleHome=driver.findElement(By.id("footerPanel1")).findElement(By.linkText("Home"));
        eleHome.click();








    }


}
