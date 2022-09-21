package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ParseYaml;

import java.util.Iterator;
import java.util.List;

public class CartPageObject {
    public ParseYaml parseYaml;
    public WebDriver webDriver;
    public CartPageObject(WebDriver webDriver){
        this.webDriver = webDriver;
        this.parseYaml = new ParseYaml(webDriver, "cartPage");
    }

    private WebElement getCheckout(){
        return parseYaml.getElement("checkout");
    }
//    private List<WebElement> getProductName(){
//        return parseYaml.getElements("productName");
//    }
    private List<WebElement> getProductPrice(){
        return parseYaml.getElements("productPrice");
    }
    private WebElement getContinueShopping(){
        return parseYaml.getElement("continueShopping");
    }
    private List<WebElement> getCartItems(){
        return parseYaml.getElements("cartItems");
    }
//    private List<WebElement> getInventoryItemName(){
//        return parseYaml.getElements("inventoryItemName");
//    }
    private WebElement getRemoveButton(){
        return parseYaml.getElement("cartRemove");
    }

//    public Iterator productName(){
//        Iterator it = this.getProductName().iterator();
//        return it;
//    }
    public float productPrice(){
        float fNumber = 0;
        Iterator it = this.getProductPrice().iterator();
        while(it.hasNext()){
            fNumber += Float.parseFloat(it.next().toString().substring(1));
        }
        return fNumber;
    }
    public void clickCheckoutButton(){
//        this.getCheckout().click();
        ElementActions.click(this.getCheckout());
    }
    public void clickContinueShopping(){
//        this.getContinueShopping().click();
        ElementActions.click(this.getContinueShopping());
    }
    public void clickRemoveButton(){
//        this.getRemoveButton().click();
        ElementActions.click(this.getRemoveButton());
    }
}
