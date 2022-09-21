package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ParseYaml;

public class CheckoutStepOnePageObject {
    public ParseYaml parseYaml;
    public WebDriver webDriver;

    public CheckoutStepOnePageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.parseYaml = new ParseYaml(webDriver, "checkoutStepOnePage");
    }

    private WebElement getFirstName() {
        return parseYaml.getElement("firstName");
    }

    private WebElement getLastName() {
        return parseYaml.getElement("lastName");
    }

    private WebElement getPostalCode() {
        return parseYaml.getElement("postalCode");
    }

    private WebElement getCancelButton() {
        return parseYaml.getElement("cancel");
    }

    private WebElement getContinueButton() {
        return parseYaml.getElement("continue");
    }

    public void inputFirstName() {
//        this.getFirstName().sendKeys("p");
        WebElement webElement = this.getFirstName();
        ElementActions.clear(webElement);
        ElementActions.input(webElement, "p");
//        this.getFirstName().sendKeys("p");
    }

    public void inputLastName() {
//        this.getLastName().sendKeys("seng");
        WebElement webElement = this.getLastName();
        ElementActions.clear(webElement);
        ElementActions.input(webElement, "seng");
    }

    public void inputPostalCode() {
//        this.getPostalCode().sendKeys("123456");
        WebElement webElement = this.getPostalCode();
        ElementActions.clear(webElement);
        ElementActions.input(webElement, "123456");
    }

    public void clickContinueButton() {
//        this.getContinueButton().click();
        ElementActions.click(this.getContinueButton());
    }

    public void clickCancelButton() {
//        this.getCancelButton().click();
        ElementActions.click(this.getCancelButton());
    }
}
