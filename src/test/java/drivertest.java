import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//chromedriver放在了chrome安装目录下
public class drivertest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
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
