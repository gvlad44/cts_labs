package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;

public abstract class ACMEDecorator extends ACMECharacter{
	
	ACMECharacter character = null;
	
	public ACMEDecorator(ACMECharacter hero) {
		super(hero.getName(), hero.getLifePoints());
		this.character = hero;
	}
	
	
	@Override
	public int getLifePoints() {
		return this.character.getLifePoints();
	}



	@Override
	public void move() {
		this.character.move();
		
	}

	@Override
	public void takeAHit(int points) {
		this.character.takeAHit(points);
		
	}

	@Override
	public void heal(int points) {
		this.character.heal(points);
		
	}
	
	

	
}
