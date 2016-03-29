package designpatterns.singleton.eagerly;

public class Singleton {
	private static Singleton mInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return mInstance;
	}

	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}

}
