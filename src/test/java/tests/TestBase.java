package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {

    public Logger logger = LoggerFactory.getLogger(TestClass.class);

    protected WebDriver wd;

    @BeforeSuite
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){
        wd.quit();
    }


    @BeforeMethod(alwaysRun = true)
    public void startLogger(Method m) {
        logger.info("Start method --> " + m.getName());
        logger.info("==================================================================");
    }

    @AfterMethod(alwaysRun = true)
    public void endLogger(Method m) {
        logger.info("End of method -->" + m.getName());
    }

}
