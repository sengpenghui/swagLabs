import elements.LoginPage;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ParseCsv;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestWebdriver {

//    public List list = new ArrayList();
//    public List getCsvFile(){
//        try{
//            Reader in = new FileReader("src\\test\\resources\\login.csv");
//            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
//            for(CSVRecord record: records){
//                list.add(record.toList());
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
////        System.out.println("1: " + list);
//        return list;
//
//    }Pars

//    ParseCsv parseCsv = new ParseCsv();
//    解析CSV文件
//    public void getParameters(){
////        System.out.println("2: " + this.getCsvFile());
//        List list = parseCsv.getCsvFile("login");
//        Iterator<List> it = list.iterator();
////        System.out.println("1: " + list);
//        while(it.hasNext()){
//            List list1 = it.next();
//            String username = list1.get(0).toString();
//            String password = list1.get(1).toString();
////            System.out.println("用户名：" + username + "  密码： " + password);
//        }
//    }
    public static void main(String arg[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-18.0.1.1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/"); //打开首页
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        driver.manage().window().maximize();    //最大化
//        Thread.sleep(3000);

//        TestWebdriver testWebdriver = new TestWebdriver();
//        testWebdriver.getParameters();


    }

}
