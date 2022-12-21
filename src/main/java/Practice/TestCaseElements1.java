package Practice;

import PageObjects.Guru99;
import Utility.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaseElements1 {
Browser br;
WebDriver driver;
Guru99 pgGuru99;


    @BeforeMethod
    public void beforeMethod(){
    br=new Browser("chrome");
    br.launchBrowser();
    br.maximize();
    driver=br.getDriver();
    pgGuru99=new Guru99(driver);
}
@Test
    public void dragDrop(){
        br.navigateUrl("https://demo.guru99.com/test/drag_drop.html");
        Actions ac=new Actions(driver);
        ac.dragAndDrop(pgGuru99.lblSales);
}
}
