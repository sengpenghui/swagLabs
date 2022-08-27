package testSuite;

import framework.BrowserEngine;
import framework.CaptureScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testDate.LoginPageData;
import workflow.WorkflowInventoryPage;
import workflow.WorkflowLoginPage;

import java.io.IOException;
import java.util.Iterator;

public class TestLaunchBrowser {
    public WebDriver driver;
    public CaptureScreenshot captureScreenshot;
    public WorkflowLoginPage workflowLoginPage;
    public WorkflowInventoryPage workflowInventoryPage;

    @BeforeClass
    public void setUp() throws IOException{
        BrowserEngine browserEngine = new BrowserEngine();
        browserEngine.initConfigData();
        driver = browserEngine.getBrowser();
        captureScreenshot = new CaptureScreenshot(driver);
        workflowLoginPage = new WorkflowLoginPage(driver);
        workflowInventoryPage = new WorkflowInventoryPage(driver);
    }

//    @DataProvider(name = "login")
//    public Object[][] loginParameters(){
//        LoginPageData loginPageData = new LoginPageData();
//        return loginPageData.getParameters();
//    }

    @Test (dataProvider = "login")
    public void openSwagLabs(){
        workflowLoginPage.loginInput();
        workflowLoginPage.loginSubmit();
        captureScreenshot.getScreenshot();
    }
    @Test
    public void selectCargo(){
        System.out.println(workflowInventoryPage.cargoName());
        System.out.println(workflowInventoryPage.cargoPrice());
        workflowInventoryPage.setFilter();
        workflowInventoryPage.addToCart();
        workflowInventoryPage.removeFromCart();
    }

    @AfterClass
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
