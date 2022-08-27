package framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserEngine{
    public String browserName;
    public String serverURL;
    public WebDriver driver;
    private static Logger logger = LogManager.getLogger(BrowserEngine.class.getName());

    public void initConfigData() throws IOException {
        Properties p = new Properties();
        File f = new File("src\\main\\resources\\config.properties");
        InputStream ips = new FileInputStream("src\\main\\resources\\config.properties");
        p.load(ips);

//        Logger.Output(LogType.LogTypeName.INFO, "Start to select browser name from properties file");
        logger.info("Start to select browser name from properties file");
        browserName = p.getProperty("browserName");
        logger.info(("Your had select test browser type is: " + browserName));
        serverURL = p.getProperty("baseURL");
        logger.info("The test server URL is: " + serverURL);
        ips.close();
    }
    public void callWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        logger.info("Wait for " + time + " seconds");
    }

    public WebDriver getBrowser(){
        if(browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\main\\java\\browserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("Launching Firefox...");
        }else if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\main\\java\\browserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("Launching Chrome...");
        }else if(browserName.equalsIgnoreCase("IE")){
            System.setProperty("webdriver.ie.driver", "src\\main\\java\\browserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            logger.info("Launching IE...");
        }

        driver.get(serverURL);
        logger.info("Open URL: " + serverURL);
        driver.manage().window().maximize();
        logger.info("Maximize browser...");
        callWait(5);
        return driver;
    }

    public void tearDown() throws InterruptedException{
        logger.info("Closing browser...");
        Thread.sleep(3000);
        driver.quit();
    }
}