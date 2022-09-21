package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ParseYaml;

public class CheckoutCompletePageObject {
    public ParseYaml parseYaml;
    public WebDriver webDriver;
    public CheckoutCompletePageObject(WebDriver webDriver){
        this.webDriver = webDriver;
        this.parseYaml = new ParseYaml(webDriver, "checkoutCompletePage");
    }

    private WebElement getCompleteHeader(){
        return this.parseYaml.getElement("completeHeader");
    }
    private WebElement getBackHome(){
        return this.parseYaml.getElement("backHome");
    }

    public String completeHeaderText(){
        return this.getCompleteHeader().getText();
    }
    public void clickBackHomeButton(){
//        this.getBackHome().click();
        ElementActions.click(this.getBackHome());
    }
}
