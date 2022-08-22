package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ParseYaml;

public class InventoryPage {
    public WebDriver driver;
    public ParseYaml parseYaml;

    public InventoryPage(WebDriver driver) {
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

    public void clickFilter(){
        Select select = new Select(this.getFilter());
        select.selectByIndex(3);
    }
    public void addToCart(){
        this.getBackpackCart().click();
    }
    public void removeFromCart(){
        this.getBackpackRemove().click();
    }
    public String backpackTitle(){
        return this.getBackpackTitle().getText();
    }
    public float backpackPrice(){
        return Float.parseFloat(this.getBackpackPrice().getText().substring(1));
//        price.substring(1);
    }


}
