package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
	
    //Chrome
    public static final String URL_SDETUniversity = "http://sdetuniversity.com/projects/";
    public static final String WEB_DRIVER_PATH ="C:\\Users\\Asus\\Desktop\\Testing\\Librerias\\chromedriver.exe";
    public static final String WEB_DRIVER_CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver"; 
    public static WebDriver driver;
    public static WebDriverWait driverWait;
    
    //Mozilla Firefox
    public static final String WEB_FF_DRIVER_PATH ="C:\\Users\\Asus\\Desktop\\Testing\\Librerias\\geckodriver.exe";
    public static final String WEB_DRIVER_FF_DRIVER_PROPERTY = "webdriver.gecko.driver"; 
    
    
    // MOFICICAR SEGUN BROWSER SELECCIONADO - CHROME
    public static void setup(){
        ChromeOptions ops = new ChromeOptions();
        //ops.addArguments("--disable-notifications");
        System.setProperty(WEB_DRIVER_CHROME_DRIVER_PROPERTY, WEB_DRIVER_PATH); // --> MODIFICAR ACA
        driver = new ChromeDriver(ops);
        driver.navigate().to(URL_SDETUniversity);
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver,10);
             
        /* FirefoxOptions ops = new FirefoxOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty(WEB_DRIVER_FF_DRIVER_PROPERTY, WEB_FF_DRIVER_PATH);
        driver = new FirefoxDriver(ops);
        driver.navigate().to(URL_TECHNETTS);
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver,10);
        */
    
 }
}