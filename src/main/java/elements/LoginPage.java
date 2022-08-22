package elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testDate.LoginPageData;
import utils.ParseYaml;

public class LoginPage {
    public WebDriver driver;
    public ParseYaml parseYaml;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.parseYaml = new ParseYaml(driver, "LoginPage");
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

    public void inputUserName(){
        this.userName().clear();
//        this.userName().sendKeys("standard_user");
        this.userName().sendKeys(LoginPageData.username);
    }
    public void inputPassword(){
        this.password().clear();
//        this.password().sendKeys("secret_sauce");
        this.password().sendKeys(LoginPageData.password);
    }
    public void clickLoginButton(){
        this.loginButton().click();
    }
}
