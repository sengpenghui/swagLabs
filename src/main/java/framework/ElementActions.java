package framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class ElementActions {

    private static Logger logger = LogManager.getLogger(BrowserEngine.class.getName());

    public static void click(WebElement webElement){
        logger.info("Click the " + webElement.getText() + " button.");
        webElement.click();
    }
    public static void submit(WebElement webElement){
        logger.info("Submit the form.");
        webElement.submit();
    }
    public static void input(WebElement webElement, String string){
        logger.info("Enter the " + webElement.getText());
        webElement.sendKeys(string);
    }
    public static void clear(WebElement webElement){
        logger.info("Clear the textarea.");
    }




}
