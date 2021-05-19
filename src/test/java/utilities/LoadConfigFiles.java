package utilities;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadConfigFiles {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoadConfigFiles.class.getName());

    public Properties readPropertyValues() throws IOException {

        Properties prop = new Properties();
        InputStream inputStream = null;
        try {
            String propFileName = "config.properties";
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("Property file: " + propFileName + "not found in the classpath");
            }

        } catch (Exception e) {
            LOGGER.error("Exception is: " + e.getMessage());
        } finally {
            inputStream.close();
        }
        return prop;
    }
}













//-----------------------------------------------------------------------------------
//private static final Logger LOGGER= LogManager.getLogger(LoadConfigFiles.class);
//import page_objects.TestMode_Pages.SpeakerLightBarPowerTestPage;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;