package Utils;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ResourceUtil {
    public static String getResources(String key) throws Exception {
        Properties props=new Properties();
        props.load(new InputStreamReader(Files.newInputStream(Paths.get("src/test/resources/testData.properties"))));
        return props.getProperty(key);
    }
}
