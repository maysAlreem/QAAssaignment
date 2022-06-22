package PropratiesFileAPI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Proparites {
    public static Properties proparty;
    public static Properties defineAndReadProperties() throws IOException {
        if(proparty==null) {
            FileReader reader = new FileReader("src/main/resources/Xpaths.properties");
            proparty = new Properties();
            proparty.load(reader);
        }

        return proparty;


    }

}
