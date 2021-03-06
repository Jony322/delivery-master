package mx.superstore.web.it.architecture;

import org.apache.log4j.Logger;

public abstract class Architech {

	private static Logger logger;
	
	private Architech() {
		
	}
	
	
	
	public static void Info(String message, Class<?> clazz) {
		logger = Logger.getLogger(clazz);
		logger.info(message);
	}
	
	public static void Error(String message, Class<?> clazz) {
		logger = Logger.getLogger(clazz);
		logger.error(message);
	}
	
	public static void Warn(String message, Class<?> clazz) {
		logger = Logger.getLogger(clazz);
		logger.warn(message);
	}
	
	public static void Debug(String message, Class<?> clazz) {
		logger = Logger.getLogger(clazz);
		logger.debug(message);
	}
}
