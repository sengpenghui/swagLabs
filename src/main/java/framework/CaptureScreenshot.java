package framework;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaptureScreenshot {
    public  WebDriver driver;
    public CaptureScreenshot(WebDriver driver) {
        this.driver = driver;
    }

//    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    String time = dateFormat.format(Calendar.getInstance().getTime());

    public void getScreenshot() {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(src, new File("Screenshots\\Screenshots" + time + ".png"));
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
