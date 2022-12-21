package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Screenshot {
    public static void takeScreenshot(String filename){
        try {
            TakesScreenshot sc=((TakesScreenshot)Browser.driver);
            File f=sc.getScreenshotAs(OutputType.FILE);
            File f1=new File(Constants.SSPATH + filename + ".png");
            FileUtils.copyFile(f,f1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
