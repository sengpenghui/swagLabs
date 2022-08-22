import elements.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWebdriver {
    public static void main(String arg[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-18.0.1.1\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.saucedemo.com/"); //打开首页
        LoginPage loginPage = new LoginPage(dr);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        dr.manage().window().maximize();    //最大化
//        Thread.sleep(3000);
    }
}
