package CommanPages;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {
    static Properties prop;
    static FileInputStream file;
    static String fileLocation = ("C:\\Users\\sidgo\\IdeaProjects\\Hybiredfreamwork\\src\\test\\resources\\TestData\\config.properties");

    public String getProperty(String keyName) {
        prop = new Properties();
        try {
            file = new FileInputStream(fileLocation);
            prop.load(file);
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }


        return prop.getProperty(keyName);
    }


}
