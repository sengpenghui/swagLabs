package workflow;

import elements.InventoryPage;
import org.openqa.selenium.WebDriver;

public class WorkflowInventoryPage {
    public WebDriver driver;
    public InventoryPage inventoryPage;

    public WorkflowInventoryPage(WebDriver driver){
        this.driver = driver;
        inventoryPage = new InventoryPage(driver);
    }

    public void setFilter(){
        inventoryPage.clickFilter();
    }
    public void addToCart(){
        inventoryPage.addToCart();
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
