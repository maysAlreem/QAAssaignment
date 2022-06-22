package Handlers;

import Browser.BrowserClass;
import PropratiesFileAPI.Proparites;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Properties;

public class ButtonHandler {
    public static Properties p;
    @When("^Click on (.*)$")
    public void goToNeededPage(String page) throws IOException {
        p= Proparites.defineAndReadProperties();

        BrowserClass.getChromeBrowser().get(URL);
        if (page.equalsIgnoreCase("Home")) {
            String URL= p.getProperty("Home");
            Click
        }
    }
}
