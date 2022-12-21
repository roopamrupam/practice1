package ParaBankProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    private String browserName;
    private WebDriver driver;

    public Browser(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void launchBrowser() {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupam\\Downloads\\Compressed\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("the driver provided is not available");
        }
        // by default 60 sec implicit wait
        driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);

    }
    public  void maximize(){
        driver.manage().window().maximize();
    }
    public void navigateUrl(String url){
        driver.get(url);
    }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
