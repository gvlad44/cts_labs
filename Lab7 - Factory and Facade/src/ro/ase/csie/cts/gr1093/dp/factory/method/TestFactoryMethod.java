package ro.ase.csie.cts.gr1093.dp.factory.method;

import ro.ase.csie.cts.gr1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.gr1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.gr1093.dp.factory.simple.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args) {

		boolean isWaterModeSet = true;

		if (isWaterModeSet) {
			// water base weapons
			AbstractWeapon pistol = new WaterPistol("white", 200);
		} else {
			AbstractWeapon pistol = new Pistol("white", 200, 100);
		}
		
		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new WaterModeFactory() : new RealModeFactory();
		
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
		
		
	}

}
