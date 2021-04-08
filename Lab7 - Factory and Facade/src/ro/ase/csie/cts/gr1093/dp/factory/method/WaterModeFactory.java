package ro.ase.csie.cts.gr1093.dp.factory.method;

import ro.ase.csie.cts.gr1093.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.gr1093.dp.factory.simple.Bazooka;
import ro.ase.csie.cts.gr1093.dp.factory.simple.MachineGun;
import ro.ase.csie.cts.gr1093.dp.factory.simple.Pistol;
import ro.ase.csie.cts.gr1093.dp.factory.simple.WeaponType;

public class WaterModeFactory extends AbstractWeaponFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String color) {
		AbstractWeapon weapon = null;
		switch (type) {
		case PISTOL: {
			weapon = new WaterPistol(color, 100);
			break;
		}
		case MACHINE_GUN: {
			weapon = new WaterBalloon(color, 500);
			break;
		}
		case BAZOOKA: {
			weapon = new WaterBucket(color, 100);
			break;
		}
		default:
			throw new UnsupportedOperationException();
		}

		return weapon;
	}

}
