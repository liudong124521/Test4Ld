import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class drivertest1 {
    private static WebDriver driver;
    private static File file;
    @BeforeTest
    public void beforeMethod() {
        //System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
        file=new File("driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        System.out.println(file.getAbsolutePath());

        driver = new ChromeDriver();//初始化driver
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
    }

    @Test
    public void test_case3() {
        driver.get("http://www.baidu.com");
    }
}
