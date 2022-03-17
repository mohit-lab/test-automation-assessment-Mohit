package Utilitypackage;

import Basepackage.Baseclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends Baseclass {

    public static void TakeScreenshottest(String testMethodName) {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:/Users/mohitbisen/IdeaProjects/Icehrmassignment/screenshot"+testMethodName+" "+".jpg"));
        }catch (IOException e){
            System.out.println("exception:"+e);
            e.printStackTrace();
        }
    }
}
