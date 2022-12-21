package TestNgConcepts;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Employee2 {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("will run before every @Test tag method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("browser will open");
    }

    @Test(groups = {"user1"})
    public void enterAge(){
        Reporter.log("enter age");
        System.out.println("age will get entered");
    }

    @Test(groups = {"user2","user4"})
    public void enterCityName(){
        Reporter.log("enter city name");
        System.out.println("city name will get entered");
    }
    @Parameters({"state"})
    @Test
    public void enterStateName(){
        Reporter.log("enter state name" );
        System.out.println("state name will get entered");
    }
}
