package Listners;

import Utility.Screenshot;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public abstract class TestListners implements ITestListener {
    public void onTestStart(ITestResult iTestResult){
        Reporter.log("test case has been started");

    }

    public void onTestSuccess(ITestResult iTestResult){
        Reporter.log("test case is green");
    }

    public void onTestFailure(ITestResult iTestResult){
        Reporter.log("test case is failed");
        Screenshot.takeScreenshot(iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult){

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult){

    }

    public void onStart(ITestContext iTestContext){

    }

    public void onFinish(ITestContext iTestContext){

    }
}
