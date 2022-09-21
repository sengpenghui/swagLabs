package workflow;

import elements.CartPageObject;
import elements.CheckoutStepOnePageObject;
import elements.CheckoutStepTwoPageObject;
import elements.CheckoutCompletePageObject;
import elements.InventoryPageObject;
import org.openqa.selenium.WebDriver;

public class CarCheckoutWorkflow {
    public WebDriver webDriver;
    private CartPageObject cartPageObject;
    private CheckoutStepOnePageObject checkoutStepOnePageObject;
    private CheckoutStepTwoPageObject checkoutStepTwoPageObject;
    private CheckoutCompletePageObject checkoutCompletePageObject;
    private InventoryPageObject inventoryPageObject;

    public CarCheckoutWorkflow(WebDriver webDriver){
        this.webDriver = webDriver;
        this.cartPageObject = new CartPageObject(webDriver);
        this.inventoryPageObject = new InventoryPageObject(webDriver);
        this.checkoutStepOnePageObject = new CheckoutStepOnePageObject(webDriver);
        this.checkoutStepTwoPageObject = new CheckoutStepTwoPageObject(webDriver);
        this.checkoutCompletePageObject = new CheckoutCompletePageObject(webDriver);
    }

    public void switchToShoppingCar(){
        inventoryPageObject.switchToCart();
//        while(cartPageObject.productName().hasNext()){
//            System.out.println(cartPageObject.productName().next().toString());
//        }
    }
    public void checkoutFlow(){
        cartPageObject.clickCheckoutButton();
        checkoutStepOnePageObject.inputFirstName();
        checkoutStepOnePageObject.inputLastName();
        checkoutStepOnePageObject.inputPostalCode();
        checkoutStepOnePageObject.clickContinueButton();
    }
    public float productPrice(){
        return checkoutStepTwoPageObject.productPrice();
    }
    public float itemTotalPrice(){
        return checkoutStepTwoPageObject.itemTotalPrice();
    }
    public float tax(){
        return checkoutStepTwoPageObject.tax();
    }
    public float sumTotal(){
        return checkoutStepTwoPageObject.sumTotal();
    }
    public void checkoutFinish(){
        checkoutStepTwoPageObject.clickFinishButton();
    }
    public String completeHeaderText(){
        return checkoutCompletePageObject.completeHeaderText();
    }


}
