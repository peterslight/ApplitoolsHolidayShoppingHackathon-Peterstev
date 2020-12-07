import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppliFashionTest {

    final static String API_KEY = System.getenv("APPLITOOLS_API_KEY");
    final static String URL_PRODUCTION_V1 = "https://demo.applitools.com/tlcHackathonMasterV1.html";
    final static String URL_DEV = "http://demo.applitools.com/tlcHackathonDev.html";
    final static String URL_PRODUCTION_V2 = "https://demo.applitools.com/tlcHackathonMasterV2.html";
    private static WebDriver driver;
    private static VisualGridRunner runner;
    private static Eyes eyes;

    @BeforeAll
    public static void setupTests() {
        System.setProperty("webdriver.chrome.driver", "E:\\programs\\chromedriver.exe");
        driver = new ChromeDriver();
        runner = new VisualGridRunner(3);
        eyes = new Eyes(runner);
        setUpEyes(eyes, driver);
    }

    @Test
    @Order(1)
    public void mainPageTest() {
        eyes.open(driver, "AppliFashion", "Test 1", new RectangleSize(1200, 800));
        eyes.check("main page", Target.window().fully());
    }

    @Test
    @Order(2)
    public void filterProduct() {
        eyes.open(driver, "AppliFashion", "Test 2", new RectangleSize(1200, 800));
        //check the black option
        driver.findElement(By.id("SPAN__checkmark__107")).click();
        //click filter button
        driver.findElement(By.id("filterBtn")).click();
        eyes.check("filter by color", Target.region(By.id("product_grid")));
    }

    @Test
    @Order(3)
    public void getProductDetail() {
        eyes.open(driver, "AppliFashion", "Test 3", new RectangleSize(1200, 800));
        driver.findElement(By.id("DIV__colcolmd__210")).click();
        eyes.check("product details", Target.window().fully());
    }

    @AfterEach
    public void resetEyes() {
        try {
            eyes.closeAsync();
        } finally {
            eyes.abortAsync();
        }
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        TestResultsSummary allTestResults = runner.getAllTestResults(false);
        print(allTestResults);
    }

    private static void setUpEyes(Eyes eyes, WebDriver driver) {
        //init eyes configuration
        Configuration config = new Configuration();
        config.setApiKey(API_KEY);

        // create a new batch info instance and set it to the configuration
        config.setBatch(new BatchInfo("Holiday Shopping"));

        // Add browsers with different viewports
        config.addBrowser(1200, 800, BrowserType.CHROME);
        config.addBrowser(1200, 800, BrowserType.FIREFOX);
        config.addBrowser(1200, 800, BrowserType.EDGE_CHROMIUM);
        config.addBrowser(1200, 800, BrowserType.SAFARI);
        config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);

        config.setMatchLevel(MatchLevel.STRICT);

        eyes.setConfiguration(config);

        driver.get(URL_PRODUCTION_V2);
    }

    static void print(Object message) {
        System.out.println(message);
    }
}
