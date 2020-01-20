
public class Foo extends Thread{
	int number;
	public Foo(int n){
		number = n;
		start();
	}
	
	public void run() {
		Logger logger = FileLogger.getFileLogger();
		logger.log("Foo number "+number+" logs a message");
	}
}
