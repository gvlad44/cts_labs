package ro.ase.csie.cts.g1093.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Char3DModel implements Cloneable{
	CharacterType type;
	String color;
	
	ArrayList<Integer> graphicPoints = new ArrayList<>();

	public Char3DModel(CharacterType type, String color) {
		this.type = type;
		this.color = color;
		System.out.println("Generating the 3d model.....");
		
		try {
			Thread.sleep(2000);
			Random random = new Random(7887);
			for(int i =0;i<20;i++) {
				graphicPoints.add(random.nextInt(1000));
			}
			
			System.out.println("Model loaded");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private Char3DModel() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// NEVER DO THIS
		// Char3DModel copy = new Char3DModel(type, color);
		
		Char3DModel copy = new Char3DModel();
		copy.type = this.type;
		copy.color = this.color;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		
		return copy;
	}

	
}
