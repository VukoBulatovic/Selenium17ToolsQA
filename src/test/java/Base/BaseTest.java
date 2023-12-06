package Base;

import Pages.HomePage;
import Pages.SidebarPage;
import Pages.TextboxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static HomePage homePage;
    public static SidebarPage sidebarPage;
    public static TextboxPage textboxPage;


    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        homePage = new HomePage(driver,wait);
        sidebarPage = new SidebarPage(driver,wait);
        textboxPage = new TextboxPage(driver,wait);

    }



}
