package testDate;

import utils.ParseCsv;

import java.util.Iterator;
import java.util.List;

public class LoginPageData {

    public LoginPageData() {
        this.getParameters();
    }

    ParseCsv parseCsv = new ParseCsv();
    Iterator<List> it;
    public String username;
    public String password;

    public void getParameters() {
//        System.out.println("2: " + this.getCsvFile());
        List list = parseCsv.getCsvFile("login");
        Iterator<List> it = list.iterator();
//        System.out.println("1: " + list);
        while (it.hasNext()) {
            List list1 = it.next();
            username = list1.get(0).toString();
            password = list1.get(1).toString();
//            System.out.println("用户名：" + username + "  密码： " + password);
        }
    }

//    public Object[][] getParameters() {
////        System.out.println("2: " + this.getCsvFile());
//        Object[][] objects = new Object[][]{};
//        List list = parseCsv.getCsvFile("login");
//        Iterator<List> it = list.iterator();
////        System.out.println("1: " + list);
//        while (it.hasNext()) {
//            List list1 = it.next();
//            Object username = list1.get(0).toString();
//            Object password = list1.get(1).toString();
////            System.out.println("用户名：" + username + "  密码： " + password);
//            objects = new Object[][]{{username, password}};
//        }
//        return objects;
//    }

}
