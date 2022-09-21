import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

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
    public static void main(String arg[]) throws IOException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-18.0.1.1\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/"); //打开首页
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.inputUserName();
//        loginPage.inputPassword();
//        loginPage.clickLoginButton();
//        driver.manage().window().maximize();    //最大化
//        Thread.sleep(3000);

//        TestWebdriver testWebdriver = new TestWebdriver();
//        testWebdriver.getParameters();
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        System.out.println("输入字符，按下’q‘键退出.");
////
////        do{
////            c = (char)br.read();
////            System.out.println(c);
////        }while(c != 'q');
//        String str;
//        System.out.println("Enter lines of text.");
//        System.out.println(("Enter 'end' to quit"));
//        do{
//            str = br.readLine();
//            System.out.println(str);
//        }while(!str.equals("end"));
//        int b;
//        b = 'A';
//        System.out.write('\t');
//        System.out.write(b);
//        System.out.write('\n');
//        byte bWrite[] = {11,21,2,30,5};
//        File f = new File("text.txt");
//        OutputStream os = new FileOutputStream(f);
//        OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
//        writer.append("中文输入");
//        writer.append("\r\n");
//        writer.append("English");
//        writer.close();
//        os.close();
////        for(int x = 0; x < bWrite.length; x++){
////            os.write(bWrite[x]);
////        }
////        os.close();
//
//        InputStream is = new FileInputStream("text.txt");
//        InputStreamReader reader = new InputStreamReader(is, "UTF-8");
//        StringBuffer sb = new StringBuffer();
//        while(reader.ready()){
//            sb.append((char)reader.read());
//        }
//        System.out.println(sb);
//        reader.close();;
//        is.close();
//        int size = is.available();
//        for(int i = 0; i < size; i++){
//            System.out.print((char) is.read() + " ");
//        }
//        is.close();
//        HashSet<String> hashSet = new HashSet<String>();
//        hashSet.add("Runoob");
//        hashSet.add("Google");
//        hashSet.add("Taobao");
//        hashSet.add("Zhihu");
//        hashSet.add("Runoob");
//        hashSet.stream().sorted();
//        hashSet.remove("Taobao");
//        System.out.println(hashSet.size());
//        Iterator iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            Object str = iterator.next();
//            if(str.equals("Google")) {
//                System.out.println(str);
//            }
//        }
//        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//        hashMap.put(1, "Google");
//        hashMap.put(2, "Runoob");
//        hashMap.put(3, "Taobao");
//        hashMap.put(4, "Zhihu");
//        System.out.println(hashMap.get(3));
//
//        HashMap<String, String> hashMap2 = new HashMap<String, String>();
//        hashMap2.put("One", "Google");
//        hashMap2.put("Two", "Runoob");
//        hashMap2.put("Three", "Taobao");
//        hashMap2.put("Four", "Zhihu");
//        System.out.println(hashMap2.get("Four"));
//
//        for(Integer i : hashMap.keySet()){
//            System.out.println("Key: " + i + ", Value: " + hashMap.get(i));
//        }
//
//        for(String str: hashMap2.values()){
//            System.out.println(str + ",");
//        }
//        String str1 = "Hello World";
//        String str2 = "hello world";
//        Object objStr = str1;
//
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareToIgnoreCase(str2));
//        System.out.println(str1.compareTo(objStr.toString()));

