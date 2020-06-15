package com.framework.utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Constants {
	private static Logger log=LogManager.getLogger(Constants.class);
	
public String getAppUrl()
{
	if(System.getProperty("environment").toLowerCase().contains("qa"))
	{
		log.info("correct url");
		return "http://qa-tekarch.firebaseapp.com";
	}
	else
	{
		log.info("wrong url");
	return "wrong url";
	
	}
	
}
}

