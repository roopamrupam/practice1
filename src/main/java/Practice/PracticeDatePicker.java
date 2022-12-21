package Practice;

import TestNgConcepts.Data;
import Utility.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class PracticeDatePicker {

       Browser br;
       WebDriver driver;
       Data pgData;

       @BeforeMethod
    public void beforeMethod(){
           br=new Browser("chrome");
           br.launchBrowser();
           br.maximize();
           driver=br.getDriver();
           pgData=new Data(driver);
       }
       @Test
       public void selectDate(){
           br.navigateUrl("https://demo.automationtesting.in/Datepicker.html");
           Actions ac=new Actions(driver);
           ac.click(pgData.lblDate).build().perform();
           ac.click(pgData.lblMoveNext).build().perform();
           ac.click(pgData.lblDate16).build().perform();
       }







}
