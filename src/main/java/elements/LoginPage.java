package elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testDate.LoginPageData;
import utils.ParseYaml;

public class LoginPage {
    public WebDriver driver;
    public ParseYaml parseYaml;
    public LoginPageData loginPageData;

    public LoginPage(WebDriver driver) {
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

    public void inputUserName(){
        this.userName().clear();
        this.userName().sendKeys("standard_user");
//        this.userName().sendKeys(loginPageData.username);
    }
public void inputPassword(){
    this.password().clear();
    this.password().sendKeys("secret_sauce");
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

    public void clickLoginButton(){
        this.loginButton().click();
    }
}
