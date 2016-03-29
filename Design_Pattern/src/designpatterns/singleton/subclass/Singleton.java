package designpatterns.singleton.subclass;

public class Singleton {
	protected static Singleton mInstance;

	protected Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (mInstance == null) {
			mInstance = new Singleton();
		}
		return mInstance;
	}

}
