package testSuite;

import framework.BrowserEngine;
import framework.CaptureScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import workflow.CarCheckoutWorkflow;
import workflow.InventoryWorkflow;
import workflow.LoginWorkflow;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestLaunchBrowser {
    public WebDriver driver;
    public SoftAssert softAssert;
    public BrowserEngine browserEngine;
    public CaptureScreenshot captureScreenshot;
    public LoginWorkflow workflowLoginPage;
    public InventoryWorkflow workflowInventoryPage;
    public CarCheckoutWorkflow carCheckoutWorkflow;

    @BeforeClass
    public void setUp() throws IOException{
        browserEngine = new BrowserEngine();
        browserEngine.initConfigData();
        driver = browserEngine.getBrowser();
        captureScreenshot = new CaptureScreenshot(driver);
        workflowLoginPage = new LoginWorkflow(driver);
        workflowInventoryPage = new InventoryWorkflow(driver);
        carCheckoutWorkflow = new CarCheckoutWorkflow(driver);
        softAssert= new SoftAssert();

    }

//    @DataProvider(name = "login")
//    public Object[][] loginParameters(){
//        LoginPageData loginPageData = new LoginPageData();
//        return loginPageData.getParameters();
//    }

    @Test
    public void openSwagLabs(){
        workflowLoginPage.loginInput();
        workflowLoginPage.loginSubmit();
        captureScreenshot.getScreenshot();
    }
    @Test (dependsOnMethods = {"openSwagLabs"})
    public void selectCargo(){
//        SoftAssert softAssert = new SoftAssert();
//        System.out.println(workflowInventoryPage.cargoName());
//        System.out.println(workflowInventoryPage.cargoPrice());
//        workflowInventoryPage.setFilter();
        workflowInventoryPage.addToCart();
        softAssert.assertEquals(workflowInventoryPage.cartNumbersValues(),"1","购物车中商品数量不正确。");
//        workflowInventoryPage.removeFromCart();
        softAssert.assertTrue(workflowInventoryPage.webDriver.getCurrentUrl().contains("inventory.html"));
        softAssert.assertAll();
    }
    @Test (dependsOnMethods = {"selectCargo"})
    public void AddToCarAndCheckout() {
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        browserEngine.callWait(30);
        carCheckoutWorkflow.switchToShoppingCar();
        carCheckoutWorkflow.checkoutFlow();
        softAssert.assertEquals(carCheckoutWorkflow.productPrice(), carCheckoutWorkflow.itemTotalPrice());
        softAssert.assertEquals(carCheckoutWorkflow.itemTotalPrice() + carCheckoutWorkflow.tax(), carCheckoutWorkflow.sumTotal());
        carCheckoutWorkflow.checkoutFinish();
        softAssert.assertEquals(carCheckoutWorkflow.completeHeaderText(), "THANK YOU FOR YOUR ORDER");
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
