package TestNgConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data {

    public WebDriver driver;

    @FindBy(xpath = "//*[@id='datepicker1']")
    public WebElement lblDate;

    public Data (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title='Next']")
    public WebElement lblMoveNext;

    @FindBy(linkText ="16")
    public WebElement lblDate16;

    //guru99
    @FindBy(xpath = "//li[@data-id='6']")
    public WebElement lblSales;

    @FindBy(id = "loan") //(xpath = "//li[@data-id='8']")
    public WebElement lblLoan;



}

