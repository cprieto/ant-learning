package com.cprieto;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloWorld {
	static Logger logger = LogManager.getLogger(HelloWorld.class);

	public static void main(String args[]) {
		logger.info("Hello world");
	}
}
