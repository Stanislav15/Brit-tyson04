package Utilities;

import Pages.ManufacturePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    Actions actions;
    SoftAssert softAssert;


    @BeforeClass
    public void beforeEverythingElse(){

        System.out.println("Setting Up Everything For Test Purposes >>>>>>>");
    }
    @BeforeMethod
    public void setUp(){

        driver = Driver.getDriver();
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();



    }

    @AfterMethod
    public void AfterEachMethod(){

       // driver.quit();

    }

    @AfterClass
    public void afterEverythingElse(){

        softAssert = new SoftAssert();
        softAssert.assertAll();
    }

}
