package designpatterns.singleton.classic;

public class Singleton {
	private static Singleton mInstance;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(mInstance == null){
			mInstance = new Singleton();
		}
		return mInstance;
	}
	
	public String getDescription() {
		return "I'm a classic Singleton!";
	}
	
}
