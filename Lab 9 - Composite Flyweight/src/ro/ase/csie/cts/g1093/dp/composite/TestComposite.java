package ro.ase.csie.cts.g1093.dp.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		AbstractNode group = new Group("Red team");
		group.addNode(new NPC("Soldier1", 100));
		group.addNode(new NPC("Soldier2", 100));
		
		AbstractNode group2 = new Group("Blue team");
		group2.addNode(new NPC("Soldier3", 150));
		group2.addNode(new NPC("Tank", 300));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("Level Boss", 500));
		levelGroup.addNode(group);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		
		levelGroup.getNode(0).move();
		
	}
	
}
