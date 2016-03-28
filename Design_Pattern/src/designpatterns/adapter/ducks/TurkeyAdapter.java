package designpatterns.adapter.ducks;

public class TurkeyAdapter implements Duck {

	Turkey mTurkey;
	
	public TurkeyAdapter(Turkey mTurkey) {
		this.mTurkey = mTurkey;
	}

	@Override
	public void quack() {
		mTurkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			mTurkey.fly();
		}
	}
}
