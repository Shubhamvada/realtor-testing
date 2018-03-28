package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class BrowserInit extends EventFiringWebDriver {

    public BrowserInit() {
        super(BROWSER);
    }

    public static WebDriver BROWSER = null;
    private static String browser = System.getProperty("browserName");

    static {
        switch (browser) {
            case "chrome":
                BROWSER = new ChromeDriver();
                BROWSER.manage().timeouts()
                        .implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "firefox":
                BROWSER = new FirefoxDriver();

                BROWSER.manage().timeouts()
                        .implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "ie":
                BROWSER = new InternetExplorerDriver();
                BROWSER.manage().timeouts()
                        .implicitlyWait(40, TimeUnit.SECONDS);
                break;
            default:
                System.out.println("THIS IS RUNNING ON DEFAULT BROWSER MODE!");
                BROWSER = new FirefoxDriver();
                BROWSER.manage().timeouts()
                        .implicitlyWait(10, TimeUnit.SECONDS);
        }
        
        BROWSER.manage().deleteAllCookies();
        BROWSER.manage().windows().maximize();

    }

     @AfterClass
     {
         BROWSER.close();
     }
}
