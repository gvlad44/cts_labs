package ro.ase.csie.cts.gr1093.dp.factory.simple;

public class MachineGun extends AbstractWeapon{

	public MachineGun(String color) {
		super(color, 500);
	}

	@Override
	public void pewPew() {
		System.out.println("Machine gun is pew pew");
	}

}
