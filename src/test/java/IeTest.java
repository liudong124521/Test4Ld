import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

    public class IeTest {
    WebDriver driver;
    @BeforeTest
    public void beforeMethod() {
        System.setProperty("webdriver.ie.driver","driver\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();//初始化driver
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
