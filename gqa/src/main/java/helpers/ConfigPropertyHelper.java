package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropertyHelper {
static Properties properties = new Properties();
static String configValue = null;

public static String getConfiguration(String configKey) {
	try {
		FileInputStream file = new FileInputStream("config.properties");
		properties.load(file);
		file.close();
		configValue = properties.getProperty(configKey);
	}
	catch(IOException e) {
		
	}
	return configValue;
}
}
