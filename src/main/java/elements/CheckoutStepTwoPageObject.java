package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ParseYaml;

import java.util.Iterator;
import java.util.List;

public class CheckoutStepTwoPageObject {
    public WebDriver webDriver;
    public ParseYaml parseYaml;

    public CheckoutStepTwoPageObject(WebDriver webDriver){
        this.webDriver = webDriver;
        this.parseYaml = new ParseYaml(webDriver, "checkoutStepTwoPage");
    }

    private List<WebElement> getProductPrices(){
        return parseYaml.getElements("productPrice");
    }
    private WebElement getItemTotal(){
        return parseYaml.getElement("itemTotal");
    }
    private WebElement getTax(){
        return parseYaml.getElement("tax");
    }
    private WebElement getSumTotal(){
        return parseYaml.getElement("sumTotal");
    }
    private WebElement getCancelButton(){
        return parseYaml.getElement("cancel");
    }
    private WebElement getFinishButton(){
        return parseYaml.getElement("finish");
    }

    public float productPrice(){
        float fNumber = 0;
//        Iterator it = this.getProductPrices().iterator();
//        while(it.hasNext()){
//            System.out.println(it.next().toString().substring(1));
//            fNumber += Float.parseFloat(it.next().toString().substring(1));
//        }
        for(WebElement webElement:this.getProductPrices()){
            fNumber += Float.parseFloat(webElement.getText().substring(1));
        }
        return fNumber;
    }
    public float itemTotalPrice(){
        return Float.parseFloat(this.getItemTotal().getText().substring(13));
    }
    public float tax(){
        return Float.parseFloat(this.getTax().getText().substring(6));
    }
    public float sumTotal(){
        return Float.parseFloat(this.getSumTotal().getText().substring(8));
    }
    public void clickFinishButton(){
//        this.getFinishButton().click();
        ElementActions.click(this.getFinishButton());
    }
}
