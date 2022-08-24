package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase{


    @Test
    public void checkOpenUrl() throws InterruptedException {
        wd.get("https://chromedriver.chromium.org/");
        wd.findElement(By.xpath("//strong[normalize-space()='Downloads']")).click();


        logger.info(">>> Log from Test Method <<<" );

        Assert.assertTrue(1==1);
    }


}
