package Basepackage;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class Baseclass {
    static public WebDriver driver;
@Parameters("browser")
@BeforeTest
    public void initialize(String browser)
    {

        WebDriverManager.chromedriver().setup();

        if (browser.equalsIgnoreCase("firefox")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://icehrm-open.gamonoid.com/login.php");

    }


}
