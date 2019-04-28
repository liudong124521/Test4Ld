import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

    public class FirefoxdriverTest {
    WebDriver driver;
    @BeforeTest
    public void beforeMethod() {
        System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
        driver = new FirefoxDriver();//初始化driver
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
