
public class SingletonLogger {
	//Eager initialization
	//private static SingletonLogger instance = new SingletonLogger();
	
	private static SingletonLogger instance;
	
	private SingletonLogger() {
		
	}
	
	public static SingletonLogger getInstance() {
		if(instance == null) {
			synchronized (SingletonLogger.class) {
				if(instance == null) {
					instance = new SingletonLogger();
				}	
			}	
		}
		return instance;
	}
	
	public void logMessageStart() {
		System.out.println("Start message is logged");
	}
	
	public void logMessageStop() {
		System.out.println("Stop message is logged");
	}
}
