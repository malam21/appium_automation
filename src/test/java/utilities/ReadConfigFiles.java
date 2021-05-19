package utilities;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFiles {


    private static final Logger LOGGER = LoggerFactory.getLogger(ReadConfigFiles.class.getName());

    public static String getPropertyValue(String propName) {

        Properties prop;
        String propValue = null;

        try {
            prop = new LoadConfigFiles().readPropertyValues();
            propValue = prop.getProperty(propName);
        } catch (Exception e) {
            LOGGER.error("Exception is: " + e.getMessage());
            System.out.println();
        }
        return propValue;
    }

}












//----------------------------------------------------------------------------------
//private static final Logger LOGGER = LogManager.getLogger(ReadConfigFiles.class);
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;