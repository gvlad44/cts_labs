package ro.ase.csie.cts.gr1093.dp.factory.simple;

public abstract class AbstractWeapon {
	
	String color;
	int powerLevel;
	
	public AbstractWeapon(String color, int powerLevel) {
		super();
		this.color = color;
		this.powerLevel = powerLevel;
	}
	
	public abstract void pewPew();
	
}
