package designpatterns.adapter.ducks;

import java.util.Random;

public class DuckAdapter implements Turkey {

	Duck mDuck;
	Random rand;

	public DuckAdapter(Duck mDuck) {
		this.mDuck = mDuck;
		rand = new Random();
	}

	@Override
	public void gobble() {
		mDuck.quack();

	}

	@Override
	public void fly() {
		if (rand.nextInt(5) == 0) {
			mDuck.fly();
		}

	}

}
