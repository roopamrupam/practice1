package TestNgConcepts;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Employee1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("will run before every @Test tag method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("browser will open");
    }

    @Test(groups = {"user3"})
    public void enterFirstname(){
        Reporter.log("enter first name");
        System.out.println("fist name will get entered");
    }

    @Test
    public void enterLastName(){
        Reporter.log("enter last name");
        System.out.println("last name will get entered");
    }

}
