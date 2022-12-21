package Utility;
import java.io.FileInputStream;
import java.util.Properties;

public class TestDataReader {

    public static Properties readProperties(String filename) {
        Properties p = null;
        try {
            FileInputStream fr = new FileInputStream(Constants.PATH + filename);
            p = new Properties();
            p.load(fr);


        } catch (Exception e) {
        }
        return p;
    }
}
