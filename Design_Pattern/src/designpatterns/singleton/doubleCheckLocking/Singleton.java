package designpatterns.singleton.doubleCheckLocking;

public class Singleton {
	// After Java5
	private volatile static Singleton mInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(mInstance == null){
			synchronized(Singleton.class){
				if(mInstance == null) {
					mInstance = new Singleton();
				}
			}
			
		}
		return mInstance;
	}
	
	public String getDescription() {
		return "I'm a double-checked locking Singleton!";
	}
	
}