//        String strOrig = "Hello world, Hello Runoob";
//        int lastIndex = strOrig.lastIndexOf("Runoob");
//        if(lastIndex == -1){
//            System.out.println("Don't find string Runoob");
//        }else{
//            System.out.println("Runoob string the last find position: " + lastIndex);
//        }
//        String str = "this is Java";
//        System.out.println(removeCharAt(str, 9));
//        String str = "Hello world";
//        System.out.println(str.replace("H", "W"));
//        System.out.println(str.replace("He", "Wa"));
//        System.out.println(str.replace("He", "Ha"));
//        String str = "runoob";
//        String reverse = new StringBuffer(str).reverse().toString();
//        System.out.println("before reverse: " + str);
//        System.out.println("after reverse: " + reverse);
//        String strOrig = "Google Runoob Taobao";
//        int intIndex = strOrig.indexOf("Runoob");
//        if(intIndex == -1){
//            System.out.println("Don't find String Runoob");
//        }else {
//            System.out.println("Runoob string position is " + intIndex);
//        }
//        String str =  "www-runoob-com";
//        String[] temp;
//        String delimeter = "-";
//        temp = str.split(delimeter);
//        for (int i = 0; i < temp.length; i++) {
//            System.out.println(temp[i]);
//            System.out.println("I'm a one");
//        }
//
//        System.out.println("-----java for each loop out method-----");
//        String str1 = "www.runoob.com";
//        String[] temp1;
//        String delemeter1 = "\\.";
//        temp1 = str1.split(delemeter1);
//        for (String s: temp1) {
//            System.out.println(s);
//            System.out.println("I'm second");
//        }
//        String str = "This is String, split by StringTokenizer, created by runoob";
//        StringTokenizer st = new StringTokenizer(str);
//        System.out.println("-----Normal space split-----");
//        while (st.hasMoreElements()) {
//            System.out.println(st.nextElement());
//        }
//        System.out.println("-----Normal douhao split-----");
//        StringTokenizer st2 = new StringTokenizer(str, ",");
//        while (st2.hasMoreElements()){
//            System.out.println(st2.nextElement());
//        }
//        String str = "string runoob";
//        String strUpper = str.toUpperCase();
//        System.out.println("Original String: " + str);
//        System.out.println("Converse to upper case: " + strUpper);
//        String first_str = "Welcome to Microsoft";
//        String second_str = "I work with microsoft";
//        boolean match1 = first_str.
//                regionMatches(11, second_str, 12,9);
//        boolean match2 = first_str.
//                regionMatches(true, 11, second_str, 12, 9);
//        System.out.println("Upper and Lower value: " + match1);
//        System.out.println("No Upper and Lower value: " + match2);
//        long startTime = System.currentTimeMillis();
//        for(int i=0; i<50000;i++){
//            String s1 = "hello";
//            String s2 = "hello";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("通过String关键词创建字符串" + ":" + (endTime - startTime)
//        + "毫秒");
//        long startTime1 = System.currentTimeMillis();
//        for(int i=0; i<50000; i++){
//            String s3 = new String("hello");
//            String s4 = new String("hello");
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("通过String对象创建字符串" + ":" + (endTime1 - startTime1)
//        + "毫秒");
//        double e = Math.E;
//        System.out.format("%f%n", e);
//        System.out.format(Locale.CHINA, "%-10.4f%n%n", e);
//        long startTime = System.currentTimeMillis();
//        for (int i=0; i<5000; i++){
//            String result = "This is " + "testing the " + "different " + "between "
//                    + "String" + "and " + "StringBuffer";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("字符串连接" + "- 使用+ 操作符： " + (endTime - startTime) + "ms");
//        long startTime1 = System.currentTimeMillis();
//        for(int i=0; i< 5000; i++){
//            StringBuffer result = new StringBuffer();
//            result.append("This is ");
//            result.append("testing the ");
//            result.append("difference ");
//            result.append("between");
//            result.append("String ");
//            result.append("and ");
//            result.append("StringBuffer");
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("字符串链接" + "-使用StringBuffer: "
//        + (endTime1 - startTime1) + " ms");
//        Integer[] number = {8,2,7,1,4,9,5};
//        int min = (int) Collections.min(Arrays.asList(number));
//        int max = (int) Collections.max(Arrays.asList(number));
//        System.out.println("最小值： " + min);
//        System.out.println("最大值： " + max);
//        Date date = new Date();
//        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
//        System.out.println(sdf.format(date));
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");;
//        Date date = new Date();
//        System.out.println("现在时间： " + sdf.format(date));;

//        Calendar cal = Calendar.getInstance();
//        int day = cal.get(Calendar.DATE);
//        int month = cal.get(Calendar.MONTH) + 1;
//        int year = cal.get(Calendar.YEAR);
//        int dow = cal.get(Calendar.DAY_OF_WEEK);
//        int dom = cal.get(Calendar.DAY_OF_MONTH);
//        int doy = cal.get(Calendar.DAY_OF_YEAR);
//
//        System.out.println("当前时间： " + cal.getTime());
//        System.out.println("日期： " + day);
//        System.out.println("月份： " + month);
//        System.out.println("年份： " + year);
//        System.out.println("一周中的第几天： " + dow);
//        System.out.println("一月中的第几天： " + dom);
//        System.out.println("一年中的第几天： " + doy);
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果： " + sd);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时 mm分ss秒");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("格式化结果： " + sd2);

    }

    public static String removeCharAt(String s, int pos){
        return s.substring(0, pos) + s.substring(pos + 1);
    }

}
