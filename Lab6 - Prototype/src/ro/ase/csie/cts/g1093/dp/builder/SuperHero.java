package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {

	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	WeaponInterface rightWeapon;
	WeaponInterface leftWeapon;
	
	SuperpowerInterface superPower;
	SuperpowerInterface superSuperPower;
	
	
	public SuperHero() {
		
	}
	
	public SuperHero(String name,
			int lifePoints,
			boolean isVillain,
			boolean isWounded,
			WeaponInterface rightWeapon,
			WeaponInterface leftWeapon,
			SuperpowerInterface superPower,
			SuperpowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightWeapon = rightWeapon;
		this.leftWeapon = leftWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	
	
}
