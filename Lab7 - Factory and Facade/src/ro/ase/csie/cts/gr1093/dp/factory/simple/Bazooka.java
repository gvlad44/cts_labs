package ro.ase.csie.cts.gr1093.dp.factory.simple;

public class Bazooka extends AbstractWeapon{

	public Bazooka(String color, int powerLevel, int distance) {
		super(color, powerLevel);
		
	}

	@Override
	public void pewPew() {
		System.out.println("Bazooka is pew pew");
	}

}
