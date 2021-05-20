package ro.ase.csie.cts.g1093.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		Superhero hero = new Superhero("Superman",
				100, "Flying");
		
		HeroMemento initialSave = hero.createRestorePoint();
		
		hero.takesAHit(50);
		hero.takesAHit(20);
		
		System.out.println(hero.lifepoints);
		
		hero.restore(initialSave);
		
		System.out.println(hero.lifepoints);
		
	}

}
