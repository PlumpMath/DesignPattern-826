package designpatterns.singleton.multiThread;

public class Singleton {
	private static Singleton mInstance;
	
	private Singleton(){}
	// Synchronized will made the poor performance
	// if you call getInstance() frequently
	public static synchronized Singleton getInstance(){
		if(mInstance == null){
			mInstance = new Singleton();
		}
		return mInstance;
	}
	
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
	
}
