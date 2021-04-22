package ro.ase.csie.cts.g1093.dp.flyweight;

import java.util.ArrayList;

public class Model3DFlyweight implements Model3DInterface{

	String name;
	ArrayList<Integer> points;
	
	public Model3DFlyweight(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display(ScreenData screenDetails) {
		System.out.println(String.format("Displaying %s at coordinates %d, %d, %d with color %s", name,
				screenDetails.x, screenDetails.y, screenDetails.z, screenDetails.textureColor));
		
	}

}
