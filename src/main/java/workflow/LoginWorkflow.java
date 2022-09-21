package workflow;

import elements.LoginPageObject;
import org.openqa.selenium.WebDriver;

public class LoginWorkflow {
    public WebDriver driver;
    LoginPageObject loginPage;
    public LoginWorkflow(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPageObject(driver);
    }
    public void loginInput(){
        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
    }

//    public void loginInput(String username, String password){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.inputUserName(username);
//        loginPage.inputPassword(password);
//    }
    public void loginSubmit(){
        loginPage.clickLoginButton();
    }
}
