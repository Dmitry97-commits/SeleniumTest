import Utils.DriverManager;
import Utils.ResourceUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase{
    public WebDriver webDriver = DriverManager.getChromeDriver();

    @BeforeMethod
    void setupMethod() throws Exception {
        webDriver.get(ResourceUtil.getResources("mainUrl"));
    }

    @AfterMethod
    void teardown() {
        webDriver.quit();
    }
}
