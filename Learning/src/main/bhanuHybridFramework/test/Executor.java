package test;

import java.io.IOException;

import org.apache.log4j.Logger;
 
import testBase.tb;

public class Executor extends tb {
	
	
	
	public static void main(String[] args) throws IOException {
		tb testinstance = new tb();
		log = tb.getLogger(Executor.class);
		log.info("Logger configed");
		log.info("Logger configed");
		log.info("Logger configed");
		log.info("Logger info");
		log.error("Logger info");
		log.debug("Logger data");
		testinstance.getBrowser("chrome");
		driverr.get("https://www.google.com");
		testinstance.getScreenShot();
	}

}
