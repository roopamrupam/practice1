package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99 {
    public WebDriver driver;
    public String lblSales="//li[@data-id='6']";
    public String lblLoan="//*[@id='loan']";


    public Guru99(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getSales(){
        return driver.findElement(By.xpath(lblSales));
    }

    public WebElement getLoan(){
        return driver.findElement(By.xpath(lblLoan));
    }
}
