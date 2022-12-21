package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PracticeDifferentElements {


    //public WebDriver driver;

   /* public PracticeDifferentElements(WebDriver driver) {
        this.driver=driver;
    }*/



    public static void TestCase1_ValidatePage(WebDriver driver) {
        boolean found = driver.getTitle().contains("Only Testing");
        if (!found) {
            System.out.println("test case is failed");
        }


        WebElement eleFirstName = driver.findElement(By.xpath("//*[@name='fname']"));
        if (eleFirstName.isEnabled()){
            eleFirstName.sendKeys("roopam");
        }

        try {
            Thread.sleep(25000);
        }catch (Exception e){
            e.printStackTrace();
        }

       WebElement eleLastName=driver.findElement(By.cssSelector("#text2"));
        eleLastName.sendKeys("bante");



        WebElement eleHidden=driver.findElement(By.cssSelector("#text3"));
        eleHidden.sendKeys("*******");

        WebElement eleClick1=driver.findElement(By.cssSelector("#check1"));
        eleClick1.click();

        WebElement eleClick2=driver.findElement(By.cssSelector("#check2"));
        eleClick2.click();

        WebElement eleClcikMale=driver.findElement(By.cssSelector("#radio1"));
        eleClcikMale.click();







    }

    }


