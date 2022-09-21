package elements;

import framework.ElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testDate.LoginPageData;
import utils.ParseYaml;

public class LoginPageObject {
    public WebDriver driver;
    public ParseYaml parseYaml;
    public LoginPageData loginPageData;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        this.parseYaml = new ParseYaml(driver, "LoginPage");
        this.loginPageData = new LoginPageData();
    }

    public WebElement userName() {
        return parseYaml.getElement("username");
    }

    public WebElement password() {
        return parseYaml.getElement("password");
    }

    public WebElement loginButton() {
        return parseYaml.getElement("loginButton");
    }

    public void inputUserName() {
//        this.userName().clear();
//        this.userName().sendKeys("standard_user");
        WebElement webElement = this.userName();
        ElementActions.clear(webElement);
        ElementActions.input(webElement, "standard_user");
//        this.userName().sendKeys(loginPageData.username);
    }

    public void inputPassword() {
        WebElement webElement = this.password();
//        this.password().clear();
//        this.password().sendKeys("secret_sauce");
        ElementActions.clear(webElement);
        ElementActions.input(webElement, "secret_sauce");
//        this.password().sendKeys(loginPageData.password);
    }
    //参数化输入
//    public void inputUserName(String username){
//        this.userName().clear();
//        this.userName().sendKeys(username);
//    }
//    public void inputPassword(String password){
//        this.password().clear();
//        this.password().sendKeys(password);
//    }

    public void clickLoginButton() {
//        this.loginButton().click();
        ElementActions.click(this.loginButton());
    }
}
