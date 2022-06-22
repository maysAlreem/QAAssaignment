package HomePagePackage;

import Browser.BrowserClass;
import PropratiesFileAPI.Proparites;
import io.cucumber.java.en.*;

import java.io.IOException;
import java.util.Properties;

public class HomePageClass {

    public static Properties p;
    @Given("Open Browser")
    public void Open_Browser() throws IOException {
       p= Proparites.defineAndReadProperties();
        String URL= p.getProperty("URl");
        BrowserClass.getChromeBrowser().get(URL);
    }


}
