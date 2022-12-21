package TestNgConcepts;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static ParaBankProject.TestData.browser;

public class Class1 {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("running before method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("running before test");
    }

    //by default testing gives priority as 0
    @Test
    public void test1Class1() {
        Reporter.log("running test1 Class1");
        System.out.println("running test1 Class1");
    }

   /* @Parameters({"chrome"})
    @Test
    public void test6Class1(String chrome) {
        Reporter.log("running test1 Class1" +chrome);
        System.out.println("running test1 Class1" +chrome);
    }*/

    @Test(priority = 1, groups = {"API"})
    public void test2Class1() {
        Reporter.log("running test1 Class1");
        System.out.println("running test1 Class1");
    }

    @Test(priority = 1)
    public void test4Class1() {
        Reporter.log("running test4 Class1");
        System.out.println("running test4 CLass1");
    }

    @Test(priority = 0, enabled = false)
    public void test3Class1() {
        Reporter.log("running test3 Class1");
        System.out.println("running test3 Class1");
    }

    @Test(dependsOnMethods = "test4Class1", alwaysRun = true)
    public void test5Class1() {
        // do soemthing
    }
}

