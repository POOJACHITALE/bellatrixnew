package com.BellatrixProject.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {

	public String getProperty(String key, String filepath) throws FileNotFoundException {

		String basedir = System.getProperty("user.dir"); // user directory for file location its a command
		FileInputStream fis = new FileInputStream(basedir+filepath);
		
		
		Properties prop = new Properties();

		String value = "";
		try {
			prop.load(fis);
			value=	prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}
}
