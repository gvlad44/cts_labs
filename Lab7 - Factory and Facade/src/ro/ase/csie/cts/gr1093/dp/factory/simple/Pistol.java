package ro.ase.csie.cts.gr1093.dp.factory.simple;

public class Pistol extends AbstractWeapon{

	public Pistol(String color, int powerLevel, int distance) {
		super(color, powerLevel);
		
	}

	@Override
	public void pewPew() {
		System.out.println("Pistol is pew pew");
	}

}
