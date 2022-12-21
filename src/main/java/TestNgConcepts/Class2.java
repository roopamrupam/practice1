package TestNgConcepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
    @Test(testName = "I am writing something meaningfull info about test case")
    public void test1Class2(){
        Reporter.log("Running test1 class2");
        System.out.println("Running test1 class2");
    }

    @Test(groups = {"UI"})
    public void test2Class2(){
        Reporter.log("Running test2 class2");
        System.out.println("Running test2 class2");
    }

    @Test(groups = {"API", "UI"})
    public void test3Class2(){
        Reporter.log("Running test3 class2");
        System.out.println("Running test3 class2");
    }
}
