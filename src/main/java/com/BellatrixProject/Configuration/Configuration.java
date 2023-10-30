package com.BellatrixProject.Configuration;

import java.io.FileNotFoundException;

import com.BellatrixProject.Utilities.FileUtil;

public class Configuration {

	public String getAppUrl(String env) throws FileNotFoundException  {
		
		FileUtil file = new FileUtil();
         return file.getProperty( "app.url", "/src/main/resources/config.properties");
        
	}
}
