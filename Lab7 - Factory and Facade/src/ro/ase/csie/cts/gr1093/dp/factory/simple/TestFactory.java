package ro.ase.csie.cts.gr1093.dp.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
		
//		AbstractWeapon pistol = new Pistol("black", 100);
//		AbstractWeapon machineGun = new MachineGun("blue");
//		AbstractWeapon bazooka = new Bazooka("green", 1000, 50);
	
		AbstractWeapon weapon = 
				WeaponFactory.getWeapon(WeaponType.PISTOL, "yellow");
		weapon= WeaponFactory.getWeapon(WeaponType.MACHINE_GUN, "red");
		weapon = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "blue");
		
	}

}
