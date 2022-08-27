package workflow;

import elements.LoginPage;
import org.openqa.selenium.WebDriver;

public class WorkflowLoginPage {
    public WebDriver driver;
    LoginPage loginPage;
    public WorkflowLoginPage(WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }
    public void loginInput(){
        LoginPage loginPage = new LoginPage(driver);
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
