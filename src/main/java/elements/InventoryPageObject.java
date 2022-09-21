package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ParseYaml;

public class InventoryPageObject {
    public WebDriver driver;
    public ParseYaml parseYaml;

    public InventoryPageObject(WebDriver driver) {
        this.driver = driver;
        parseYaml = new ParseYaml(driver, "InventoryPage");
    }

    public WebElement getFilter(){
        return parseYaml.getElement("filter");
    }
    public WebElement getBackpackCart(){
        return parseYaml.getElement("backpackCart");
    }
    public WebElement getBackpackTitle(){
        return parseYaml.getElement("backpackTitle");
    }
    public WebElement getBackpackPrice(){
        return parseYaml.getElement("backpackPrice");
    }
    public WebElement getBackpackRemove(){
        return parseYaml.getElement("backpackRemove");
    }
    public WebElement getCartNumbers(){
        return parseYaml.getElement("cartNumbers");
    }

    public void clickFilter(){
        Select select = new Select(this.getFilter());
        select.selectByIndex(3);
    }
    public void addToCart(){
//        this.getBackpackCart().click();
        ElementActions.click(this.getBackpackCart());
    }
    public void removeFromCart(){
//        this.getBackpackRemove().click();
        ElementActions.click(this.getBackpackRemove());
    }
    public String backpackTitle(){
        return this.getBackpackTitle().getText();
    }
    public float backpackPrice(){
        return Float.parseFloat(this.getBackpackPrice().getText().substring(1));
    }
    public String cartNumbers(){
        return this.getCartNumbers().getText();
    }
    public void switchToCart(){
//        this.getCartNumbers().click();
        ElementActions.click(this.getCartNumbers());
    }


}
