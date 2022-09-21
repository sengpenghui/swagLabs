package workflow;

import elements.InventoryPageObject;
import org.openqa.selenium.WebDriver;

public class InventoryWorkflow {
    public WebDriver webDriver;
    public InventoryPageObject inventoryPage;

    public InventoryWorkflow(WebDriver webDriver){
        this.webDriver = webDriver;
        inventoryPage = new InventoryPageObject(webDriver);
    }

    public void setFilter(){
        inventoryPage.clickFilter();
    }
    public void addToCart(){
        inventoryPage.addToCart();
    }
    public String cartNumbersValues(){
        return inventoryPage.cartNumbers();
    }
    public String cargoName(){
        return inventoryPage.backpackTitle();
    }
    public float cargoPrice(){
        return inventoryPage.backpackPrice();
    }
    public void removeFromCart(){
        inventoryPage.removeFromCart();
    }
}
