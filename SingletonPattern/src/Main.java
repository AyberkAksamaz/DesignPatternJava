
public class Main {

	public static void main(String[] args) {
		SingletonLogger singletonLogger = SingletonLogger.getInstance();
		singletonLogger.logMessageStart();
		singletonLogger.logMessageStop();
		singletonLogger.logMessageStart();
		
		SingletonLogger singletonLogger2 = SingletonLogger.getInstance();
		singletonLogger2.logMessageStart();
		singletonLogger2.logMessageStop();
		singletonLogger2.logMessageStart();
	}

}
