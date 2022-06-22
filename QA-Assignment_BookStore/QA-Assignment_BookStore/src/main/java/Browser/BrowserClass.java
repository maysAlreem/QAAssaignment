package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserClass {
    private static WebDriver ChromeBrowser = null;

    private BrowserClass() {}

    public static WebDriver getChromeBrowser() {
        if (ChromeBrowser == null) {
            synchronized(BrowserClass.class) {
                if (ChromeBrowser == null) {
                    WebDriverManager.chromedriver().setup();
                    ChromeBrowser = new ChromeDriver();
                    ChromeBrowser.manage().window().maximize();
                    ChromeBrowser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                }
            }
        }

        return ChromeBrowser;
    }
    public static void KillDriver(){
        if(getChromeBrowser().equals(null))
            ChromeBrowser=null;
    }
}
