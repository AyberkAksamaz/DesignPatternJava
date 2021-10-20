
public class Main {

	public static void main(String[] args) {
		SingletonLogger singletonLogger = SingletonLogger.getInstance();
		singletonLogger.logMessageStart();
		singletonLogger.logMessageStop();
		singletonLogger.logMessageStart();
	}

}
