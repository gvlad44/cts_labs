package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;

public class WoundedDecorator extends ACMEDecorator{

	public final static int MIN_POINTS = 200;
	
	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.character.getLifePoints() < MIN_POINTS) {
			System.out.println("Cannot move. Character critically wounded.");
		} else {
			this.character.move();
		}
	}
	
	

}
